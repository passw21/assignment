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
public class TestStack {
LLStack llStack = new LLStack();

llStack.push(1);

llStack.push(2);

llStack.printStack();

System.out.println("After poping "+llStack.pop());

llStack.printStack();

}
    
}
