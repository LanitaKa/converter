public class ConversionResult {
    private int num;
    private String startCurrencyType;
    private String finalCurrencyType;
    private double transactionRate;
    private double amount;
    private double total;

    public ConversionResult (int num, String startCurrencyType, String finalCurrencyType, double transactionRate, double amount, double total) {
        this.num = num;
        this.startCurrencyType = startCurrencyType;
        this.finalCurrencyType = finalCurrencyType;
        this.transactionRate = transactionRate;
        this.amount = amount;
        this.total = total;
    }

    @Override
    public String toString() {
        return String.format("%-7d %-5s %-5s %-10.4f %-10.2f %-10.2f%n",this.num, this.startCurrencyType, this.finalCurrencyType,
                this.transactionRate, this.amount, this.total);
    }
}
