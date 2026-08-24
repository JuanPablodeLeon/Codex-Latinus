package org.example.Semantico;

import org.example.Interpreter.Reports.ErrorLatinus;

import java.util.Objects;

public class Tipos {

    public enum TiposBase{
        NUMERUS, DECIMALIS, TEXTUM, LITTERA, BOOL,
        VOID,
        SERIRES,
        STRUCT,
        ERROR
    }

    public final TiposBase tb;
    public final Tipos elemnts;
    public final String nameStruc;

    private Tipos(TiposBase tb, Tipos elemnts, String nameStruc) {
        this.tb = tb;
        this.elemnts = elemnts;
        this.nameStruc = nameStruc;
    }

    public static final Tipos NUMERUS = new Tipos(TiposBase.NUMERUS, null, null);
    public static final Tipos DECIMALIS = new Tipos(TiposBase.DECIMALIS, null, null);
    public static final Tipos TEXTUM = new Tipos(TiposBase.TEXTUM, null, null);
    public static final Tipos LITTERA = new Tipos(TiposBase.LITTERA, null, null);
    public static final Tipos BOOL = new Tipos(TiposBase.BOOL, null, null);
    public static final Tipos VOID = new Tipos(TiposBase.VOID, null, null);
    public static final Tipos ERROR = new Tipos(TiposBase.ERROR, null, null);

    public static Tipos series(Tipos elemnts){
        return new Tipos(TiposBase.SERIRES, elemnts, null);
    }

    public static Tipos struct(String name){
        return new Tipos(TiposBase.STRUCT, null, name);
    }

    public boolean isPrimivite(){
        return tb == TiposBase.NUMERUS || tb == TiposBase.DECIMALIS || tb == TiposBase.TEXTUM || tb == TiposBase.LITTERA || tb == TiposBase.BOOL;
    }

    public boolean isError(){
        return tb == TiposBase.ERROR;
    }

    public boolean isNumber(){
        return tb == TiposBase.NUMERUS || tb == TiposBase.DECIMALIS;
    }

    //Jerarquia para tomar tipo en var duplicada
    public int jerarquia(){
        switch (tb){
            case TEXTUM: return 5;
            case DECIMALIS: return 4;
            case NUMERUS: return 3;
            case LITTERA: return 2;
            case BOOL: return 1;
            default : return -1;
        }
    }

    //Devuelve el de mayor jearquia
    public static Tipos typeResult(Tipos a, Tipos b){
        if (a.isError() || b.isError()) return ERROR;
        if (!a.isPrimivite() || !b.isPrimivite()) return ERROR;
        return a.jerarquia() >= b.jerarquia() ? a : b ;
    }

    public static boolean isAssigImpl(Tipos dest, Tipos orig){
        if (dest.isError() || orig.isError()) return true;

        if (dest.tb == TiposBase.SERIRES && orig.tb == TiposBase.SERIRES){
            return isAssigImpl(dest.elemnts, orig.elemnts);
        }

        if(dest.tb == TiposBase.STRUCT && orig.tb == TiposBase.STRUCT){
            return Objects.equals(dest.elemnts, orig.elemnts);
        }

        if (!dest.isPrimivite() || !orig.isPrimivite()){
            return dest.tb == orig.tb;
        }

        //Para acpetar concatenacion de string
        // no puede ser un primero no textum directo
        if (dest.tb == TiposBase.TEXTUM) return true;
        if (orig.tb == TiposBase.TEXTUM) return dest.tb == TiposBase.TEXTUM;

        return dest.jerarquia() >= orig.jerarquia();
    }

    @Override
    public String toString() {
        switch (tb){
            case SERIRES : return "series <"+elemnts+">";
            case STRUCT: return nameStruc;
            default: return tb.name().toLowerCase();
        }
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (!(o instanceof Tipos)) return false;

        Tipos t = (Tipos) o;

        if (tb != t.tb) return false;

        if(tb == TiposBase.SERIRES) return  Objects.equals(elemnts, t.elemnts);
        if (tb == TiposBase.STRUCT) return Objects.equals(elemnts, t.elemnts);
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(tb, elemnts, nameStruc);
    }

}
