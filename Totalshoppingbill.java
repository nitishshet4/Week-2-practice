class Totalandavg{
  public static void main(String args[]){
    int employeesalary=100000,shopbill1=10000,
      shopbill2=20000,shopbill3=15000,totshopbill=0,
      percentamtshop=0;
    totshopbill=shopbill1+shopbill2+shopbill3;
     percentamtshop=(employeesalary*totshopbill)/1000;
    System.out.println("total shopping bill is"+totshopbill);
    System.out.println("percentagee of amount spent on shopping on employee salary."+ percentamtshop);
  }
}