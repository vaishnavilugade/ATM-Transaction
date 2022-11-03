import java.util.*;
public class ATM{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int balance,withdraw,deposit,n;
		System.out.println("Enter balance:");
		balance=sc.nextInt();
		System.out.println("\n1.WITHDRAW\n2.DEPOSIT\n3.CHECK BALANCE\n4.EXIT");
		System.out.println("Enter your choice:");
		n=sc.nextInt();
		switch(n)
		{
			case 1:
			System.out.println("Enter money to withdraw:");
			withdraw=sc.nextInt();
			if(balance>=withdraw){
				balance=balance-withdraw;
				System.out.println(+balance+"Successfully withdraw");
			}
			else{
				System.out.println("Invalid,please check your balance and try again");
			}
			break;
			case 2:
			System.out.println("Entermoney to deposit:");
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println(+balance+"Successfully deposit");
			break;
			case 3:
			System.out.println("Account balance is:"+balance);
			break;
			case 4:
			System.exit(0);
		}
	}
}


