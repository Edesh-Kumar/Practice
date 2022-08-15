package dataStructures.linkedlist;

import java.util.Vector;

public class Driver {
    public static void printSecondLastNode(Node<Integer> head){
        Node<Integer> prev = head;
       while (prev.next!= null){

           if(prev.next.next.next==null) {
               System.out.println(prev.data);
               return;
           }
           prev= prev.next;
       }

        }
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(50);
        Node<Integer> n5 = new Node<>(80);
        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        head.traverse(head);
        System.out.println();
        printSecondLastNode(head);

    }


}
