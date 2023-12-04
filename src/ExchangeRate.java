import java.util.HashMap;
import java.util.Map;

public class ExchangeRate {
    private final Map<String, Double> rates = new HashMap<>();


    public void addRate (String currency, double rate) {
        rates.put(currency,rate);
    }

    public Double getRate (String currency) {
        return rates.get(currency);
    }

    public boolean hasRate(String currency) {
        return rates.containsKey(currency);
    }

}

