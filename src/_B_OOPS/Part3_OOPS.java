package _B_OOPS;

// ================= INTERFACE =================
interface ShopOperations {
    void sellChai(int cups);
    double calculateRevenue();
}

// ================= PARENT CLASS =================
class Shop {
    protected String branchName;

    public Shop(String branchName) {
        this.branchName = branchName;
    }

    public void showBranch() {
        System.out.println("Branch: " + branchName);
    }
}

// ================= CHILD CLASS =================
class ChaiShop extends Shop implements ShopOperations {

    // ===== Encapsulation =====
    private int cupsSold;
    private int pricePerCup;

    // Constructor
    public ChaiShop(String branchName, int cupsSold, int pricePerCup) {
        super(branchName);   // Inheritance
        this.cupsSold = cupsSold;
        this.pricePerCup = pricePerCup;
    }

    // ===== Getter =====
    public int getCupsSold() {
        return cupsSold;
    }

    // ===== Setter =====
    public void setPricePerCup(int price) {
        this.pricePerCup = price;
    }

    // ===== Interface Method 1 =====
    @Override
    public void sellChai(int cups) {
        cupsSold += cups;
        System.out.println(cups + " cups sold!");
    }

    // ===== Interface Method 2 =====
    @Override
    public double calculateRevenue() {
        return cupsSold * pricePerCup;
    }

    // Extra method
    public void display() {
        showBranch();
        System.out.println("Total Cups Sold: " + cupsSold);
        System.out.println("Revenue: " + calculateRevenue());
    }
}

// ================= MAIN CLASS =================
public class Part3_OOPS {

    public static void main(String[] args) {

        // Polymorphism (Interface reference)
        ShopOperations branch1 = new ChaiShop("Apple", 2, 6);

        branch1.sellChai(3);

        System.out.println("Revenue: " + branch1.calculateRevenue());
    }
}
