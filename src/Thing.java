import java.util.ArrayList;

public class Thing {
    private ArrayList<Integer> numbers = new ArrayList<>();

    Thing() {
        //this.numbers.add(0);
    }

    Thing(int number) {
        this.numbers.add(number);
    }

    public void addNum(int number) {
        this.numbers.add(number);
    }

    public int getSmallest() {
        int smallest = Integer.MAX_VALUE;
        for (int num: numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public int getLargest() {
        int largest = Integer.MIN_VALUE;
        for (int num: numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public double getAverage() {
        double sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }

    public void show(){
        if (numbers.size() > 0) {
            System.out.println("\nShow Array");
            numbers.forEach((num)->System.out.print(num + ", "));
        } else {
            System.out.println("\nList is empty.");
        }

    }

    public void clearNumbers() {
        this.numbers.clear();
    }

}
