
package Pro;
public class Node {
   String name;
 String order;
 int customerId;
 int amount;
    Node left;
    Node right;
 
 public void display(){

          System.out.println("\tName *===* "+name);
      System.out.println( "\tOrder *===* "+order);
       System.out.println( "\tCustomerID *===* "+customerId);
       System.out.println( "\tTotal Amount *===* "+amount);
    }
 public void displayCanceled() {

         System.out.println("\tName *===* "+name);
      System.out.println( "\tOrder *===* "+order);
      System.out.println( "\tCustomerID *===* "+customerId);
   
    }
    

 
}
