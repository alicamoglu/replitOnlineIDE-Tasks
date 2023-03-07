import java.util.*;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH THIS PART
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
        String withoutFirst = word.replace(String.valueOf(word.charAt(0)),""),
                withoutLast = word.replace(word.substring(word.length()-1),"");

//        String withoutFirst = word.replace(String.valueOf(word.charAt(0)),"");
        System.out.println("without first letter: " + withoutFirst);
        System.out.println("without last letter: " + withoutLast);
    //WRITE YOUR CODE HERE
    
  }
}