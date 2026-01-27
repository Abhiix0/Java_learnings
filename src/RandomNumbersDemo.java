import java.util.Random;

public class RandomNumbersDemo {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(0, 101);

        System.out.println("Random number: " + num);
    }
}
