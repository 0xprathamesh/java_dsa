
public class Lowest {
    public static void main(String[] args) {
        int[] my_array = { 7, 12, 9, 4, 11 };
        int minValue = my_array[0];
        for (int i : my_array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Lowest Value:" + minValue);
    }
}