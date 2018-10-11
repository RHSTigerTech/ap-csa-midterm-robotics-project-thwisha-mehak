import java.util.Scanner;
public class Krish {

    public static void main(String[] args) throws InterruptedException {

        KrishClass myBot = new KrishClass();
        myBot.talk("AAAAAAAAA");
        myBot.eye1();
        myBot.eye2();
        myBot.move();
//        myBot.Ask();

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
        myBot.eyes(255,0,0);
        Thread.sleep(2000);


        String name = " ";
        Scanner userInput = new Scanner(System.in);

        do
        {
            System.out.print("\nWhat is your name?");
            name = userInput.nextLine();
            System.out.print("BOOOOOO" + name + "let me sing you a song");
        }
        while (!name.equals("-1"));

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.charAt(3));

        myBot.disconnect();

    }




//        while (true) {
//
//        }
        }

