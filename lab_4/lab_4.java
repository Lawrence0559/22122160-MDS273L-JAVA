import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class lab4{

    String accountnumber;
    String accountholder;
    double accbalance;
    String[] transactions;
    int index;
        

    public lab4(String accountnumber, String accountholder, double accbalance){
        this.accountnumber= accountnumber;
        this.accountholder= accountholder;
        this.accbalance= accbalance;
        this.transactions= new String[100];
        this.index= 0;
    }
    public void todeposit(double amount){
        if(amount>0){
            this.accbalance += amount;
            this.transactions[this.index++]= String.format("Deposited ", amount);

        }else{
            System.out.println("Invalid deposit amount. ");

        }
    }
    public void towithdraw(double amount){
        if(amount >0 && amount <= this.accbalance){
            this.accbalance -=amount;
            this.transactions[this.index]= String.format("Withdrawn", amount);        
        }else{
            System.out.println("Invalid Withdrawal amount");
        }

    }
    public void printTransactions(){
        System.out.println("Transaction: ");
        for(int i=0; i< this.index; i++){
            System.out.println(this.transactions[i]);
        }

    }
    public void printSummary(){
        System.out.println("****Account Summary****");
        System.out.println("Account Number: "+ this.accountnumber);
        System.out.println("Account Holder Name: "+ this.accountholder);
        System.out.println("Account Balance:  " + this.accbalance + "Rs");

    }
        
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Account number: ");
        String accountnumber= sc.nextLine();
        System.out.print("Enter Account Holder Name; ");
        String accountholder= sc.nextLine();
        System.out.print("Enter initial Account Balance: ");
        double accbalance= sc.nextDouble();
        sc.nextLine();

        lab4 bankaccount= new lab4(accountnumber, accountholder, accbalance) ;

        int choice;
        do{
            System.out.println();
            System.out.println("****Menu**");
            System.out.println("1. Deposite Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Print Transactions");
            System.out.println("4. Print Account Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");
            choice= sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.print("Enter the Deposite Amount: ");
                    double depositAmount = sc.nextDouble();
                    bankaccount.todeposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    sc.nextLine(); // Consume the newline character
                    bankaccount.towithdraw(withdrawalAmount);
                    break;
                case 3:
                    bankaccount.printTransactions();
                    break;
                case 4:
                    bankaccount.printSummary();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }

        } while(choice != 5);
        sc.close();
    }

    
        
}