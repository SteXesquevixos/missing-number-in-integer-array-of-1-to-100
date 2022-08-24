import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Integer> arrayNumbers = new ArrayList<Integer>();
    private int expectedSum = 0;
    private int sum = 0;

    public static void main(String[] args) {

        Main main = new Main();
        main.addingNumbersToTheList();
        main.expectedSum();
        main.removeNumberFromList(67);
        main.deletedNumber();

    }

    public void addingNumbersToTheList() {
        for (int i = 1; i <= 100; i++) {
            arrayNumbers.add(i);
        }
    }

    public void expectedSum() {
        for (int i = 0; i < arrayNumbers.size(); i++) {
            expectedSum += arrayNumbers.get(i);
        }
    }

    public void removeNumberFromList(int number) {
        arrayNumbers.remove(number-1);
    }

    public void deletedNumber(){
        for (int t = 0; t < arrayNumbers.size(); t++) {
            sum += arrayNumbers.get(t);
        }
        System.out.println("O número que falta na lista é: " + (expectedSum-sum));
    }
}
