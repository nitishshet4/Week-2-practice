import java.util.Scanner;
  class Weekdayselseif{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the weeek number to get a week day:");
    int days=sc.nextInt();
  if (days==1){
     System.out.println("monday");
  }
    else if(days==2){
       System.out.println("tuesday");
    }
    else if (days==3){
       System.out.println("wednesday");
    }
    else if(days==4){
       System.out.println("Thursday");
    }
      else if(days==5){
       System.out.println("Friday");
      } 
  else if(days==6){
     System.out.println("Saturday");
  }
    else{
       System.out.println("sunday");
    }
    
    }
 }
