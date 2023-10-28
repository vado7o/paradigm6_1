import java.util.ArrayList;
import java.util.Random;

public class Randomizer {
    public ArrayList<Integer> randomise(int n) {
        ArrayList<Integer> massive = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            massive.add(random.nextInt(100));
        }
        return massive;
    }
}
