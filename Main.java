import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
            System.out.println("first letter: " + word.charAt(0));
        System.out.println("last letter: " + word.charAt(word.length()-1));
    
    
  }
}