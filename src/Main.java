public class Main {
    public static void main(String[] args) {
        int[] array = {3, 99, 25, 37, 94, 10};

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array [i];
            }
        }

        System.out.println("Min of array: ");
        System.out.print(min);
    }
}