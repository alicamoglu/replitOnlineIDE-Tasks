import java.util.Scanner;
class Main {

    public static void cube(){

        int n = new Scanner(System.in).nextInt();
        System.out.println( n*(int)square(n));
    }


    public static double square(int n) {
        return Math.pow(n,2);
    }

    public static void main(String[] args) {
        cube();
    }
    
    
   
  
  

}