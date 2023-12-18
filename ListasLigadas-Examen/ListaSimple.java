public class ListaSimple{
    Node top;
    
    public boolean insertaPrimerNodo (int dato){
        if (top == null){
            top = new Node();
            top.name = dato;
            top.next = null;
            
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarAntesPrimero (int dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        temp.next = this.top;
        this.top = temp;
        temp = null;
        
    }
    
    public void insertarAlFinal(int dato){
        Node temp = new Node();
        temp.name = dato;
        temp.next = null;
        Node temp2 = this.top;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        
        temp = null;
        temp2 = null;
    }
    
    public void imprimirLista(){
        
        for (Node temp = this.top; temp != null; temp = temp.next){
            System.out.print("[ " + temp.name + " ] -> ");
        }
        
        System.out.print("[X]\n");
    }
    
    public void mostrarSigteSigte(){
        Node temp = this.top;
        
        System.out.print(temp.next.next.name);
        
    }
    
    // Ejercicio 2
    public void eliminarPrimero(){
        this.top = this.top.next;
    }
    
    // Ejercicio 2
    public void eliminarUltimo(){
        Node temp = this.top;
        
        while (temp.next.next != null){
            temp = temp.next;
        }
        
        temp.next = null;
    }
    
    // Ejercicio 3
    public void ejercicio3 (){
        Node temp = this.top.next.next;
        top.next.next.next = top.next;
        top.next.next = null;
        top = temp;
        temp = null;
    }
    
    // Ejercicio 4
    public void insertar95 (int dato){
        Node temp = new Node();
        Node temp2 = this.top;
        temp.name = dato;
        temp.next = temp2.next.next;
        
        
        while ((temp2.name < dato) && (temp2.next.name < dato)){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        
        temp = null;
        temp2 = null;
    }
}
