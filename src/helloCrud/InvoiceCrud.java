package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;

import hello.Invoice;
import hello.Patient;

public class InvoiceCrud {

    static ArrayList<Invoice> invoices = new ArrayList<>();
    static int invoiceCounter = 1;
    Scanner scanner = new Scanner(System.in);
   
    public void createInvoice() {
      
        System.out.print("Enter patient ID for billing: ");
        int patientId = scanner.nextInt();
        
      
        Patient patient = PatientCrud.findPatientById(patientId);
        
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }
        
        System.out.print("Enter invoice amount: ");
        double amount = scanner.nextDouble();

        
        Invoice newInvoice = new Invoice(invoiceCounter++, patientId, amount);
        invoices.add(newInvoice);
        System.out.println("Invoice created successfully!\n" + newInvoice);
    }

    public void viewInvoices() {
        if (invoices.isEmpty()) {
            System.out.println("No invoices found.");
        } else {
            for (Invoice invoice : invoices) {
                System.out.println(invoice);
            }
        }
    }
}
