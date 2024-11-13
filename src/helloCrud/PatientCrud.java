package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import hello.Patient;

public class PatientCrud {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static int nextPatientId = 1;
    private static Scanner scanner = new Scanner(System.in);

    public void registerPatient(String name, int age, String address, String contactInfo) {
    
        while (!isValidContactInfo(contactInfo)) {
            System.out.println("Invalid contact number. Please enter a 10-digit contact number.");
            System.out.print("Enter contact info: ");
            contactInfo = scanner.nextLine(); 
        }

        
        Patient patient = new Patient(nextPatientId++, name, age, address, contactInfo);
        patients.add(patient);
        System.out.println("Patient registered successfully.");
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
        } else {
            for (Patient patient : patients) {
                patient.displayPatientInfo();
                System.out.println("------");
            }
        }
    }

    
    private boolean isValidContactInfo(String contactInfo) {
        
        String regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contactInfo);
        return matcher.matches();
    }

    public static Patient findPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }
}
