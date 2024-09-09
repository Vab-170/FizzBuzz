public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean mult3 = i % 3 == 0;
            boolean mult5 = i % 5 == 0;

            if (mult3 || mult5) {
                count++;
            }
        }
        System.out.println("# of multiples of 3 or 5: " + count);
    }
}
