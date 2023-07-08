// inside of Heater.java
public class Heater implements ACPowerable,Comparable, {

    public Integer fanSpeedPercent = 0;
    public Integer heatSettingPercent = 0;
    public Boolean isPluggedIn = false;
    public Integer maxWattage;

    public Heater(Integer maxWattage) {
        this.maxWattage = maxWattage;
    }

    public void applySettings(Integer fanSpeedPercent, Integer heatSettingPercent) {
        this.fanSpeedPercent = fanSpeedPercent;
        this.heatSettingPercent = heatSettingPercent;
    }

    public void plugIn() {
        isPluggedIn = true;
    }

    public void unPlug(int x) {
        isPluggedIn = false;
    }

    public void unplug() {
        isPluggedIn = false;
    }

    public boolean checkPluggedIn() {
        return isPluggedIn;
    }

    public void checkPowerConsumption() {
        if (isPluggedIn) {
            Double power = 0.0;
            // assuming both fan and heater contribute evenly to power consumption
            power += maxWattage * 0.5 * fanSpeedPercent * 0.01;
            power += maxWattage * 0.5 * heatSettingPercent * 0.01;
            System.out.println("The heater is consuming " + power + " Watts!");
        } else {
            System.out.println("The heater isn't plugged in!");
        }
    }

    @Override
    public void unPlug() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unPlug'");
    }

    @Override
    public int compareTo(Object o) {
        if(o isInsatanceOf user){
            User u =(User) o;

        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
