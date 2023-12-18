public class Main
{
    public static void main (String[] args){
        ListaSimple lista = new ListaSimple();
        
        System.out.println("Lista inicial:");
        lista.insertaPrimerNodo(101);
        lista.insertarAntesPrimero(93);
        lista.insertarAntesPrimero(25);
        
        lista.imprimirLista();
        System.out.print("\n");
        
        System.out.print("Ejercicio 1: ");
        lista.mostrarSigteSigte();
        System.out.println("\n");
        
        System.out.println("Ejercicio 2: ");
        System.out.println("Eliminar primero: ");
        lista.eliminarPrimero();
        lista.imprimirLista();
        System.out.print("\n");
        
        lista.insertarAntesPrimero(25);
        
        System.out.println("Eliminar último: ");
        lista.eliminarUltimo();
        lista.imprimirLista();
        System.out.print("\n");
        
        lista.insertarAlFinal(101);
        
        System.out.println("Ejercicio 3: ");
        lista.ejercicio3();
        lista.imprimirLista();
        System.out.print("\n");
        
        lista.eliminarUltimo();
        lista.insertarAntesPrimero(93);
        lista.insertarAntesPrimero(25);
        
        System.out.println("Ejercicio 4: ");
        lista.insertar95(95);
        lista.imprimirLista();
        System.out.print("\n");
    }
}
