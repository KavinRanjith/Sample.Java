public class mobileDevice extends Device {
    @Override
    public String getDevice() {
        return "This is Samsung Mobile";
    }

    @Override
    public void deviceCalled() {
        execute();
    }
}
