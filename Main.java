public class Main {
  public static void main(String[] args) {
        String a = "",
                b = "";


        for (int i = 1; i <=20 ; i++) {
            if (i % 2 == 0) {
                a += i + " ";

            } else {
                b += i + " ";
            }
        }
        a = a.substring(0,a.length()-1);
        b = b.substring(0,b.length()-1);
        System.out.println(a);
        System.out.println(b);
  }
}