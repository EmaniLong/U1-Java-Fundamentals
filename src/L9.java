import javax.swing.JOptionPane;


public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("what is your name?");
        lastName = JOptionPane.showInputDialog("what is your last name?");

        //all input is considered string data

        JOptionPane.showMessageDialog(null, "hello world!" + firstName +" " + lastName + "!!");

        int mph;
        int minutes;
        double hours;
        double distance;

        //mph = JOptionPane.showInputDialog("what was your speed?");
        //minutes = JOptionPane.showInputDialog("how long, IN MINUTES , did you travel?");

        //distance = hours * mph;

        System.exit(0);
    }
}
