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
public class Stack {
    private DoublyLinkedList doublyLinkedList;

public Stack(){

this.doublyLinkedList = new DoublyLinkedList(); 

}


public boolean isEmpty(){

return this.doublyLinkedList.isEMpty();

}



public int pop(){

if(!this.isEmpty()) return this.doublyLinkedist.removeFromTail();

else return -1;

}

public void push(int x){

this.doublyLinkedList.addToTail(x);

}

public void printStack(){

this.doublyLinkedList.printList();

}
}
