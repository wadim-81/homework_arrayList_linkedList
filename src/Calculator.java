import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public Result calculateInfoAboutDeposit(List<Deposit> deposits) {

        double maxProfit = 0;
        Deposit mostProfitableDeposit = null;
        double sumOfProfits = 0.0;
        List<Double> profits = new ArrayList<>();

        for (Deposit deposit : deposits) {
            double profit = deposit.calculateProfit();
            profits.add(profit);
            sumOfProfits += profit;

            if (profit > maxProfit) {
                maxProfit = profit;
                mostProfitableDeposit = deposit;
            }
        }

        double averageProfit = sumOfProfits / deposits.size();
        return new Result(profits, mostProfitableDeposit, averageProfit);
    }
    }








