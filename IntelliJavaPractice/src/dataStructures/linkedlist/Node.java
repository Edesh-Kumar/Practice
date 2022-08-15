package dataStructures.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data= data;

    }

    public void traverse(Node<T> head){
        Node<T> prev = head;
        while(prev.next != null){
            System.out.print(prev.data+" ");
            prev = prev.next;
        }
        System.out.print(prev.data);


    }

}
