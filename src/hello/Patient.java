package hello;


public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String address;
    private String contactInfo;

    public Patient(int patientId, String name, int age, String address, String contactInfo) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public void displayPatientInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Info: " + contactInfo);
    }
}
