
package dynamicarrayimp;




public class DynamicArrayimp {

  
    public static void main(String[] args) {
    Array numbers = new Array(3);
    numbers.insert(5);
    numbers.insert(8);
    numbers.insert(30);
    numbers.insert(50);
    numbers.insert(90);
    numbers.remove(2);
    System.out.println(numbers.indexOf(50));
    numbers.print();
    }
    
}
