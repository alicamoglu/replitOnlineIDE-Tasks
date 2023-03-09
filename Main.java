import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    //WRITE YOUR CODE BELOW
        int repeating = (str.length() - str.replaceAll("bread","").length())/5;
        if (repeating >= 2){
            String str1 = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            if (str1.length() != 0) {
                System.out.println(str1);
            }else {
                System.out.println("nothing");
            }
        }else {
            System.out.println("nothing");
        }
    
  }
}