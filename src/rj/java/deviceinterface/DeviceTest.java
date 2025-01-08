package rj.java.deviceinterface;
public class DeviceTest {
    public static void main(String[] args) {
        // Show interface-level information
        Device.showDeviceInfo();

        // Create device instances
        Device smartphone = new Smartphone();
        Device laptop = new Laptop();
        Device tablet = new Tablet();

        // Test Smartphone
        smartphone.turnOn();
        smartphone.connectWiFi("SmartHome Network");
        smartphone.showBatteryStatus(50);
        smartphone.enableWiFi();
        smartphone.turnOff();

        // Test Laptop
        laptop.turnOn();
        laptop.connectWiFi("Office Network");
        laptop.showBatteryStatus(80);
        laptop.disableWiFi();
        laptop.turnOff();

        // Test Tablet
        tablet.turnOn();
        tablet.connectWiFi("Public Network");
        tablet.showBatteryStatus(60);
        tablet.turnOff();
    }
}