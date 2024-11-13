package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;
import hello.Appointment;
import hello.Patient;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class AppointmentCrud {
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private int nextAppointmentId = 1;
    private Scanner scanner = new Scanner(System.in);

    public void scheduleAppointment() {
        System.out.print("Enter patient ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); 

       
        Patient patient = PatientCrud.findPatientById(patientId);
        if (patient == null) {
            System.out.println("Patient not found. Please register the patient before scheduling.");
            return;
        }

        System.out.print("Enter doctor name: ");
        String doctorName = scanner.nextLine();
        
        
        String date = "";
        while (true) {
            System.out.print("Enter appointment date (dd-mm-yyyy): ");
            date = scanner.nextLine();
            if (isValidDate(date)) {
                break;
            } else {
                System.out.println("Invalid date. The date must be after today's date.");
            }
        }

      
        String time = "";
        while (true) {
            System.out.print("Enter appointment time (HH:mm): ");
            time = scanner.nextLine();
            if (isValidTime(time)) {
                break;
            } else {
                System.out.println("Invalid time. Please enter the time in 24-hour format (HH:mm).");
            }
        }

        
        Appointment appointment = new Appointment(nextAppointmentId++, patientId, doctorName, date, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully for " + patient.getName() + ".");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.displayAppointment();
                System.out.println("------");
            }
        }
    }

   
    private boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate appointmentDate = LocalDate.parse(date, formatter);
            LocalDate today = LocalDate.now();
            return !appointmentDate.isBefore(today); 
        } catch (DateTimeParseException e) {
            return false; 
        }
    }

   
    private boolean isValidTime(String time) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime appointmentTime = LocalTime.parse(time, formatter);
            return true; 
        } catch (DateTimeParseException e) {
            return false; 
        }
    }
}
