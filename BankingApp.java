Title: Banking Application
Name: Ma. Angela Mancera

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] users = new BankAccount[] {
            new BankAccount(412435, "Chris Sandoval", 7452, 32_000),
            new BankAccount(264863, "Marc Yim", 1349, 1_000)
        };

        while (true) {
            System.out.println("\nWelcome to the Bank Portal\n");
            System.out.println("(1) Log in");
            System.out.println("(2) Close");

            System.out.print("\nSelect an option (1-2): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid. Select 1 or 2.\n");
                sc.next(); 
            }
            int mainOption = sc.nextInt();
            sc.nextLine();

            switch (mainOption) {
                case 1:
                    System.out.print("\nEnter your User ID: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid ID. Please try again.\n");
                        sc.next();
                    }
                    int inputUserId = sc.nextInt();
                    sc.nextLine(); 

                    BankAccount currentUser = null;
                    for (BankAccount user : users) {
                        if (user.userId == inputUserId) {
                            currentUser = user;
                            break;
                        }
                    }

                    if (currentUser != null) {
                        currentUser.user(sc);
                        currentUser.displayAccountOption(sc, users);
                    } else {
                        System.out.println("User ID not found. Please try again.\n");
                    }
                    break;

                case 2:
                    System.out.println("\nExiting the system...");
                    System.out.println("-----------------------------------------");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid. Please select 1 or 2.");
            }
        }
    }

    static class BankAccount {
        String name;
        int userId;
        int userPin;
        int balance;
        int previousTransaction;

        public BankAccount(int userId, String name, int userPin, int balance) {
            this.userId = userId;
            this.userPin = userPin;
            this.name = name;
            this.balance = balance;
        }

        void user(Scanner sc) {
            boolean loginCheck = false;
            while (!loginCheck) {
                try {
                    System.out.print("Enter your 4-PIN number: ");
                    int inputUserPin = sc.nextInt();

                    if (this.userPin == inputUserPin) {
                        System.out.println("-----------------------------------------");
                        System.out.println("\nWelcome, " + this.name + "!");
                        loginCheck = true;
                    } else {
                        System.out.println("Invalid PIN. Please try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter numeric values.\n");
                    sc.nextLine(); 
                }
            }
        }

        void cashIn(int amount) {
            if (amount > 0) {
                balance += amount;
                previousTransaction = amount;
                System.out.println("\nDeposited: " + amount);
                System.out.println("Your updated balance is: " + balance);
            } else {
                System.out.println("Amount must be positive.");
            }
        }

        void transferMoney(int amount, BankAccount recipient) {
            if (amount > balance) {
                System.out.println("Insufficient balance for transfer.");
            } else {
                balance -= amount;
                recipient.balance += amount;
                System.out.println("\nYou transferred " + amount + " to " + recipient.name);
                System.out.println("Updated balance: " + balance);
            }
        }

        void displayAccountOption(Scanner sc, BankAccount[] users) {
            int option;
            do {
                System.out.println("\n(1) Check Balance");
                System.out.println("(2) Deposit Money");
                System.out.println("(3) Transfer Money");
                System.out.println("(4) Log out");

                System.out.print("\nSelect an option (1-4): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid. Select a number from 1 to 4.\n");
                    sc.next();
                }
                option = sc.nextInt();
                sc.nextLine(); 

                switch (option) {
                    case 1:
                        System.out.println("\nYour balance is: " + balance);
                        break;
                    case 2:
                        System.out.print("\nAmount to deposit: ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Invalid. Please enter a positive number.");
                            sc.next();
                        }
                        int depositAmount = sc.nextInt();
                        if (depositAmount > 0) {
                            cashIn(depositAmount);
                        } else {
                            System.out.println("Amount must be positive.");
                        }
                        break;
                    case 3:
                        System.out.print("\nEnter the name of the person you want to transfer money to: ");
                        String recipientName = sc.nextLine().trim();

                        BankAccount recipient = findRecipient(recipientName, users);
                        if (recipient == null) {
                            System.out.println("Recipient not found. Please check the name and try again.");
                        } else if (recipient == this) {
                            System.out.println("You cannot transfer money to yourself. Use the '(2) deposit money' option instead.");
                        } else {
                            System.out.print("Enter the amount to transfer: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("Invalid input. Please enter a valid amount.");
                                sc.next();
                            }
                            int transferAmount = sc.nextInt();
                            if (transferAmount > 0) {
                                transferMoney(transferAmount, recipient);
                            } else {
                                System.out.println("Amount must be positive.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\nLogging out...");
                        System.out.println("-----------------------------------------");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                        break;
                }
            } while (option != 4);
        }

        BankAccount findRecipient(String name, BankAccount[] users) {
            for (BankAccount user : users) {
                if (user.name.equalsIgnoreCase(name)) {
                    return user;
                }
            }
            return null;
        }
    }
}
