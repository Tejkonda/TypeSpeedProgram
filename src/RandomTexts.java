
import java.util.Random;

public class RandomTexts {
    String Basketball = " The game of basketball came in the year 1891, \n" +
            "in Springfield, Massachusetts. Many other sports formed an inspiration for basketball.\n " +
            "It has features of soccer and rugby. ";
    String Cricket ="Cricket is a sport that requires the use of a bat and ball " +
            "Cricket is particularly famous in England and India. ";

    public String RandomParagraph(){
        String[] paragraphs = {Basketball, Cricket};
        Random random = new Random();
        int randomIndex = random.nextInt(paragraphs.length);
        return paragraphs[randomIndex];

    }
}
