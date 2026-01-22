//Ok now you know how to make variable but you can't keep on putting the variable yourself you need user input
//for that we use a scanner class it is a hava.util package class which we have to import 
//
import java.util.Scanner; //Here scanner is imported 

public class User{
  public static void main(String[] args){
    //to use scanner class we have to call the object
    Scanner scanner = new Scanner(System.in); //the Scanner scanner --> this little guy is a variable you can name it anything Scanner sc; Scanner Aadim but other are compulsory
    //also its a better practice to close a class you open
    String name;
    System.out.print("Your name: ");
    name = scanner.nextLine();
    System.out.print("Your Age: ");
    int age = scanner.nextInt();
    //I showed you two way of asking one after declaring variable another while declaring variable
    //String uses scanner.nextLine and the scanner at front is just the variable you named Scanner scanner <-- (This variable) = new Scanner(System.in);
    //variable is preferred to have small case letter at front but follow camel cassing like isStudent; like this
    //Now lets print what we asked
    System.out.println("Hello "+name+" You are "+age+" years old");
    scanner.close();
  }
}
