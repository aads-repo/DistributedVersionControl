import java.util.Scanner;

public class withdraw {
	 public static void main(String args[] )
	    { 
	        int balance = 5000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	        
	        withdraw = s.nextInt();
	if(balance >= withdraw)
    {
        balance = balance - withdraw;
        System.out.println("Withdrawn is Completed, Please Take Your Card!!");
    }
}}