import java.util.ArrayList;

public class CountMSE {
    public Double countMSE(ArrayList<Integer> massive1, ArrayList<Integer> massive2) {
        double sum = 0.0;
        for (int i = 0; i < massive1.size(); i++) {
            sum = sum + (Math.pow((massive1.get(i) - massive2.get(i)), 2));
        }
        return sum / massive1.size();
    }
}
