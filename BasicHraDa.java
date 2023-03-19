import java.util.Scanner;
class BasicHraDa{
  public static void main(String args[]){
    int grosssalary=0,hra=0,da=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the basic salary");
    int basicsalary=s.nextInt();
    System.out.println("enter the HRA percentage");
    int hrapercen=s.nextInt();
    System.out.println("enter the DA percentage");
    int dapercen=s.nextInt();
    hra=(basicsalary*hrapercen)/100;
    da=(basicsalary*dapercen)/100;
    grosssalary=basicsalary+hra+da;
    System.out.println("The gross Salaryis:"+grosssalary);
  }
    
}