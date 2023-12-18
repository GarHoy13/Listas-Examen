public class Main
{
    public static void main (String[] args){
        ListaDoble lista = new ListaDoble();
        
        System.out.println("Lista: ");
        lista.insertaPrimerNodo("A");
        lista.insertarL("L");
        lista.insertarT("T");
        lista.insertarOFinal("O");
        lista.insertarO1("O");
        lista.insertarD("D");
        lista.insertarO2("O");
        lista.insertarE("E");
        lista.insertarS("S");
        lista.imprimirLista();
        System.out.println("\n");
        
        System.out.println("Ejercicio 1:");
        lista.ejercicio1();
        System.out.println("\n");
        
        // Al eliminar la L, tambien se elimina la E debido a la dificultad para imprimir la lista de la misma forma que en el examen
        System.out.println("Ejercicio 3:");
        lista.ejercicio3();
        System.out.println("\n");
        
        lista.imprimirLista();
        
        System.out.println("Ejercicio 2:");
        lista.ejercicio2();
        System.out.println("\n");
        
    }
}

