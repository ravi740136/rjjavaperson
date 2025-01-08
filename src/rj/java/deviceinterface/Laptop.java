package rj.java.deviceinterface;
// Implementing the Device interface with Laptop class
class Laptop implements Device {
    private int batteryLevel;

    @Override
    public void turnOn() {
        System.out.println(POWER_ON_MESSAGE + " Laptop is on.");
        batteryLevel = 80; // Set initial battery level when turning on
    }

    @Override
    public void turnOff() {
        System.out.println(POWER_OFF_MESSAGE + " Laptop is off.");
    }

    @Override
    public void connectWiFi(String network) {
        System.out.println("Laptop is connecting to Wi-Fi network: " + network);
    }
}