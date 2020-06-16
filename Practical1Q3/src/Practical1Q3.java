import java.util.Scanner;

public class Practical1Q3 {
    
    
  public static void main (String[] args) {
  
    	String cardNum = "";
        int sum1 =0;
        int sum2 = 0;
       

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Enter 8-digit Card number :");
    	cardNum = scan.nextLine();
    	
    	for(int i=7; i>0; i-=2 ){
          int temp =  cardNum.charAt(i) - '0';
           sum1 += temp;
        }
        System.out.print("sum1 = " + sum1 + "\n");
        
        for(int i=6; i>=0; i-=2 ){
           int temp =  cardNum.charAt(i) - '0';
           
           int doubling = temp * 2 ;
           
           if (doubling >= 10){
               int q = doubling /10;
               int r = doubling % 10;
               
                sum2 += q + r;
           }else{
               sum2 += doubling;
           }
        }
        System.out.print("sum2 = " + sum2 + "\n");
         
        if ( (sum1 + sum2) % 10 != 0){
             System.out.print("Invalid card number.\n" );
        } 
        else{
            System.out.print("Valid card number.\n");
        }
    
    }
}
