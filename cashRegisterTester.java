import java.util.Scanner;

public class cashRegisterTester 
{
	public static void main(String[] args) 
	{	
		Scanner in = new Scanner(System.in);
		
		CashRegister transaction = new CashRegister();
		
		double SENTINEL = 0;
				
		do 
		{
			System.out.print("Please enter a purchase amount, or -1 to stop: ");
			double sale = in.nextDouble();
			SENTINEL = sale;
			if (sale != -1)
			{
				transaction.recordPurchase(sale);
			}
		}while(SENTINEL != -1);
		
		System.out.print("Enter a payment: ");
		double recieved = in.nextDouble();
		
		transaction.recievePayment(recieved);
		
		double money = transaction.giveChange();
		
		System.out.printf("Your change is: " + "%.2f",money);
		
	}

}
