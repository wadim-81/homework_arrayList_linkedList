import java.util.List;
import java.util.Objects;

public class Result {

    private List<Double> allProfits;
    private Deposit mostProfitableDeposit;
    private double averageProfitByDeposits;

    public Result(List<Double> allProfits, Deposit mostProfitableDeposit, double averageProfitByDeposits) {
        this.allProfits = allProfits;
        this.mostProfitableDeposit = mostProfitableDeposit;
        this.averageProfitByDeposits = averageProfitByDeposits;
    }


    public List<Double> getAllProfits() {
        return allProfits;
    }

    public Deposit getMostProfitableDeposit() {
        return mostProfitableDeposit;
    }

    public double getAverageProfitByDeposits() {
        return averageProfitByDeposits;


    }
}





