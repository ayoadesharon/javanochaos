public class Main {
    public static void main(String[] args) {

        double annualProfit = 30000 - 5000;

        double fixedSales = (6.0 / 100 * 5000) + (8.0 / 100 * 5000);

        annualProfit -= fixedSales;

        double sales = 10.0 / 100 * 10000;

        int salesCount = 2;

        for (int i = 0; i < 100; i++) {

            if (annualProfit > 0) {
                annualProfit -= sales;
                salesCount++;
            }
            else {
                break;
            }
        }

        System.out.println("We need to make " + salesCount + " sales");
    }
}
