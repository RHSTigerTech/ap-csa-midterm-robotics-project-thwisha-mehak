public class Krish
{

    public static void main(String[] args) throws InterruptedException {

        KrishClass myBot = new KrishClass();
//        myBot.talk("WOOF WOOF");
        myBot.move();
        myBot.eye1();
        myBot.eye2();


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






        myBot.disconnect();

//        while (true) {
//
//        }
    }
}