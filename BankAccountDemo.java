/* 
import java.util.*;
public class BankAccountDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		boolean flag=true;
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount("41111401","Bobby");
		
		System.out.println("Balance at first is: "+acc.getBalance());
		acc.deposite(500);
		System.out.println("Balance after depositing 500 is: "+acc.getBalance());
		acc.deposite(1500);
		System.out.println("Balance after depositing 1500 is: "+acc.getBalance());
		acc.withdrawl(400);
		System.out.println("Balance after withdrawling 400 is: "+acc.getBalance());
		
		do {
			System.out.println("Operations:\n1.withdrawl\n2.deposite\nChoose one:");
			int choice= sc.nextInt();
			if(choice==1) {
				System.out.println("Enter amount for withdrawl: ");
				int amt = sc.nextInt();
				acc.withdrawl(amt);
				System.out.println("Balance is: "+acc.getBalance());
			}
			else if(choice==2) {
				System.out.println("Enter amount for deposite: ");
				int amt=sc.nextInt();
				acc.deposite(amt);
				System.out.println("Balance is: "+acc.getBalance());
			}
			else{
				System.out.println("Invalid Input!!!");
			}
			System.out.println("Do you want to continue?(yes or no)");
			s=sc.next();
			if(s.equals("yes")){
				flag=true;
			}else{
				flag=false;
			}
		}while(flag);
		if(s.equals("no")) {
			System.out.println("Thank you dengey langa natho petukunte gudda dengesta!!!");
		}
	}

}

class BankAccount{
	private String accountName;
	private String accountNumber;
	private double balance=0.0;
	public String getAccountName() {
		return accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public BankAccount(String accNumber, String accName) {
		this.accountName=accName;
		this.accountNumber=accNumber;
	}
	public double deposite(double amount) {
		balance = balance+amount;
		return balance;
	}
	public double withdrawl(double amount) {
		if(amount>balance) {
			System.out.println("Your balance is low...");
			return 0;
		}else {
			balance=balance-amount;
			return balance;
		}
	}
}
*/
class BankAccountDemo{
	public static void main(String[] args) {
		String s1="Sachin";
		String s2=new String("Sachin");
		String s3="Saurav";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}