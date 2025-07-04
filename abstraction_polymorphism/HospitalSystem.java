package abstraction_polymorphism;


import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

// Abstract Patient class
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    private List<String> medicalHistory = new ArrayList<>(); // Encapsulated
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age +
               ", Diagnosis: " + diagnosis;
    }

    // Encapsulated access to sensitive data
    protected void addToHistory(String entry) {
        medicalHistory.add(entry);
    }

    protected List<String> getHistory() {
        return new ArrayList<>(medicalHistory); // return a copy
    }
}

// InPatient with room charges and treatment fees
class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRoomCharge;
    private double treatmentCharges;

    public InPatient(String patientId, String name, int age, String diagnosis,
                     int numberOfDays, double dailyRoomCharge, double treatmentCharges) {
        super(patientId, name, age, diagnosis);
        this.numberOfDays = numberOfDays;
        this.dailyRoomCharge = dailyRoomCharge;
        this.treatmentCharges = treatmentCharges;
    }

    @Override
    public double calculateBill() {
        return (numberOfDays * dailyRoomCharge) + treatmentCharges;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("InPatient Record: " + record);
    }

    @Override
    public List<String> viewRecords() {
        return getHistory();
    }
}

// OutPatient with consultation charges only
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("OutPatient Record: " + record);
    }

    @Override
    public List<String> viewRecords() {
        return getHistory();
    }
}

// Main system
public class HospitalSystem {

    public static void runHospitalSystem() {
        List<Patient> patients = new ArrayList<>();

        Patient inPatient = new InPatient("P001", "Alice", 45, "Appendicitis", 4, 2000, 5000);
        Patient outPatient = new OutPatient("P002", "Bob", 30, "Fever", 800);

        patients.add(inPatient);
        patients.add(outPatient);

        ((MedicalRecord) inPatient).addRecord("Surgery performed on 1st July");
        ((MedicalRecord) outPatient).addRecord("Prescribed antibiotics");

        processPatients(patients);
    }

    public static void processPatients(List<Patient> patientList) {
        for (Patient p : patientList) {
            System.out.println(p.getPatientDetails());
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                System.out.println("Medical Records:");
                for (String rec : ((MedicalRecord) p).viewRecords()) {
                    System.out.println("- " + rec);
                }
            }

            System.out.println("-------------------------------------");
        }
    }

    public static void main(String[] args) {
        runHospitalSystem();
    }
}
