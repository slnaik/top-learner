package tap.bank.account;

import java.util.Scanner;

class Account
{
	protected String accName;
	protected String accNo;
	protected String bankName;
	
	//getters
	protected String getAccName()
	{
		return accName;
	}
	protected String getAccNo()
	{
		return accNo;
	}
	protected String getBankName()
	{
		return bankName;
	}
	
	//setters
	
	protected void setAccName(String accName)
	{
		this.accName=accName;
	}
	protected void setAccNo(String accNo)
	{
		this.accNo=accNo;
	}
	protected void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	protected void display()
	{
		System.out.println("Account name: " +accName);
		System.out.println("Account number: " +accNo);
		System.out.println("Bank name: "+bankName);
	}	
}

//current account

class CurrentAccount extends Account
{
	private String tinNumber;
	
	//default constructor
	
	CurrentAccount()
	{
		
	}
	
	//parameterized constructor
	
	CurrentAccount(String accName, String accNo, String bankName,String tinNumber)
	{
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		this.tinNumber=tinNumber;
	}
	
	String getTinNumber()
	{
		return tinNumber;
	}
	void setTinNumber(String tinNumber)
	{
		this.tinNumber=tinNumber;
	}
	public void display()
	{
		super.display();
		System.out.println("TinNumber= "+tinNumber);
	}
}	
	//SavingAccount
	
	class SavingAccount extends Account
	{
		private String orgName;
		
		SavingAccount()
		{
			
		}
		
		//parameterized constructor
		
		SavingAccount(String accName, String accNo, String bankName,String orgName)
		{
			this.accName=accName;
			this.accNo=accNo;
			this.bankName=bankName;
			this.orgName=orgName;
		}
		
		String getOrgName()
		{
			return orgName;
		}
		void setOrgName(String orgName)
		{
			this.orgName=orgName;
		}
	public	void display()
		{
			super.display();
			System.out.println("organization name= "+orgName);
		}
	}
	
public class Main 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        if (choice == 1)
        {

        System.out.println("Enter Account details in comma separated (Account Name, Account Number, Bank Name, organization name)");

        String input = sc.nextLine();
        String[] ar = input.split(",");
        SavingAccount SavingAccount=new SavingAccount(ar[0],ar[1],ar[2],ar[3]);
        SavingAccount.display();
        }
        else
        {
        	System.out.println("Enter Account details in comma separated (Account Name, Account Number, Bank Name, organization name)");

            String input = sc.nextLine();
            String[] ar = input.split(",");
            CurrentAccount CurrentAccount=new CurrentAccount(ar[0],ar[1],ar[2],ar[3]);
            CurrentAccount.display();
        	
        }
    }
 }

        

     

   


