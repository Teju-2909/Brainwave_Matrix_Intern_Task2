package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;

import hello.HealthRecord;
import hello.Patient;

public class HealthRecordCrud {

    private static ArrayList<HealthRecord> healthRecords = new ArrayList<>();
    private static int recordCounter = 1;
    Scanner scanner = new Scanner(System.in);
  
    public void addHealthRecord() {
     
        System.out.print("Enter patient ID to add health record: ");
        int patientId = scanner.nextInt();
        scanner.nextLine();

        
        Patient patient = PatientCrud.findPatientById(patientId);
        if (patient == null) {
            System.out.println("Patient not found. Please register the patient first.");
            return;
        }


        System.out.print("Enter diagnosis: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Enter treatment: ");
        String treatment = scanner.nextLine();
        System.out.print("Enter prescription: ");
        String prescription = scanner.nextLine();

     
        HealthRecord newRecord = new HealthRecord(recordCounter++, patientId, diagnosis, treatment, prescription);
        healthRecords.add(newRecord);
        System.out.println("Health record added successfully for " + patient.getName() + "!\n" + newRecord);
    }

 
   public void viewHealthRecords() {
        
        System.out.print("Enter patient ID to view health records: ");
        int patientId = scanner.nextInt();

        System.out.println("Health Records for Patient ID: " + patientId);
        boolean found = false;
        for (HealthRecord record : healthRecords) {
            if (record.getPatientId() == patientId) {
                System.out.println(record);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No health records found for this patient ID.");
        }
    }

   
    public void viewAllHealthRecords() {
        if (healthRecords.isEmpty()) {
            System.out.println("No health records available.");
        } else {
            System.out.println("All Health Records:");
            for (HealthRecord record : healthRecords) {
                System.out.println(record);
                System.out.println("------");
            }
        }
    }
}
