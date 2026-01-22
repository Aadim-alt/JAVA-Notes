//post and pre increment 

public class PostPre{
  public static void main(String[] args){
    int x = 10;
    int y = 0;
    y = x++;
    System.out.println(y+" This prints 10 the original value of x right");
    System.out.println(x+" but x value has changed to 11");
    x=10;
    y=0;
    y=++x;
    System.out.println(y+" y");
    System.out.println(x+" x");
    //So x++ means changing the value of x after;
    //means if y = x++
    //y is x then x value is increased
    //but y = ++x
    // y has increased value of x same as x
  }
}
