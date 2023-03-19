import java.util.Scanner;
class Voting{
  public static void main(String[] args){
    System.out.println("enter the age of the voter");
    Scanner ip=new Scanner(System.in);
    int age=ip.nextInt();
    
    
    if(age >=18){
      System.out.println("Eligible foor voting");
      
    }else{
      System.out.println("Not eligible for voting");
    }
    
    }
}
