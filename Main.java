import java.util.*;

class Main {
	
	public static void main(String[] args) {
    //DO NOT TOUCH THE FOLLOWING LINES
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    populate(n);
	}
    //CREATE YOUR METHOD

  public static void populate(int m){
      int [] populateArray = new int[m];
      for (int i = 0; i < m; i++) {
          populateArray[i] = i+1;
      }
        System.out.println(Arrays.toString(populateArray));
    }    
}