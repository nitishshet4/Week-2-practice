import java.util.Scanner;
class Bigofthree{
  public static void main(String[] args){
    Scanner ip=new Scanner(System.in);
    int n1=ip.nextInt();
    int n2=ip.nextInt();
    int n3=ip.nextInt();
    
    if((n1>n2)  && (n1>n3)){
      System.out.println("number1 is big number"+n1);
      
    }else if((n2>n1)&&(n2>n3)){
      System.out.println("number2 is big  number"+n2);
    }
      else{
      System.out.println("number3 is big  number"+n3);
      }
    }
}

