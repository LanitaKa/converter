import java.util.ArrayList;
import java.util.List;

public class History {
    private List<ConversionResult> history;

    public History () {
        this.history = new ArrayList<>();
    }

   public void addHistory (ConversionResult conversionResult) {
        history.add(conversionResult);
   }

   public void clearHistory () {
        history.clear();
   }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("%-7s %-5s %-5s %-10s %-10s %-10s%n","Number", "From", "To",
                "Rate", "Amount", "Total"));
        for (ConversionResult result : this.history ) {
        resultString.append(result.toString());
        }
        return resultString.toString();
    }
}
