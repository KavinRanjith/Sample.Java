//hide implementation function using abstract concept
//child class(Inheritance)
public class LaptopDevice implements IDevice{
    @Override
    public String getDevice() {
        return "This is Dell Laptop";
    }

    @Override
    public void deviceCalled() {
        System.out.println("Lap Interface");
    }
}
