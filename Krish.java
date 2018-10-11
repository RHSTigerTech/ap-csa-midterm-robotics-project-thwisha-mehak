import java.util.Scanner;
public class Krish {

    public static void main(String[] args) throws InterruptedException {

        KrishClass myBot = new KrishClass();
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        myBot.eye1();
        myBot.eye2();
        myBot.move();
        myBot.move2();
        myBot.SensorMethod(myBot);


        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        for (int i = 0; i < 10; i++) {
            myBot.eyes(r, g, b);
            Thread.sleep(200);
            r = (int) (Math.random() * 256);
            g = (int) (Math.random() * 256);
            b = (int) (Math.random() * 256);
        }
        myBot.eyes(255, 0, 0);
        Thread.sleep(2000);

        String name = "";
        int dayNoOfWeek = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("\nWhat is your FUll name Enter with space FirstN Lastname? \n");
        name = userInput.nextLine();

        System.out.print("Enter the Day of the week in Number format and I will read it back to you \n");

        do {
            dayNoOfWeek = userInput.nextInt();
        } while (!((dayNoOfWeek >= 1) && (dayNoOfWeek <= 7)));


            name = name.substring(name.indexOf(' ') + 1); //TRICKY

            name = "Hi" + " " + name + " " + "Today is ";
            System.out.println("Hi" + name);

            myBot.talk(name);
            myBot.talk("  ");
            myBot.talk(daysOfWeek[dayNoOfWeek - 1]);

            //myBot.playTone(2000, 10, 10000);
            // myBot.playClip();
            //myBot.disconnect();


        }
    }
