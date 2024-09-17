package hws.example.e157;

public class E157TransactionCalculator {

    public int calculateProfit(int profit1, int profit2) {
        int totalRevenue = profit1 + profit2;
        int totalCost = 100;
        return totalRevenue - totalCost;
    }
    public int calculateProfit(int profit1, int profit2, int profit3) {
        int totalRevenue = profit1 + profit2 + profit3;
        int totalCost = 150;
        return totalRevenue - totalCost;
    }
    public int calculateProfit(int profit1, int profit2, int profit3, int profit4) {
        int totalRevenue = profit1 + profit2 + profit3 + profit4;
        int totalCost = 200;
        return totalRevenue - totalCost;
    }
    }




