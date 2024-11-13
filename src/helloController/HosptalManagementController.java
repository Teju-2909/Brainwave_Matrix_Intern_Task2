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
        AppointmentCrud system = new AppointmentCrud ();
        HealthRecordCrud system1=new HealthRecordCrud();
        InventoryCrud system2=new InventoryCrud();
        InvoiceCrud system3=new InvoiceCrud();
        PatientCrud system4=new PatientCrud();
        StaffCrud system5=new StaffCrud();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Add health record for a patient");
            System.out.println("6. View health records of a patient");
            System.out.println("7. View All health records of a patient");
            System.out.println("8. Add a new staff member");
            System.out.println("9. View all staff members");
            System.out.println("10. Update staff details");
            System.out.println("11. Create an invoice");
            System.out.println("12. Manage inventory");
            System.out.println("13. Exit");
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
                    system4.registerPatient(name, age, address, contactInfo);
                    break;

                case 2:
                    system4.viewPatients();
                    break;

                case 3:
                   system.scheduleAppointment();
                    break;

                case 4:
                    system.viewAppointments();
                    break;
                case 5:
                	system1.addHealthRecord();
                    break;
                case 6:
                	system1.viewHealthRecords();
                    break;
                case 7:
                	system1.viewAllHealthRecords();
                    break;
                case 8:
                	system5.addStaff();
                    break;
                case 9:
                	system5.viewStaff();
                    break;
                case 10:
                	system5.updateStaff();
                    break;
                case 11:
                	system3.createInvoice();
                    break;
                case 12:
                	system2.displayMenu();
                    break;
                case 13:
                    System.out.println("Exiting Hospital Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
