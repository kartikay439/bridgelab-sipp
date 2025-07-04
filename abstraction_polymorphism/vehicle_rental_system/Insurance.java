package abstraction_polymorphism.vehicle_rental_system;


public class Insurance {
    private String expiryDate;
    private String startDate; 
    private double insuranceCost;
    private String insuranceCompany;
    public Insurance(String expiryDate, String startDate, double insuranceCost, String insuranceCompany) {
        this.expiryDate = expiryDate;
        this.startDate = startDate;
        this.insuranceCost = insuranceCost;
        this.insuranceCompany = insuranceCompany;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public double getInsuranceCost() {
        return insuranceCost;
    }
    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }
    public String getInsuranceCompany() {
        return insuranceCompany;
    }
    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }
}
