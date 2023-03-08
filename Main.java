import java.util.*;
class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH THESE LINE/LINES.
    Scanner s = new Scanner(System.in);
    String order = s.next();

   //WRITE YOUR CODE BELOW THIS LINE:
    float chickenPrice = 9.75f,
          burgerPrice = 12.50f;
      switch(order){
        case  "chicken":
          System.out.println("Your total is $"+chickenPrice);
          break;
        case "burger" :
          System.out.printf("Your total is $" + "%1.2f",burgerPrice);
      }

     
  }
}