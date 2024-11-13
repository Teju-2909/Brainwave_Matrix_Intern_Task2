package hello;

public class Invoice {
	 private int invoiceId;
	 private int patientId;
	 private double amount;
	 private boolean isPaid;

    public Invoice(int invoiceId, int patientId, double amount) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.isPaid = false;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
    public String toString() {
        return "Invoice ID: " + invoiceId + ", Patient ID: " + patientId + ", Amount: $" + amount + ", Paid: " + (isPaid ? "Yes" : "No");
    }
}