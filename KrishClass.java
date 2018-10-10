import edu.cmu.ri.createlab.hummingbird.HummingbirdRobot;

//import java.util.Scanner;

public class KrishClass extends HummingbirdRobot
{
    private HummingbirdRobot robot;


    public KrishClass()
    {
        //this.robot = new HummingbirdRobot();
        super();
    }


    public void talk(String phrase) throws InterruptedException
    {
        this.speak(phrase);

        this.setServoPosition(1, 10);
        Thread.sleep(200);
        this.setServoPosition(1, 100);
        Thread.sleep(200);
        this.setServoPosition(1, 10);
        Thread.sleep(200);
        this.setServoPosition(1, 100);
        Thread.sleep(200);
        this.setServoPosition(1, 10);
    }


    public void move() throws InterruptedException
    {
        this.setMotorVelocity(1, 10000);
         Thread.sleep(3000);



    }


    public void eye1()
    {
       this.setFullColorLED(2, 196, 26, 0);
        //Ask Mr.Crockett about the ledId
    }


    public void eye2()
    {
        this.setFullColorLED(1, 196, 26, 0);
    }

    public void eyes(int r, int g, int b){
        this.setFullColorLED(1,r,g,b);
        this.setFullColorLED(2,r,g,b);
    }



    public void getSensorValue()
    {
        this.getSensorValue(4);
    }


//    public void Ask()
//    {
//        String name = " ";
//        Scanner userInput = new Scanner(System.in);
//        do
//        {
//            System.out.print("\nWhat is your name?");
//            name = userInput.nextLine();
//            System.out.print("BOOOOOO" + name + "let me sing you a song" +);
//
//        }
//    }

}


//    public void sensor()
