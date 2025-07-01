package inheritance;
class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(String id, String status, int temp) {
        super(id, status);
        this.temperatureSetting = temp;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temperature: " + temperatureSetting + "°C");
    }
}
