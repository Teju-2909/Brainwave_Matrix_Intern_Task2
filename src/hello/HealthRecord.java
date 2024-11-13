package hello;

public class HealthRecord {
	 private int recordId;
	 private int patientId;
	 private String diagnosis;
	 private String treatment;
	 private String prescription;

    public HealthRecord(int recordId, int patientId, String diagnosis, String treatment, String prescription) {
        this.recordId = recordId;
       this.patientId = patientId;;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
    }


	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}


	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
    public String toString() {
        return "Record ID: " + recordId +", PatientId: "+ patientId+ ", Diagnosis: " + diagnosis + ", Treatment: " + treatment + ", Prescription: " + prescription;
    }
}
