import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("enter number:");
    int num = inp.nextInt();
     
    next3(num);
  }
  
  // DO NOT TOUCH ABOVE:

  public static void next3(int num1){
    System.out.print((num1+1) + " " + (num1 + 2) + " " + (num1 + 3) );
    
  }
    
  
}