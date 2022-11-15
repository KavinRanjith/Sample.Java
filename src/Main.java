public class Main {
    public static void main(String[] args) {
        IDevice device = new mobileDevice();      //parent class with new object method...
        IDevice device1 = new LaptopDevice();
        System.out.println(device.getDevice());   //return method...
        System.out.println(device1.getDevice());
        device.deviceCalled();                    //O/p...
        device1.deviceCalled();
    }
}