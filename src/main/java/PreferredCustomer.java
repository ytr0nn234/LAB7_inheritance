public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer() {
        super(); // Вызов конструктора Customer() -> Person()
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber,
                             int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    private void updateDiscountLevel() {
        if (loyaltyPoints >= 2000) {
            discountLevel = 0.10; // 10%
        } else if (loyaltyPoints >= 1500) {
            discountLevel = 0.07; // 7%
        } else if (loyaltyPoints >= 1000) {
            discountLevel = 0.06; // 6%
        } else if (loyaltyPoints >= 500) {
            discountLevel = 0.05; // 5%
        } else {
            discountLevel = 0.00; // 0%
        }
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    // Override toString
    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + (discountLevel * 100) + "%" +
                '}';
    }
}