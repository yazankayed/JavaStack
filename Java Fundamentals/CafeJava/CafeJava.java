public class CafeJava {
public static void main(String[] args) {
// APP VARIABLES
// Lines of text that will appear in the app.
String generalGreeting = "Welcome to Cafe Java, ";
String pendingMessage = ", your order will be ready shortly";
String readyMessage = ", your order is ready";
String displayTotalMessage = "Your total is $";
// Menu variables (add yours below)
double mochaPrice = 3.5;
double dripcofee=5;
double latte=10;
double cappuciano=2;

// Customer name variables (add yours below)
String customer1 = "Cindhuri";
String customer2 ="Sam";
String customer3= "Jimmy";
String customer4="Noah";
// Order completions (add yours below)
boolean isReadyOrder1 = false;
boolean isReadyOrder2 = true;
boolean isReadyOrder3 = false;
boolean isReadyOrder4 = true;
// APP INTERACTION SIMULATION (Add your code for the challenges below)
// Example:
System.out.println(generalGreeting + customer1); // Displays "Welcome to CafeJava, Cindhuri"
// ** Your customer interaction print statements will go here ** //
System.out.println(pendingMessage);
if (isReadyOrder4 == true){
    System.out.println(readyMessage + "\n" +displayTotalMessage+cappuciano);
}
else{
    System.out.println(pendingMessage);
}
System.out.println(2*latte);
System.out.println(dripcofee -latte);

}
}