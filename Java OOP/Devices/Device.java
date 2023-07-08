public class Device {
    int battery;
    public Device(){
        this.battery=100;
    }



    public void displayBattery(){
        System.out.println("The remaining Battery is = "+this.battery);

    }
    @Override
    public String toString() {
        return super.toString();
    }







}
