import java.util.ArrayList;
import java.util.List;

public class Main {

    private final List<Integer> arrayNumbers = new ArrayList<Integer>();
    private final List<Integer> arrayNumbersDeleted = new ArrayList<Integer>();
    private int expectedSum = 0;
    private static int initialSizeArrayNumbers = 0;

    public static void main(String[] args) {

        Main main = new Main();
        main.addingNumbersToTheList();
        main.expectedSum();
        main.removeNumberFromList(3);
        main.removeNumberFromList(46);
        main.removeNumberFromList(12);
        main.removeNumberFromList(92);
        main.removeNumberFromList(99);
        main.removeNumberFromList(66);
        main.deletedNumber();

    }

    public void addingNumbersToTheList() {
        for (int number = 1; number <= 100; number++) {
            arrayNumbers.add(number);
        }
        initialSizeArrayNumbers = arrayNumbers.size();
    }

    public void expectedSum() {
        expectedSum = arrayNumbers.size() * (arrayNumbers.size() + 1) / 2;
    }

    public void removeNumberFromList(int numberToBeDeleted) {
        for (int number = 0; number < arrayNumbers.size(); number++) {
            if (arrayNumbers.get(number) == numberToBeDeleted) {
                arrayNumbers.remove(arrayNumbers.get(number));
            }
        }
    }

    public void deletedNumber(){
        int sum = arrayNumbers.size() * (arrayNumbers.size() + 1) / 2;

        int positionInTheArrayNumbers = 0;
        int number = 1;
        int difference = expectedSum - sum;

        while (difference > 0) {
            if (positionInTheArrayNumbers < arrayNumbers.size() && number != arrayNumbers.get(positionInTheArrayNumbers)) {
                arrayNumbersDeleted.add(number);
                difference -= number;
                number += 1;
            } else if (positionInTheArrayNumbers < arrayNumbers.size() && number == arrayNumbers.get(positionInTheArrayNumbers)) {
                positionInTheArrayNumbers += 1;
                number += 1;
            } else if (positionInTheArrayNumbers >= arrayNumbers.size()) {
                if (arrayNumbers.size() + arrayNumbersDeleted.size() == initialSizeArrayNumbers) {
                    break;
                } else {
                    arrayNumbersDeleted.add(number);
                    difference -= number;
                }
                positionInTheArrayNumbers += 1;
                number += 1;
            }
        }

        System.out.println("Os números que faltam na lista são: " + arrayNumbersDeleted);
    }
}
