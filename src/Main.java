public class Main {
    public static void main(String[] args) {
        Device device = new mobileDevice();
        Device device1 = new LaptopDevice();
        System.out.println(device.getDevice());
        System.out.println(device1.getDevice());
        device.deviceCalled();
        device1.deviceCalled();
    }
}