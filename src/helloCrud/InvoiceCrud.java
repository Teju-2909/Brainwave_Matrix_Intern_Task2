package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;
import hello.Invoice;
import hello.Patient;

import hello.Bill;

public class InvoiceCrud {

    private static ArrayList<Invoice> invoices = new ArrayList<>();
    private static int invoiceCounter = 1;

    
    public void processBilling() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter patient ID for billing: ");
        int patientId = scanner.nextInt();

        Patient patient = PatientCrud.findPatientById(patientId);
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        System.out.print("Enter total amount for billing: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Enter any applicable tax percentage: ");
        double taxPercentage = scanner.nextDouble();

        System.out.print("Enter any discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        
        Bill bill = new Bill(totalAmount, taxPercentage, discountPercentage);

     
        Invoice invoice = new Invoice(invoiceCounter++, patientId, bill.getFinalAmount());
        invoices.add(invoice);

       
        System.out.println("Billing Summary for Patient ID: " + patientId);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Total Amount: " + bill.getTotalAmount());
        System.out.println("Tax Amount (" + bill.getTaxPercentage() + "%): " + bill.getTaxAmount());
        System.out.println("Discount Amount (" + bill.getDiscountPercentage() + "%): " + bill.getDiscountAmount());
        System.out.println("Final Amount to Pay: " + bill.getFinalAmount());
        System.out.println("Invoice created successfully!\n" + invoice);
    }

   
    public void displayInvoices() {
        if (invoices.isEmpty()) {
            System.out.println("No invoices available.");
            return;
        }

        System.out.println("------ Invoice Details ------");
        for (Invoice invoice : invoices) {
            int patientId = invoice.getPatientId();
            Patient patient = PatientCrud.findPatientById(patientId);

            System.out.println("Invoice ID: " + invoice.getInvoiceId());
            System.out.println("Patient ID: " + patientId);
            if (patient != null) {
                System.out.println("Patient Name: " + patient.getName());
            }
            System.out.println("Amount: " + invoice.getAmount());
            System.out.println("-----------------------------");
        }
    }

   
    public void displayInvoiceByPatientId(int patientId) {
        boolean found = false;
        
        System.out.println("------ Invoice Details for Patient ID: " + patientId + " ------");
        
        for (Invoice invoice : invoices) {
            if (invoice.getPatientId() == patientId) {
                found = true;
                Patient patient = PatientCrud.findPatientById(patientId);
                
                System.out.println("Invoice ID: " + invoice.getInvoiceId());
                System.out.println("Patient ID: " + patientId);
                if (patient != null) {
                    System.out.println("Patient Name: " + patient.getName());
                }
                System.out.println("Amount: " + invoice.getAmount());
                System.out.println("-----------------------------");
            }
        }
        
        if (!found) {
            System.out.println("No invoices found for Patient ID: " + patientId);
        }
    }
}
