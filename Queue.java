 public static class  Q{ // in this we define array through whihc we will i,plement queue
        static  int arr[];// havent intiaxlize because we dont knwo its size we knwo its size when we make its constructer
   static int size;// create to store that size
   static int rear=-1;
    Q(int size){
        arr= new int[arr];
        this.size=size;//taken size from here and give to size at line 4
    }
    public static boolean isEmpty() {
        if (rear == -1) {
            return -1;
        }
    }
// enqueue  or insertion or add
        public static void add ( int data){// int data wo data h jo store krna h quque ma
            if (rear == size - 1) { // to check before insertion is this full ?
                System.out.println("full");
                return;
            }
            rear++; // rear ko aik agay kia
            arr[rear] = data;
        }
        // dequeue or remove
        public static int remove ()
        { // return type int is ;
            // ia h ke hume ;ata chale ke konsa return hua h wo delhne ya acesh krrke dekhne ke lia
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0]; //for deletion we aces front or zero index
            for (int i = 0; i < rear; i = i + 1) { // humne loop is lie lagyaa ke  do front se element delete hua to  front index ki increment krenege to increment krte rhenge last tk
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
    }
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return arr[0]; // in peek we just see  list to empty nhi h agar h to -1 dega gar nhi h to just hume de dega arr[o] mtlab front ki value
        }
    }
    public static void main (String args[]){
        Q q= new Q(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(44);
// tp  peek array unitl wo empty ni ho jata
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }

