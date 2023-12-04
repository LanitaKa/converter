import java.util.Scanner;
public class Transaction {
   public double startCurrencyRate;
   public double finalCurrencyRate;

   public double transactionRate;

   public double total;

    public String startCurrencyType;
    public String finalCurrencyType;
   public double amount;
    private ExchangeRate exchangeRate;

    public Transaction (ExchangeRate exchangeRate){
        this.exchangeRate = exchangeRate;
    };

    public void startTransaction () {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Convert currency");
        System.out.println("Enter the starting currency: USD, EUR, GBP, UAH");
        while (true) {
            this.startCurrencyType = scanner.next().toUpperCase();
            if (this.exchangeRate.hasRate(this.startCurrencyType)){
                this.startCurrencyRate = this.exchangeRate.getRate(this.startCurrencyType);
                break;
            }
            System.out.println("You have entered the wrong currency! Try again");
        }
        System.out.println("Enter the amount:");

        while (true){
            if (scanner.hasNextDouble()) {
                this.amount = scanner.nextDouble();
                break;
            }
            scanner.nextLine();
            scanner.nextLine();
            System.out.println("The value entered is not a number. Try again");
        }

        System.out.println("Enter the final currency: USD, EUR, GBP, UAH");
        while (true) {
            this.finalCurrencyType = scanner.next().toUpperCase();
            if (this.exchangeRate.hasRate(this.finalCurrencyType)){
                this.finalCurrencyRate = this.exchangeRate.getRate(this.finalCurrencyType);
                break;
            }
            System.out.println("You have entered the wrong currency! Try again");
        }
        this.transactionRate = this.finalCurrencyRate / this.startCurrencyRate;

        this.total = this.amount * this.transactionRate;


        System.out.println("You exchange " + this.amount + " "+ this.startCurrencyType);
        System.out.println("Exchange rate " + this.transactionRate);
        System.out.println("You will receive " + this.total + " "+ this.finalCurrencyType);
    }
}
