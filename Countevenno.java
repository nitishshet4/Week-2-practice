import java.util.Scanner;
 
class Countevenno {
 
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = 0, count = 0;
    System.out.println("Enter num value");
    num = s.nextInt(); // 100
 
    for (int i = 1; i <= num; i++) {
      if (i % 2 == 0) {
        count++;
      }
    }
    System.out.println("number of even numbers : " + count);
 
  }
 
}