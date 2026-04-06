import java.util.Scanner;
public class atmp39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int pin = 1234;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            int choice;

            while (true) {

                System.out.println("\n---- ATM MENU ----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Balance = " + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        int deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Updated Balance = " + balance);
                        break;

                    case 3:
                        System.out.print("Enter withdraw amount: ");
                        int withdraw = sc.nextInt();

                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Updated Balance = " + balance);
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Incorrect PIN");
        }

    }
}