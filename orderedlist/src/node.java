public class node {
    int data;
    String name;
    node next;
}
class linkme{
    node front;
    void init(){
        front = null;
    }
    public node makenode(String name, int number){
        node m;
        m = new node();
        m.data = number;
        m.name = name;
        m.next = null;
        return m;
    }
    public node findtail(){
        node current;
        current = front;
        while(current.next!= null){
            current = current.next;
        }
        return current;
    }
    public void addtotheend( String name, int data){
        node tail;
        if(front==null) {
            front = makenode(name ,data);
        }else{
            tail = findtail();
            tail.next = makenode(name ,data);
        }

    }
    public void buildsimple(String name, int m){
        node tail;
        int j;
        init();
        for(j=0; j<m; j++){
            addtotheend(name,j);
        }
    }
    public void insert(String name, int num){
       node curr , temp, prev;
       boolean searching ;
        if (front == null) {
            front = makenode(name, num);
            return ;
        }
       if (num< front.data){
           temp = makenode(name, num);
           temp.next = front;
           front = temp;
       }
       else {
           curr = front;
           prev = curr;
           searching = true;

       while (searching ){
           if (curr.data == num){
               System.out.println("duplicate");
                 searching = false;
                } else if (curr.data < num) {
                       if (curr.next == null){
                            curr.next = makenode(name,num);
                            searching = false;
                        } else {
                            prev = curr;
                            curr  = curr.next;
                        }

           }
           else if (curr.data > num){
               temp = makenode(name,num);
               temp.next = curr;
               prev.next = temp;
               searching = false;
           }
       }
       }

    }
    node findSpot(String name){
        node current, prev;
        current = front;
        prev = current;
        while(!current.name.equals(name)){
            prev = current;
            current= current.next;
        }
        System.out.println(current.name + " HAS BEEN DELETED!!!!!!!!");
        return prev;
    }

    public void deleteafter(node spot){
        node nextnode;
        if (spot.next != null){
        nextnode = spot.next;
        spot.next = nextnode.next;
    }
    else {
            System.out.println("cant print ");
        }
    }
    public void showlist(){
        node current;
        current = front;
        while (current!=null){
            System.out.println(current.name);
            current = current.next;
        }
    }

    public void listcount(){
        node current = front;
            int count = 0;
            if (current==null){
                System.out.println("empty");
            }
            else{
                while(current.next!=null){
                    ++count;
                    current = current.next;
                }
            }System.out.println("There are " + count + " Names in this list after deletion");
        }

}
