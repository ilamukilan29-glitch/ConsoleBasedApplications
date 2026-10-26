package InventoryExpiryAndStockLossPredictor;
import java.util.ArrayList;
import java.util.Scanner;
import InventoryExpiryAndStockLossPredictor.info;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Store");
        ArrayList<info> list = new ArrayList<>();
        while(true){
            
            System.out.println("Enter 1 for add new Product.");
            System.out.println("Enter 2 for Remove a Product.");
            System.out.println("Enter 3 for view all the Products.");
            System.out.println("Enter 4 for view specific Product.");
            System.out.println("Enter 5 for Edit a Product details");
            System.out.println("Enter 6 for view Dashboard Details.");
            System.out.println("Enter 7 for Exit.");
            System.out.println("Enter your Choice: ");
            int n = sc.nextInt();
            sc.nextLine();
            switch(n){

                case 1: {
                    info newPro = new info();
                    System.out.println("Enter the Product Name: ");
                    newPro.productName=sc.nextLine();
                    System.out.println("Enter the Price of the Product: ");
                    newPro.sellingprice=sc.nextInt();
                    System.out.println("Enter the available Stocks: ");
                    newPro.quantity= sc.nextInt();
                    System.out.println("Enter the date of this month: ");
                    newPro.expdate = sc.nextInt();
                    System.out.println("Enter the costPrice of the product: ");
                    newPro.costprice=sc.nextInt();
                    System.out.println("Enter the Min Stock Limit: ");
                    newPro.minstock=sc.nextInt();
                    sc.nextLine();
                    list.add(newPro);
                    System.out.println("Product Created Successfully!!");
                    break; 
                }
                case 2: {
                    System.out.println("Available Products: ");
                    for(info ne:list){
                        System.out.println(ne.productName);
                    }
                    System.out.println("Enter the name of the Product for Deletion");
                    String del = sc.nextLine();
                    for(info ne: list){
                        if(ne.productName.equals(del)){
                            list.remove(ne);
                        }
                    }
                    System.out.println("Product Removed Successfully!!");
                    break;
                }
                case 3:{
                    for(info ne:list){
                        System.out.println("-------------------------------");
                        System.out.println("Product Name: "+ne.productName);
                    }
                    System.out.println("-------------------------------");
                    break;
                }
                case 4:{
                    String name = sc.nextLine();
                    for(info ne:list){
                        if(ne.productName.equals(name)){
                        System.out.println("Product Name: "+ne.productName);
                        System.out.println("Product Price: "+ne.sellingprice);
                        System.out.println("Available Stocks: "+ne.quantity);
                        System.out.println("Date of Expire: "+ne.expdate+"/10/2026");
                        }
                    }
                    break;
                }
                case 5:{
                    String name = sc.nextLine();
                    System.out.println("Previous Details");
                    for(info ne:list){
                        if(ne.productName.equals(name)){
                        System.out.println("Product Name: "+ne.productName);
                        System.out.println("Product Price: "+ne.sellingprice);
                        System.out.println("Available Stocks: "+ne.quantity);
                        System.out.println("Date of Expire: "+ne.expdate+"/10/2026");
                        System.out.println("--- Enter the Details to be Edited ---");
                        System.out.println("Enter the name of the product");
                        ne.productName=sc.nextLine();
                        System.out.println("Enter the Product Price: ");
                        ne.sellingprice=sc.nextInt();
                        System.out.println("Enter the Available Stocks: ");
                        ne.quantity=sc.nextInt();
                        System.out.println("Date of expire of this month: ");
                        ne.expdate=sc.nextInt();
                        sc.nextLine();
                        }
                    }
                    break;
                }
                case 6:{
                    int total =0;
                    for(info ne:list){
                        total+=ne.quantity;
                    }
                    System.out.println("WELCOME CHIEF IT'S OUR DETAILS");
                    System.out.println("-------------------------------------");
                    System.out.println("|| Total Products: "+list.size()+" ||");
                    System.out.println("|| Total Products: "+total+" ||");
                    System.out.println("Our Products");
                    System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -");

                     for(info ne:list){
                        System.out.println("|| Product Name: "+ne.productName+" ||");
                        System.out.println("|| Product Price: "+ne.sellingprice+" ||");
                        System.out.println("|| Available Stocks: "+ne.quantity+" ||");
                        System.out.println("|| Date of Expire: "+ne.expdate+"/10/2026 ||");
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -  -  -");
                    }
                    System.out.println("-------------------------------------");
                    break;

                }
                case 7:{
                    System.out.println("==> Bye!! See You Later <==");
                    return;
                }
            }
            

        }  
    }
}
