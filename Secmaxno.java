import java.util.Scanner;
 
class Secmaxno{
 
  public static void main(String args[]) { 
    Scanner s = new Scanner(System.in);
    int  max=0,min2=0;
    System.out.println("enter the number :");
   int  num1 = s.nextInt();
    int num2 = s.nextInt();
    int num3 = s.nextInt();
    int num4 = s.nextInt();
    int num5 = s.nextInt();
    if((num1<num2) && (num1<num3) && (num1<num4) &&(num1<num5)){
    System.out.println(" miminum is"+num1);
      if((num2<num3) && (num2<num4) && (num2<num5)){
        min2=num2;
      }
    }
    else if((num3<num4) && (num3<num5)) {
      min2=num3;
    }
    else if(num4<num5){
      min2=num4;
    }
    else {
      min2=num5;
    }
    System.out.println("second minimum :"+min2);
    }
  
}