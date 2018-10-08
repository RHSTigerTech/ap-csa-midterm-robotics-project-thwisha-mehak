import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

public class KrishClass extends HummingbirdRobot {
    private HummingbirdRobot robot;

    public KrishClass() {
        this.robot = new HummingbirdRobot();
    }

    public void talk(String phrase) throws InterruptedException
    {
        robot.speak(phrase);

        robot.setServoPosition(1, 10);
        Thread.sleep(200);
        robot.setServoPosition(1, 100);
        Thread.sleep(200);
        robot.setServoPosition(1, 10);
        Thread.sleep(200);
        robot.setServoPosition(1, 100);
        Thread.sleep(200);
        robot.setServoPosition(1, 10);
    }
    public void move()
    {
        robot.setMotorVelocity(2,100 );
        robot.setMotorVelocity(2,-100 );
        robot.setMotorVelocity(2,100 );
        robot.setMotorVelocity(2,-100 );

    }
    public void light()
    {
        robot.setFullColorLED(5,196,26,0);
        //Ask Mr.Crockett about the ledId

    }
    public void getSensorValue()
    {

        robot.getSensorValue(5);
    }


    }
}



    public void sensor()
