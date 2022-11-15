//hide implementation function using abstract concept
//child class(Inheritance)
public class mobileDevice implements IDevice {
    @Override
    public String getDevice() {
        return "This is Samsung Mobile";
    }

    @Override
    public void deviceCalled() {
//        execute();
        System.out.println("Mobile Interface");
    }
}
