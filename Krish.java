public class Krish {

    public static void main(String[] args) throws InterruptedException {

        KrishClass myBot = new KrishClass();
        myBot.talk("WOOF WOOF");
        myBot.move();
        myBot.light();


        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        for (int i = 0; i < 10; i++)
            myBot.light();
        Thread.sleep(200);
        r = (int) (Math.random() * 256);
        g = (int) (Math.random() * 256);
        b = (int) (Math.random() * 256);


        while (true)
        {

        }


    }

}