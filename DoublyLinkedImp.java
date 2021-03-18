/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedimp;

/**
 *
 * @author micko
 */
public class DoublyLinkedImp {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
         Queue NewQueue = new Queue();
        System.out.println(doublyLinkedList.isEMpty());
        doublyLinkedList.addToHead(5);
        doublyLinkedList.addToHead(8);
        doublyLinkedList.addToTail(9);
        doublyLinkedList.addToTail(7);
        doublyLinkedList.printList();
         System.out.println(doublyLinkedList.isEMpty());
         doublyLinkedList.removeFromHead();
         doublyLinkedList.printList();
         doublyLinkedList.removeFromTail();
         doublyLinkedList.printList();
        

          NewQueue.enqueue(3);

          NewQueue.enqueue(4);

          NewQueue.printQueue();
       
        
               
    }
    
}
