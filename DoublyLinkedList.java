/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedimp;

public class DoublyLinkedList {
    private SLNode head;
    private SLNode tail;
    public DoublyLinkedList() {
        this.head=null;
        this.tail=null;
        
    }
    public void addToHead(int x) {
        
      SLNode temp= new SLNode();
      temp.data=x;
      temp.next= null;
      temp.previous= null;
       if(head==null) this.head = this.tail= temp;
       else 
       {
           temp.next= head;
           head.previous=temp;
           head=temp;
       }
    }
    public void addToTail(int x) {
        SLNode temp= new SLNode();
        temp.data= x;
        temp.next= null;
        temp.previous= null;
        if(head==null) this.head = this.tail=temp;
        else
        {
            tail.next=temp;
            temp.previous= tail;
            tail=temp;
        }
        
        
    }
    public void removeFromHead() {
        int data = this.head.data;
        if(head==null)
            System.out.println("No data inside!");
        else {
            
            head= head.next;
            head.previous=null;
           
        }
    }
    public void removeFromTail(){
      int data = this.tail.data;
      if(tail==null)
          System.out.println("No data inside");
      else {
        tail= tail.previous;
        tail.next=null;
    }
    }
   public boolean isEMpty() {
       return this.head== null;
        }
   public void clear() {
       this.head=null;
   }
   public void printList(){
for(SLNode temp = this.head;temp!=null;temp=temp.next)
System.out.println(temp.data);
}
}
