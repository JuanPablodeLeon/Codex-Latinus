package org.example.Ejecutores;


public class PruebaEjecucion {
    public static void main(String[] args) {
        String programa = """
                VARIABILES >
                esto x : numerus 0;
                //total : numerus 0;
                esto nombre : textum "Codex";
                series notas [3] : numerus;
                //y : numerus 0;
                
                                MUNERA >
                                actio saluda() {
                                } finis;
                
                                MAIOR >
                                >> "Hola desde " + nombre;
                
                                si (verum && non falsus) {
                                    >> "logica booleana OK";
                                } finis;
                                >> notas;
                                FINIS;
                """;

        Ejecutor ejecutor = new Ejecutor();
        boolean ok = ejecutor.ejecuar(programa);

        System.out.println("=== TOKENS (primeros) reconocidos correctamente: " + ok + " ===");
       /* if (!ejecutor.getTodosLosErrores().isEmpty()) {
            System.out.println("=== ERRORES ===");
            for (ErrorLatinus e : ejecutor.getTodosLosErrores()) {
                System.out.println(e);
            }
        }*/
        System.out.println("=== SALIDA DEL PROGRAMA ===");
        System.out.println(ejecutor.getConsola());
    }
}
