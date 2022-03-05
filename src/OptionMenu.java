import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap< Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try {
                data.put(000000, 000000);
                data.put(952141, 191904);

                System.out.println("Welcome To ATM Machine Project!");
                System.out.println("Enter Your ID Please: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Your PIN Number : ");
                setPinNumber(menuInput.nextInt());
            } catch(Exception e) {
                System.out.println("\n" + "Invalid Charcter(s). Only Numbers." + "\n");
                x = 2;
            }

             int cn = getCustomerNumber();
             int pn = getPinNumber();
             if(data.containsKey(cn) && data.get(cn) == pn) {
                 getAccountType();
             } else {
             System.out.println("\n" + "Wrong ID Number or PIN Number" + "\n");
        } 
    } while(x == 1);

    }
    public void getAccountType() {
        System.out.println("Select the Option You Want to Access");
        System.out.println("Type 1 - Checking My Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch(selection) {
            case 1:
               getChecking();
               break;

            case 2:
               getSaving();
               break;

            case 3:
               System.out.println("Thank You for Using This ATM, see you in onther time. \n");;
               break;

            default:
              System.out.println("\n" + "Invalid Choise." + "\n");
        }
    }

    public void getChecking() {
        System.out.println("Checking My Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");  
        System.out.println("Choise : ");         
        
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()) );
                getAccountType();
                break;

            case 2:
               getCheckingWithdrawInput();
               getAccountType();
                break;

            case 3:
               getCheckingDepositInput();
               getAccountType();
               break;

            case 4:
               System.out.println("Thank You for Using This ATM, see you in onther time. \n");;
               break;

            default:
              System.out.println("\n" + "Invalid Choise." + "\n");
              getChecking();
        }
    }

    public void getSaving() {
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposite Funds");
        System.out.println("Type 4 - Exit");  
        System.out.println("Choise : ");         
        
        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getsavingBalance()) );
                getAccountType();
                break;

            case 2:
               getSavingWithdrawInput();
               getAccountType();
                break;

            case 3:
               getSavingDepositInput();
               getAccountType();
               break;

            case 4:
               System.out.println("Thank You for Using This ATM, see you in onther time. \n");;
               break;

            default:
              System.out.println("\n" + "Invalid Choise." + "\n");
              getChecking();
        }
    }
}
