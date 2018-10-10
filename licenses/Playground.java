package licenses;

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class Playground {
    public static void main(String [] args) {
        HummingbirdRobot steve = new HummingbirdRobot();
        while (steve.getSensorValue(3)>0) {
            if(steve.getSensorValue(4)>100) {
                System.out.println("Bright");
                steve.setFullColorLED(1, 0, 0, 255);
            }

            else {
                System.out.println("Dark");
                steve.setFullColorLED(1, 255, 0, 0);
            }
//            System.out.println("Light sensor= " + steve.getSensorValue(4));
//            System.out.println("Distance sensor= " + steve.getSensorValue(3));
//            System.out.println();

        }
    }
}
