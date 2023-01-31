package assignment.exception.bank;
import java.util.logging.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankAccount 
{
    Logger log = Logger.getLogger("hi");
    String name;
    long acno;
    double balance;
    boolean b = true;
    Scanner sc = new Scanner(System.in);

    void switchCase() {
        while (b) {
            log.info("1.Deposit\n2.Withdraw\n3.Balance Enquiry\n4.Exit\nEnter Your Option:");
            int x = sc.nextInt();
            switch (x) {
                case 1: {
                    deposit();
                    break;
                }
                case 2: {
                    withdraw();
                    break;
                }
                case 3: {
                    balanceAmount();
                    break;
                }
                case 4: {
                    b = false;
                    break;
                }
                default: {
                    log.info("Enter Valid Option!");
                    break;
                }
            }
        }
    }

    BankAccount() // constructor for create a Bank Account
    {
        try{
            log.info("Enter Your Name:");
            name = sc.nextLine();
            log.info("Enter Your Account Number:");
            acno = sc.nextLong();
            balance = 0.0;
        }
        catch(InputMismatchException e)
    	{
    		b=false;
    		log.info(e);
    	}
    }

    void deposit() // deposit money into the account
    {
        try{
            log.info("Enter Amount to Deposit:");
            double depositamount = sc.nextDouble();
            balance += depositamount;
        }
        catch(InputMismatchException e)
    	{
    		b=false;
    		log.info(e);
    	}
    }

    void withdraw() {
        try{
            log.info("Enter Withdraw Amount: ");
            double withdrawamount = sc.nextDouble();
            if (withdrawamount > balance) {
                log.info("Your withdraw amount is lesser than your Balance!");
            } else {
                balance -= withdrawamount;
            }
        }
        catch(InputMismatchException e)
    	{
    		b=false;
    		log.info(e);
    	}
    }

    void balanceAmount() {
        log.fine("Balance Amount: {} ",balance);
    }
    public static void main( String[] args )
    {
    	BankAccount obj = new BankAccount();
        obj.switchCase();
    }
}
