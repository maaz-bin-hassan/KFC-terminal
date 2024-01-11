package Pro;

import java.util.InputMismatchException;
import java.util.Scanner;







public class Operations {
    int customerNumber;
    CustomerBST customer;

    public Operations()  {
        this.customer = new CustomerBST();
    }
    public void Screen(){
        System.out.println("\t     *=============*^*==============*");
        System.out.println("\t<<<<<*>>>>>WELCOME TO KFC SUKKUR<<<<<*>>>>>");
        System.out.println("\t     *=============*^*==============*\n");
        do{
            System.out.println("\tPress \" 1 \" <====> To Insert Customer's Order");
            System.out.println("\tPress \" 2 \" <====> To View Customers' Information");
            System.out.println("\tPress \" 3 \" <====> To Deliver Order");
            System.out.println("\tPress \" 4 \" <====> To Cancel Order");
            Scanner obj=new Scanner(System.in);

            int option;
            try{
                option=obj.nextInt();

                switch(option){
                    case 1:
                        insert();
                        customerNumber++;
                        break;
                    case 2:
                        do{
                            System.out.println("\tPress \" 1 \" <====> To View one Customer's Information");
                            System.out.println("\tPress \" 2 \" <====> To View all Customers' Information");

                            Scanner objdis=new Scanner(System.in);
                            int dis;
                            try{     dis=objdis.nextInt();

                                switch(dis){
                                    case 1:
                                        //display 1;
                                        System.out.println("\nEnter Customer's ID you want to View Information :\n");
                                        Scanner disp=new Scanner(System.in);
                                        int id=disp.nextInt();
                                        customer.displayOne(id);
                                        break;
                                    case 2:
                                        System.out.println("\n\t*=================*^*=================*");
                                        System.out.println("\t   *===*Customer's Orders List*===*");
                                        System.out.println("\t*=================*^*=================*\n");
                                        customer.display();
                                        break;

                                    default:
                                        System.out.print("\nThere is no such option please try somethin else");
                                        break;
                                }

                            }

                            catch(InputMismatchException e){
                                System.out.print("\nYour selection can only be an Integer.\n\n");
                            }

                            System.out.print("Do you want to continue Display Operations?");
                            System.out.print("\nTo Continue Operations Enter \"yes\" To Exit Enter Any Character or String\n");
                        }while(choice()==true) ;

                        break;
                    case 3:
                        try{     customer.deliver();
                        }
                        catch(NullPointerException e){
                            System.out.print("\nThe Customer List is Empty.\n");
                        }
                        break;

                    case 4:
                        do{
                            System.out.println("\nEnter the ID of Customer's Order you want to cancel :\n");


                            Scanner cancel=new Scanner(System.in);
                            int canc;
                            try{ canc=cancel.nextInt();
                                customer.cancelOrder(canc);
                            }
                            catch(NullPointerException e){
                                System.out.print("\nThe Customer List Doesn't contain the Customer with this ID.\n\n");
                            }

                            System.out.print("Do you want to continue Canceling Orders?");
                            System.out.print("\nTo Continue Operations Enter \"yes\" To Exit Enter Any Character or String\n");
                        }while(choice()==true) ;


                        break;
                    default:
                        System.out.print("\n\tWrong Operation");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.print("\nYour selection can only be an Integer.\n\n");
            }
            System.out.print("Do you want to continue Operations?");
            System.out.print("\nTo Continue Operations Enter \"yes\" To Exit Enter Any Character or String\n");
        }while(choice()==true) ;

    }
    public void insert(){
        
     int amount=0;
   Scanner obj=new Scanner(System.in);
       System.out.print("\n\tEnter Customer Name\n");
  
       String name=obj.nextLine();
   String order="",totalOrder="";
   System.out.println("\n      *==================*^*==================*");
     System.out.println("*^*===*^*===**Choose Your Order from Menu**===*^*===*^*");
    System.out.println("      *==================*^*==================*\n");
    System.out.println("\n\t*============*^*============*");
 System.out.println("\t*^*===*^*===**MENU**===*^*===*^*");
  System.out.println("\t*============*^*============*\n");
   do{ 
   System.out.println("\tPress \" 1 \" <====> For Beverages");
  System.out.println("\tPress \" 2 \" <====> For Chicky Meals");
  System.out.println("\tPress \" 3 \" <====> For Burgers");
   System.out.println("\tPress \" 4 \" <====> For snacks");
   
    Scanner obj2=new Scanner(System.in);
     int option;
    try{
       option=obj2.nextInt();
   
     

 switch(option){
     case 1:
                    System.out.println("\n\t  *================*^*=================*");
                    System.out.println("\t*^*===*^*===**Beverages MENU**===*^*===*^*");
                    System.out.println("\t  *================*^*=================*\n");
   do{ 
   System.out.println("\tPress \" 1 \" <====> For Pepsi");
  System.out.println("\tPress \" 2 \" <====> For Mountain Dew");
  System.out.println("\tPress \" 3 \" <====> For Mirinda");
   System.out.println("\tPress \" 4 \" <====> For Mineral water");
    Scanner b=new Scanner(System.in);
     try{ int bevrg=b.nextInt();
int number=0;
 switch(bevrg){
     case 1:
          order=", Pepsi";
          System.out.println("Price of Pepsi : 100");
          System.out.println("Number of Pepsi?");
           number=obj2.nextInt();
           amount=amount+number*100;
           totalOrder=totalOrder+order;
          break;
     case 2:
            order=", Mountain Dew";
          System.out.println("Price of Mountain Dew : 90");
          System.out.println("Number of Mountain Dew?");
           number=obj2.nextInt();
           amount=amount+number*90;
           totalOrder=totalOrder+order;
          break;
      case 3:
       order=", Mirinda";
          System.out.println("Price of Mirinda : 110");
          System.out.println("Number of Mirinda?");
           number=obj2.nextInt();
           amount=amount+number*110;
           totalOrder=totalOrder+order;
          break;
     case 4:
          order=", Mineral water";
          System.out.println("Price of Mineral water : 80");
          System.out.println("Number of Mineral water?");
           number=obj2.nextInt();
           amount=amount+number*80;
           totalOrder=totalOrder+order;
          break;     
     default:
         order=null;
    System.out.print("\n\tSorry we don't have this Thing in menu");
         break;
         
 }}
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be an Integer.\n\n");
   }
 System.out.print("Do you want to continue adding Beverages");
      System.out.print("\nTo Continue with Menu Enter \"yes\" To Exit Enter Any Character or String\n");
 }while(choice()==true) ;

          break;
     case 2:
                    System.out.println("\n\t  *==================*^*==================*");
                    System.out.println("\t*^*===*^*===**Chicky Meals MENU**===*^*===*^*");
                    System.out.println("\t  *==================*^*==================*\n");
   do{ 
   System.out.println("\tPress \" 1 \" <====> For crunchy fried Chiken balls");
  System.out.println("\tPress \" 2 \" <====> For Braised beef");
  System.out.println("\tPress \" 3 \" <====> For Fajitas");
   System.out.println("\tPress \" 4 \" <====> For Jambalaya");
    Scanner cm=new Scanner(System.in);
     int chicky;
    try{ chicky=cm.nextInt();
int number=0;
 switch(chicky){
     case 1:
         order=", crunchy fried Chiken balls";
          System.out.println("Price of crunchy fried Chiken balls : 300");
          System.out.println("Number of crunchy fried Chiken balls?");
           number=obj2.nextInt();
           amount=amount+number*300;
           totalOrder=totalOrder+order;
          break;
     case 2:
            order=", Braised beef";
          System.out.println("Price of Braised beef : 500");
          System.out.println("Number of Braised beef?");
           number=obj2.nextInt();
           amount=amount+number*500;
           totalOrder=totalOrder+order;
          break;
      case 3:
       order=", Fajitas";
          System.out.println("Price of Fajitas : 250");
          System.out.println("Number of Fajitas?");
          totalOrder=totalOrder+order;
           number=obj2.nextInt();
           amount=amount+number*250;
          break;
     case 4:
         order=", Jambalaya";
          System.out.println("Price of Jambalaya : 400");
          System.out.println("Number of Jambalaya?");
           number=obj2.nextInt();
           amount=amount+number*+400;
           totalOrder=totalOrder+order;
          break;     
     default:
         order=null;
          System.out.print("\n\tSorry we don't have this Thing in menu");;
         break;
         
 }}
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be an Integer.\n\n");
   }
 System.out.print("Do you want to continue adding Chicky Meals?");
      System.out.print("\nTo Continue with Menu Enter \"yes\" To Exit Enter Any Character or String\n");
 }while(choice()==true) ;

          break;
      case 3:
                System.out.println("\n\t  *================*^*===============*");
                System.out.println("\t*^*===*^*===**Burgers MENU**===*^*===*^*");
                System.out.println("\t  *================*^*===============*\n");
                do{ 
   System.out.println("\tPress \" 1 \" <====> For Krunch Burger");
  System.out.println("\tPress \" 2 \" <====> For Zinger Stacker");
  System.out.println("\tPress \" 3 \" <====> For Twister");
   System.out.println("\tPress \" 4 \" <====> For Mighty Zinger");
    Scanner bg=new Scanner(System.in);
    int number=0;
    int burger;
     try { burger=bg.nextInt();

 switch(burger){
     case 1:
         order=", Krunch Burger";
          System.out.println("Price of Krunch Burger : 150");
          System.out.println("Number of Krunch Burger?");
           number=obj2.nextInt();
           amount=amount+number*150;
           totalOrder=totalOrder+order;
          break;
     case 2:
            order=", Zinger Stacker";
          System.out.println("Price of Zinger Stacker : 270");
          System.out.println("Number of Zinger Stacker?");
           number=obj2.nextInt();
           amount=amount+number*270;
           totalOrder=totalOrder+order;
          break;
      case 3:
      order=", Twister";
          System.out.println("Price of Twister : 390");
          System.out.println("Number of Twister?");
           number=obj2.nextInt();
           totalOrder=totalOrder+order;
           amount=amount+number*390;
          break;
     case 4:
           order=", Mighty Zinger";
          System.out.println("Price of Mighty Zinger : 490");
          System.out.println("Number of Mighty Zinger?");
           number=obj2.nextInt();
           totalOrder=totalOrder+order;
           amount=amount+number*490;
          break;     
     default:
         order=null;
         System.out.print("\n\tSorry we don't have this Thing in menu");
         break;
         
 }}
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be an Integer.\n\n");
   }
 System.out.print("Do you want to continue adding Burgers?");
      System.out.print("\nTo Continue with Menu Enter \"yes\" To Exit Enter Any Character or String\n");
 }while(choice()==true) ;
  
          break;
     case 4:
                System.out.println("\n\t  *===============*^*===============*");
                System.out.println("\t*^*===*^*===**Snacks MENU**===*^*===*^*");
                System.out.println("\t  *===============*^*===============*\n");
   do{ 
   System.out.println("\tPress \" 1 \" <====> For Fries pack");
  System.out.println("\tPress \" 2 \" <====> For Nuggets pack");
  System.out.println("\tPress \" 3 \" <====> For Chicken pieces");
   System.out.println("\tPress \" 4 \" <====> For Corn on Cob");
    Scanner sn=new Scanner(System.in);
 int snacks;
    try{
      snacks=sn.nextInt();
  
int number=0;
 switch(snacks){
     case 1:
          order=", Fries pack";
          System.out.println("Price of Fries pack : 80");
          System.out.println("Number of Fries pack?");
            number=obj2.nextInt();
           amount=amount+number*80;
           totalOrder=totalOrder+order;
          break;
     case 2:
             order=", Nuggets pack";
          System.out.println("Price of Nuggets pack : 190");
          System.out.println("Number of Nuggets pack?");
            number=obj2.nextInt();
           amount=amount+number*190;
           totalOrder=totalOrder+order;
          break;
      case 3:
          order=", Chicken pieces";
          System.out.println("Price of Chicken pieces : 350");
          System.out.println("Number of Chicken pieces?");
           number=obj2.nextInt();
           amount=amount+number*350;
           totalOrder=totalOrder+order;
          break;
     case 4:
           order=", Corn on Cob";
          System.out.println("Price of Corn on Cob : 110");
          System.out.println("Number of Corn on Cob?");
           number=obj2.nextInt();
           amount=amount+number*110;
           totalOrder=totalOrder+order;
          break;     
     default:
         order=null;
         System.out.print("\n\tSorry we don't have this Thing in menu");
         break;
         
 }
  }
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be an Integer.");
   }
 System.out.print("Do you want to continue adding Snacks?");
      System.out.print("\nTo Continue with Menu Enter \"yes\" To Exit Enter Any Character or String\n");
 }while(choice()==true) ;
  
          break;     
     default:
         order=null;
         System.out.print("\n\tWrong Operation");
         break;
         
 }
 }
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be String.\n\n");
   }
 System.out.print("Do you want to continue adding Menu?");
      System.out.print("\nTo Continue with Menu Enter \"yes\" To Exit Enter Any Character or String\n");
 }while(choice()==true) ;
   
    System.out.print("Enter Customer ID :\n");
   try{  int id=obj.nextInt();
      customer.insert(name, totalOrder, id,amount);
   }
   
   catch(InputMismatchException e){
       System.out.print("\nYour selection can only be an Integer.\n\n");
   }
   
    }

 public boolean choice(){
    
 Scanner obj1=new Scanner(System.in);
     String opinion=obj1.nextLine();
    if( opinion.equalsIgnoreCase("yes")){
        return true;
    }
    else 
        return false;
 }
 
}
