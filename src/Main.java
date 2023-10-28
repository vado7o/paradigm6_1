import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Randomizer rnd = new Randomizer();
        CountMSE mse = new CountMSE();

        int n = 10;
        ArrayList<Integer> massive1 = rnd.randomise(n);
        ArrayList<Integer> massive2 = rnd.randomise(n);

        System.out.println("Среднеквадратичная ошибка для заданных массивов равна : "
        + mse.countMSE(massive1, massive2));
    }
}