//Lets Make a Shopping Cart. Do Urself
//ask user what s/he wants then quantity then price then display it 

import java.util.Scanner;

public class ShoppingCart{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome To XXX Mart");
    System.out.print("Your Item: ");
    String itemName = scanner.nextLine();
    System.out.println();
    System.out.print("Quantity: ");
    int quantity = scanner.nextInt();
    scanner.nextLine();
    System.out.println();
    System.out.print("Price: Rs. ");
    double price = scanner.nextDouble();
    scanner.nextLine(); //The extra scanner.nextLine() after int and double is necessary as it causes error if you want to know then research it.

    double total = price * quantity;
    System.out.println("Your Total of "+quantity+" "+itemName+" is Rs. "+ total);
  }
}
