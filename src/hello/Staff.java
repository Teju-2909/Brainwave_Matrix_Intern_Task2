package hello;

public class Staff {
    private int staffId;
    private String name;
    private String position;
    private double salary;

    public Staff(int staffId, String name, String position, double salary) {
        this.staffId=staffId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
    public String toString() {
        return "Staff ID: " + getStaffId() + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }

	
}
