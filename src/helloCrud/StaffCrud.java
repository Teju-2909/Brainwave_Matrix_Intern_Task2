package helloCrud;

import java.util.ArrayList;
import java.util.Scanner;

import hello.Staff;


public class StaffCrud {


    static ArrayList<Staff> staffMembers = new ArrayList<>();
   
    static int staffCounter = 1;
    Scanner scanner = new Scanner(System.in);
    
	
	
	 public void addStaff() {
	       
	        System.out.print("Enter staff name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter staff position (e.g., Doctor, Nurse): ");
	        String position = scanner.nextLine();
	        System.out.print("Enter staff salary: ");
	        double salary = scanner.nextDouble();

	        Staff newStaff = new Staff(staffCounter++, name, position, salary);
	        staffMembers.add(newStaff);
	        System.out.println("Staff member added successfully!\n" + newStaff);
	    }

	  
	    public  void viewStaff() {
	        System.out.println("List of All Staff Members:");
	        for (Staff staff : staffMembers) {
	            System.out.println(staff);
	        }
	    }

	  
	    public void updateStaff() {
	      
	        System.out.print("Enter staff ID to update: ");
	        int staffId = scanner.nextInt();
	        scanner.nextLine(); 

	        boolean found = false;
	        for (Staff staff : staffMembers) {
	            if (staff.getStaffId() == staffId) {
	                found = true;
	                System.out.println("Updating details for Staff ID: " + staffId);
	                System.out.print("Enter new name (or press enter to keep current): ");
	                String name = scanner.nextLine();
	                if (!name.isEmpty()) staff.setName(name);

	                System.out.print("Enter new position (or press enter to keep current): ");
	                String position = scanner.nextLine();
	                if (!position.isEmpty()) staff.setPosition(position);

	                System.out.print("Enter new salary (or press enter to keep current): ");
	                String salaryInput = scanner.nextLine();
	                if (!salaryInput.isEmpty()) staff.setSalary(Double.parseDouble(salaryInput));

	                System.out.println("Staff member updated successfully!\n" + staff);
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Staff member with ID " + staffId + " not found.");
	        }
	    }
	
}
