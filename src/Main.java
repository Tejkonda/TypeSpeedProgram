import java.time.LocalTime;
import java.util.Scanner;
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
        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typeWords =scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end-start;
        //converted from milliseconds to seconds
        double seconds = elapsedTime/1000000000.0;
        //System.out.println(seconds );

        //To calculate words per minute
        //{x char/5}/1min = y wpm

        int numChars =typeWords.length();
        int wps=(int)((((double)numChars/5)/seconds)*60);
        System.out.println("Your wpm is "+ wps +" :)");






    }
}