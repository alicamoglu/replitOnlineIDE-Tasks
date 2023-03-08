import java.util.*;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    //WRITE YOUR CODE BELOW
    
            int remainder = word.length() % 2;

        switch (remainder){
            case 1:
                System.out.println(word.charAt(word.length()/2));
                break;
            case 0:
                System.out.println(""+word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
        }
  }
}