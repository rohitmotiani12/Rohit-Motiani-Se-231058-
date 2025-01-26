class CLL {
      Node head;
    class Node {
         String data;
        Node next;

        Node(String data) {
              this.data = data;
            this.next = null;
        }
    }
     public void addFirst(String data) {
         Node newNode = new Node(data);
        if (head == null) {
             head = newNode;
            newNode.next = head;
        }  else
        {
            Node temp = head;
              while (temp.next != head) {
                temp = temp.next;
            }
             temp.next = newNode;
             newNode.next = head;
            head = newNode;
        }
    }
       public void addLast(String data) {
        Node newNode = new Node(data);
        if (head ==null) {
            head =newNode;
            newNode.next =head;
        } else {
            Node currNode=head;
            while (currNode.next !=head) {
                currNode =currNode.next;
            }
            currNode.next=newNode;
            newNode.next =head;
        }
    }
    public void printList() {
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        Node currNode=head;
        do {
            System.out.print(currNode.data + " --> ");
            currNode=currNode.next;
        } while (currNode !=head);
        System.out.println("HEAD");
    }
    public void deleteFirst() {
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next==head) {
            head = null;
        } else
        {
            Node temp=head;
            while (temp.next !=head) {
                temp=temp.next;
            }
            head =head.next;
            temp.next =head;
        }
    }
    public void deleteLast() {
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        if (head.next==head) {
            head=null;
            return;
        }
        Node secondLast=head;
        while (secondLast.next.next !=head) {
            secondLast =secondLast.next;
        }
        secondLast.next =head;
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.addFirst("is");
        list.printList();
         list.addLast("List");
         list.printList();
        list.addFirst("This");
         list.printList();
         list.deleteFirst();
          list.printList();
         list.deleteLast();
        list.printList();
    }
}

