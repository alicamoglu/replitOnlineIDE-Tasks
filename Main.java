import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
            String reverseResult = word.length()<5?"Too short!": 5<word.length()?"Too long!":new StringBuilder(word).reverse().toString();

        System.out.println(reverseResult);
    //WRITE YOUR CODE BELOW
    
  }
}