import java.util.Scanner;
 
class Oddfrom1_10{
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    System.out.println("Enter num value");
    num = s.nextInt(); 
 
    for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
 
  }
 
}