class Patient {
    String name;
    public Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        patients.add(p);
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }
}
