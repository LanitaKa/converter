import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the currency converter!");
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.addRate("USD", 1);
        exchangeRate.addRate("EUR", 0.915);
        exchangeRate.addRate("GBP", 0.786);
        exchangeRate.addRate("UAH", 36.34);


        int i = 0;
        Scanner scanner = new Scanner((System.in));
        History history = new History();
        while (true){
            System.out.println("Transaction: " + (i+1));
            System.out.println("Menu:");
            System.out.println("1. Convert currency");
            System.out.println("2. View transaction history");
            System.out.println("3. Clear transaction history");
            System.out.println("4. Exit");
            System.out.println("Enter your answer");
            int choice;
            while (true){
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    break;
                }
                scanner.nextLine();
                scanner.nextLine();
                System.out.println("The value entered is not a number. Try again");
            }

            if (choice == 1) {
                Transaction transaction = new Transaction(exchangeRate);
                transaction.startTransaction();
                ConversionResult conversionResult = new ConversionResult(i+1, transaction.startCurrencyType, transaction.finalCurrencyType, transaction.transactionRate, transaction.amount, transaction.total);
                history.addHistory(conversionResult);
                i++;
                continue;
            }

            if (choice == 2) {
                System.out.println(history);
                continue;
            }

            if (choice == 3) {
                history.clearHistory();
                System.out.println("The history has been cleared");
                continue;
            }

            if (choice == 4) {
                System.out.println("The converter is complete");
                break;
            }

            System.out.println("There is no such menu item. Try again");
        }
    }
}