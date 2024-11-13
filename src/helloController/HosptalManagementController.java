package helloController;

import java.util.Scanner;
import helloCrud.AppointmentCrud;
import helloCrud.HealthRecordCrud;
import helloCrud.InventoryCrud;
import helloCrud.InvoiceCrud;
import helloCrud.PatientCrud;
import helloCrud.StaffCrud;

public class HosptalManagementController {
    public static void main(String[] args) {
        AppointmentCrud appointmentCrud = new AppointmentCrud();
        HealthRecordCrud healthRecordCrud = new HealthRecordCrud();
        InventoryCrud inventoryCrud = new InventoryCrud();
        InvoiceCrud invoiceCrud = new InvoiceCrud();
        PatientCrud patientCrud = new PatientCrud();
        StaffCrud staffCrud = new StaffCrud();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Add Health Record for a Patient");
            System.out.println("6. View Health Records of a Patient");
            System.out.println("7. View All Health Records of a Patient");
            System.out.println("8. Add a New Staff Member");
            System.out.println("9. View All Staff Members");
            System.out.println("10. Update Staff Details");
            System.out.println("11. Create Bill");
            System.out.println("12. Display All Invoices");
            System.out.println("13. Display Invoice by Patient ID");
            System.out.println("14. Manage Inventory");
            System.out.println("15. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Enter patient address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter contact info: ");
                    String contactInfo = scanner.nextLine();
                    patientCrud.registerPatient(name, age, address, contactInfo);
                    break;

                case 2:
                    patientCrud.viewPatients();
                    break;

                case 3:
                    appointmentCrud.scheduleAppointment();
                    break;

                case 4:
                    appointmentCrud.viewAppointments();
                    break;

                case 5:
                    healthRecordCrud.addHealthRecord();
                    break;

                case 6:
                    healthRecordCrud.viewHealthRecords();
                    break;

                case 7:
                    healthRecordCrud.viewAllHealthRecords();
                    break;

                case 8:
                    staffCrud.addStaff();
                    break;

                case 9:
                    staffCrud.viewStaff();
                    break;

                case 10:
                    staffCrud.updateStaff();
                    break;

                case 11:
                    invoiceCrud.processBilling();
                    break;

                case 12:
                    invoiceCrud.displayInvoices();
                    break;

                case 13:
                    System.out.print("Enter Patient ID to display invoice: ");
                    int patientId = scanner.nextInt();
                    invoiceCrud.displayInvoiceByPatientId(patientId);
                    break;

                case 14:
                    inventoryCrud.displayMenu();
                    break;

                case 15:
                    System.out.println("Exiting Hospital Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
