public class ListaDoble
{
    Node topForward;
    Node topBackward;
    
    public boolean insertaPrimerNodo (String dato){
        if (topForward == null){
            topForward = new Node();
            topForward.name = dato;
            topForward.next = null;
            topForward.prev = null;
            
            topBackward = topForward;
            
            return true;
        }else{
            return false;
        }
    }
    
    // Insertar L
    public void insertarL (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        this.topForward.next = temp;
        temp.prev = this.topForward;
        temp.next = null;
        temp = null;
    }
    
    // Insertar T
    public void insertarT (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp.prev = null;
        temp.next = null;
        temp = null;
    }
    
    // Insertar O Final
    public void insertarOFinal (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.name.equals("T") == false){
            temp2 = temp2.next;
        }
        
        temp.prev = temp2;
        this.topBackward = temp;
        temp.next = null;
        temp = null;
    }
    
    // Insertar O1
    public void insertarO1 (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp2.prev = temp;
        temp.next = null;
        temp.prev = null;
        temp = null;
    }
    
    // Insertar D
    public void insertarD (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp.next = null;
        temp.prev = null;
        temp = null;
    }
    
    // Insertar O2
    public void insertarO2 (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp.next = null;
        temp.prev = temp2;
        temp = null;
    }
    
    // Insertar E
    public void insertarE (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.name.equals("O") == false){
            temp2 = temp2.next;
        }
        
        temp2.prev = temp;
        
        while (temp2.name.equals("D") == false){
            temp2 = temp2.next;
        }
        
        temp2.prev = temp;
        
        while (temp2.name.equals("O") == false){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp.next = null;
        temp.prev = null;
        temp = null;
    }
    
    // Insertar S
    public void insertarS (String dato){
        Node temp;
        temp = new Node();
        temp.name = dato;
        Node temp2 = this.topForward;
        
        while (temp2.next != null){
            temp2 = temp2.next;
        }
        
        temp2.next = temp;
        temp2.prev = temp;
        temp.prev = this.topForward;
        temp.next = null;
        temp = null;
    }
    
    public void imprimirLista() {
        Node temp = this.topForward;
        Node temp2 = this.topForward;
        while (temp != null) {
            if (temp.name.equals("A")){
                System.out.print("[" + temp.name + "]");
                while (temp2.name.equals("S") == false){
                    temp2 = temp2.next;
                }
                if (temp2.name.equals("S")){
                    System.out.print(" ←");
                    System.out.println("  [" + temp2.name + "]");
                    temp2 = this.topForward;
                }
                System.out.println("↑ ↓     ↑ ↑");
            }
            if (temp.name.equals("L")){
                System.out.print("[" + temp.name + "]");
                while (temp2.name.equals("E") == false){
                    temp2 = temp2.next;
                }
                if (temp2.name.equals("E")){
                    System.out.println("     [" + temp2.name + "]");
                    System.out.println("  ↓    ↗  ↑ ↖");
                    temp2 = this.topForward;
                }
            }
            if (temp.name.equals("T")){
                System.out.print("[" + temp.name + "]");
                System.out.print("⇉");
                while (temp2.name.equals("O") == false){
                    temp2 = temp2.next;
                }
                if (temp2.name.equals("O")){
                    System.out.print("[" + temp2.name + "]");
                    System.out.print("→");
                    temp2 = this.topForward;
                }
                
                while (temp2.name.equals("D") == false){
                    temp2 = temp2.next;
                }
                if (temp2.name.equals("D")){
                    System.out.print("[" + temp2.name + "]");
                    System.out.print("⇄");
                    temp2 = this.topForward;
                }
                
                while ((temp2.name.equals("O") == false) &&! (temp2.next.name.equals("E"))){
                    temp2 = temp2.next;
                }
                if (temp2.name.equals("O")){
                    System.out.println("[" + temp2.name + "]");
                    temp2 = this.topForward;
                }
            }
            temp = temp.next;
        }
            System.out.println("↑");
            System.out.println("[" + this.topBackward.name + "]");
    }

    
    // Ejercicio 1
    public void ejercicio1 (){
        Node aux = this.topBackward.prev.prev;
        while (aux.next != null){
            System.out.print(aux.name);
            aux = aux.next;
        }
    }
    
    // Ejercicio 2
    public void ejercicio2 (){
        this.topForward.prev = this.topBackward;
        Node aux = this.topForward;
        while (aux.prev != null){
            System.out.print(aux.name);
            aux = aux.prev;
        }
    }
    
    // Ejercicio 3
    public void ejercicio3 (){
        this.topForward.next.prev = null;
        this.topForward.next = this.topForward.next.next;
    }

}