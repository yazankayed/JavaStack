public class Phone extends Device {
    public Phone(){
        super();
    }
    public void makeCall(){
        battery-=5;
                System.out.println("You are making a phone call.");
        System.out.println("The remaining Battery is = "+battery);
    } 
    public void playGame(){
        battery-=20;
        System.out.println("You are playing a game.");
        System.out.println("The remaining Battery is = "+battery);
    }
    public void chargePhone(){
        battery+=50;
        System.out.println("You have charged the phone.");
        System.out.println("The remaining Battery is = "+battery);
    }
}
