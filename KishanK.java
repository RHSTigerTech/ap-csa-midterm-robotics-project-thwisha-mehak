// Import the HummingBirdRobot library and all the methods that come with it


// Extend the Hummingbird Robot class
//If we want to pause execution Thread.sleep(1000) we need yo handle an exception

import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class KishanK extends HummingbirdRobot
{
    //create a main method
    public static void main(String[] args) throws InterruptedException
    {
        //create a hummingbird object
        HummingbirdRobot kishanK = new HummingbirdRobot();

        //Turn on the single color LED
        kishanK.setLED(1, 200);

        //sleep 1 second
        try
       {
            // Thread.sleep(1000);
        }catch (InterruptedException e)
        //don't panic just pausing)
        kishanK.setLED(1,0);

        //Turn on the tri-color LED so that it is green.
        kishanK.setFullColorLED(1,0,225,0);
        Thread.sleep(1000);
        kishanK.setFullColorLED(1,0,0,0);

        //Use a for loop to randomly change the color of the LED
        int r = (int) (Math.random()*256);
        int g = (int) (Math.random()*256);
        int b = (int) (Math.random()*256);

        for (int i = 0; i < 10; i++)
        {
            kishanK.setFullColorLED(1,r,g,b);
            Thread.sleep(200);
            r = (int) (Math.random()*256);
            g = (int) (Math.random()*256);
            b = (int) (Math.random()*256);
        }

        //turn on motor
        kishanK.setMotorVelocity(2,200);
        Thread.sleep(2000);


        while (true)
        {
            System.out.println(kishanK.getSensorValue(1));
            kishanK.setLED(1,kishanK.getSensorValue(1));

            if (kishanK.);
        }


        {
            //Always disconnect from the robot at the end of the program
            kishanK.disconnect();
        }
    }
}


