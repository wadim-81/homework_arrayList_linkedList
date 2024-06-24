import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


      /*1. Пользователь вводит в консоли число - количество данных, которые будет вводить
2. Далее пользователь начинает ввод данных через консоль (кол-во данных = числу, введенному ранее)
3. В каждой строке пользователь вводит:
            3.1 Количество денег, которые он хочет положить на вклад
3.2 Процент по вкладку
3.3 Количество лет (длительность вклада)
    Необходимо:
 1. Посчитать, сколько пользователь заработает с каждого вклада
2. Найти самый выгодный вклад (по наибольшему доходу от вклада)
3. Найти среднюю прибыль с каждого вклада

!!! Решать с использованием листа (ArrayList или LinkedList)!!!*/

        Scanner scanner = new Scanner(System.in);
        List<Deposit> deposits = new ArrayList<>();

        System.out.println("Введите количество вкладов:");
        int numberOfDeposits = scanner.nextInt();

        for (int i = 0; i < numberOfDeposits; i++) {
            System.out.println("Введите сумму вклада:");
            double amount = scanner.nextDouble();

            System.out.println("Введите процентную ставку:");
            double rate = scanner.nextDouble();

            System.out.println("Введите срок вклада в годах:");
            int age = scanner.nextInt();

            deposits.add(new Deposit(amount, rate, age));
        }

        Calculator calculator = new Calculator();
        Result result = calculator.calculateInfoAboutDeposit(deposits);

        System.out.println("Список прибылей с каждого вклада: " + result.getAllProfits());
        System.out.println("Средняя прибыль с вклада: " + result.getAverageProfitByDeposits()+ " EURO");
        System.out.println("Самый выгодный вклад: " + result.getMostProfitableDeposit());
    }
}











