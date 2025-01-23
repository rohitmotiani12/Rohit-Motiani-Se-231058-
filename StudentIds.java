public class StudentIds {
    Node head;
    class Node {
        int data;
       Node next ;
       Node(int data) {
             this.data=data;
            this.next=null;
        }
    }
    public void insert(int data) {
        Node newNode=new Node(data);
         newNode.next=head;
        head =newNode;
    }
    public void print() {
        Node current=head;
         while (current !=null) {
            System.out.print(current.data + " -> ");
              current =current.next;
        }
        System.out.println("null");
    }
    public int length()
    {
          int count=0;
          Node current=head;
         while (current !=null) {
            count=count +1;
            current=current.next;
        }
         return count;
    }
    public void deleteFirst() {
           if (head == null) {
               System.out.println("empty");
            return;
        }
        head =head.next;
    }
    public Integer findAtPosition(int index) {
         Node current =head;
        for (int count =0; current !=null; count=count+1, current = current.next) {
            if (count ==index)
                return current.data;
        }
        System.out.println("Invalid");
        return null;
    }
    public StudentIds merge(StudentIds other) {
        StudentIds mergedList =new StudentIds();
        Node current1 = this.head;
                  Node current2 = other.head;
        while (current1 != null || current2 != null) {
            if (current1 == null) {
                  mergedList.insert(current2.data);
                current2 = current2.next;
            }
            else if (current2 == null) {
                  mergedList.insert(current1.data);
                current1 = current1.next;
            }
            else if (current1.data <= current2.data) {
                mergedList.insert(current1.data);
                    current1 = current1.next;
            } else
            {
                  mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }
          return mergedList;
    }
    public StudentIds reverse()
    {
        StudentIds reversedList =new StudentIds();
          Node current =head;
        while (current != null)
        {
             reversedList.insert(current.data);
            current = current.next;
        }
          return reversedList;
    }
    public static void main(String[] args)
    {
        StudentIds std = new StudentIds();
         std.insert(9900);
          std.insert(9901);
         std.insert(9902);
         std.insert(9903);
        System.out.println("Original List:");
        std.print() ;
           System.out.println("Length of list: " + std.length());
           std.deleteFirst();
        System.out.println("After deleting");
         std.print();
          System.out.println("Student ID at position 1: " + std.findAtPosition(1));
         StudentIds otherList = new StudentIds();
         otherList.insert(9999);
           otherList.insert(9905);
          otherList.insert(9906);
         StudentIds mergedList = std.merge(otherList);

        System.out.println("Merged List:");
        mergedList.print();
          System.out.println("Original List:");
        std.print();
 StudentIds reversedList = std.reverse();
        System.out.println("Reversed List:");
         reversedList.print();
    }
}