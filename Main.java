import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH THESE LINE/LINES
    boolean exists = false;
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE BELOW:

        if (word.length()>=4){
            if (word.substring(0,4).equals("java")||word.substring(1,5).equals("java")) {
                exists = true;
            }
        }else if(word.length()==4) {
            if (word.substring(0, 4).equals("java")) {
                exists = true;
            }
        }
            System.out.println(exists);

    
    }
}