class HospitalEmployee {
    protected String name;
    protected int number;

    HospitalEmployee(String newName, int newNumber) {
        this.name = newName;
        this.number = newNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return this.name + " " + this.number;
    }

    public void work() {
        System.out.println(name + " works for hospital");
    }
}

class Nurse extends HospitalEmployee {
    protected int numOfPatients;

    Nurse(String newName, int newNumber, int numPatients) {
        super(newName, newNumber);
        this.name = newName;
        this.number = newNumber;
        this.numOfPatients = numPatients;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.numOfPatients;
    }

    public void work() {
        System.out.println(name + " works for hospital");
    }
}

class Doctor extends HospitalEmployee {
    protected String speciality;

    Doctor(String newName, int newNumber, String newSpeciality) {
        super(newName, newNumber);
        this.name = newName;
        this.number = newNumber;
        this.speciality = newSpeciality;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.speciality;
    }

    public void work() {
        System.out.println(name + " works for hospital");
    }
}

class Surgeon extends Doctor {
    protected boolean operating;

    Surgeon(String newName, int newNumber, String newSpeciality, boolean newOperating) {
        super(newName, newNumber, newSpeciality);
        this.name = newName;
        this.number = newNumber;
        this.speciality = newSpeciality;
        this.operating = newOperating;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.speciality + " " + this.operating;
    }

    public void work() {
        System.out.println(name + " works for hospital");
    }
}
