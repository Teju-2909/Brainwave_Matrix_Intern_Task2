package hello;

public class Bill {
    private double totalAmount;
    private double taxPercentage;
    private double discountPercentage;
    private double finalAmount;
    private double taxAmount;
    private double discountAmount;

    
    public Bill(double totalAmount, double taxPercentage, double discountPercentage) {
        this.totalAmount = totalAmount;
        this.taxPercentage = taxPercentage;
        this.discountPercentage = discountPercentage;
        calculateAmounts();
    }

    private void calculateAmounts() {
        this.taxAmount = (totalAmount * taxPercentage) / 100;
        this.discountAmount = (totalAmount * discountPercentage) / 100;
        this.finalAmount = totalAmount + taxAmount - discountAmount;
    }

    
    public double getTaxAmount() {
        return taxAmount;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
