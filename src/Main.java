import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException  {
        RandomTexts R= new RandomTexts();
        System.out.println("Let's");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Get");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Start The Game");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Type the following lines");
        System.out.println(R.RandomParagraph());



    }
}