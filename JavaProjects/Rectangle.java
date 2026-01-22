//Welcome to your first Java Project
//Plz do first and if you got confused then only copy it

import java.util.Scanner;
public class Rectangle{
  public static void main(String[] args){
    double length,breadth; // Here i could write l,b but vaiable name must have meaning another rule by humans
   
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Length of the Rectangle: ");
    length = scanner.nextDouble();
    System.out.print("Enter the Breadth of the Rectangle: ");
    breadth = scanner.nextDouble();
    double area = length*breadth;
    System.out.println("Area is : "+area);
    //Oh yeah and if you are just copying from this tutorial if you are then what are you doing when i had reached the user input the scanner topic i made a game a story based game so do it. make one.
    //Research and learn more on what and how to use scanner what nextLine does what nextInt() does like that.
  }
}
