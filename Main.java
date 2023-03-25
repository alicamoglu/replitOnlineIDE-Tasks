import java.util.*;

public class Main {
  public static void main(String[] args) {
    //DO NOT TOUCH THESE LINES:
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    //WRITE YOUR CODE HERE:
        int i = 0;
        while (inhabitants >0){
            System.out.println("Day " + i + " ["+inhabitants+"]");
            inhabitants = inhabitants/2;
            i++;
        }
    System.out.println("---- EXTINCT ----");
  }
}