import java.util.Scanner;
class Printoddnofrom1_10{
  public static void main(String args[]){
    int number , sum=0;  
     Scanner ip=new Scanner(System.in);
    System.out.println("enter the number odd no to print ");
    int n=ip.nextInt();
    System.out.println("enter the no from 0 to"+n );
    for(number=1;number<=n;number++)
      {
        if(number%2!=0)
        {
           System.out.println(+number +" ");
          sum=sum+number;
        }
      }
     System.out.println("the sum of odd number is:"+sum );
  }
}
