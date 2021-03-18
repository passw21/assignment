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
public class Queue {
    	
	private DoublyLinkedList doublyLinkedList;
	public Queue(){
		this.doublyLinkedList = new DoublyLinkedList();
	}
	
	public boolean isEmpty(){
		return this.doublyLinkedList.isEMpty();
	}
	
	public void enqueue(int x){
		this.doublyLinkedList.addToTail(x);
	}
	 
	
	
	
	public void printQueue(){
		this.doublyLinkedList.printList();
	}
}
    

