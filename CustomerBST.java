
package Pro;

import java.util.Scanner;



public class CustomerBST {
Node root;
public CustomerBST(){
    root=null;
}
public void insert(String Cname,String order,int Cid,int amount){
    
     
    Node newnode=new Node();
    newnode.name=Cname;
 
   newnode.order=order;
    newnode.customerId=Cid;
   newnode.amount=amount;
    
    if(root==null)
      root=newnode;
    else{
        Node current=root;
        Node parent;
       while(true){
	parent = current;
	if(Cid<current.customerId){
		current = current.left;
	if(current==null){
	parent.left = newnode;
		return;
		}
        }
        else{
		current = current.right;
        if(current==null){
		parent.right = newnode;
            return;
 
}
}
       }
    }
}
public boolean delete(int id){
    Node current=root;
   Node parent=root;
  boolean 
          isLeft=true;
  
  while(current.customerId!=id){
      parent=current;
      if(id<current.customerId)
      {
          isLeft=true;
          current=current.left;
      }
      else
      {
          isLeft=false;
          current=current.right;
                  
      }
      if(current==null)
          return false;
  }
  if(current.left==null && current.right==null){
      if(current==root)
          root=null;
      else if(isLeft)
          parent.left=null;
      else
          parent.right=null;
  }
  else if(current.right==null)
      if(current==root)
          root=current.left;
      else if(isLeft)
          parent.left=current.left;
      else
          parent.right=current.left;
  
  else if(current.left==null)
      if(current==root)
          root=current.right;
      else if(isLeft)
          parent.left=current.right;
      else
          parent.right=current.right;
  
  else{
      Node successor=getSuccessor(current);
      if(current==root)
          root=successor;
      else if(isLeft)
          parent.left=successor;
      else 
          parent.right=successor;
      
      successor.left=current.left;
  }
  return true;
}


    public Node getSuccessor(Node delnode){
    Node successorParent=delnode;
    Node successor=delnode;
    Node current=delnode.right;
    while(current!=null){
        successorParent=successor;
        successor=current;
        current=current.left;
        
    }
    if(successor!=delnode.right)
    {
        successorParent.left=successor.right;
        
        successor.right=delnode.right;
    }
    return successor;
}

    
   public void deliver(){
       Node current=minimum();
       delete(current.customerId);
       System.out.println("\nOrder Delivered :\n");
       current.display();
   }
   
   public void cancelOrder(int token) {
       Node current=root;
       while(current.customerId!=token){
           if(token<current.customerId)
               current=current.left;
           else 
               current=current.right;
         
       }
       delete(current.customerId);
       current.displayCanceled();
       
          
       
   }

public void inOrderdisp(Node localRoot){
   
    if(localRoot!=null)
    {
        inOrderdisp(localRoot.left);
        localRoot.display();
        System.out.println("\n");
        inOrderdisp(localRoot.right);
    }
    
}
public void displayOne(int i){
    Node current=root;
     
try{     while(current.customerId!=i){
           if(i<current.customerId)
               current=current.left;
           else
               current=current.right;
           if(current==null)
           {
               System.out.println();
           break;
           }   
       }
    
current.display();
}

   catch(NullPointerException e){
       System.out.print("Didn't Find Customer with ID "+i+"\n");
   }
}


public void display(){          
        inOrderdisp(root);
if(root==null)
            System.out.println("The Customer List is Empty.\n");
    }
public Node minimum(){
    Node current,last=null;
            current=root;
    while(current!=null)
    {
        last=current;
        current=current.left;
        
    }
    return last;
}
}

