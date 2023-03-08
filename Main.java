import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int n = scan.nextInt();

    //WRITE YOUR CODE BELOW
        System.out.println(str.substring(n).contains(str.substring(0,n))?"true":"false");


  }
}