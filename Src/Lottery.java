import java.util.Arrays;
import java.util.Random;

public class Lottery {
        public static void main(String[] args) {
            int[] first = generateRandomArray(7); // генеруємо перший масив
            int[] second = generateRandomArray(7); // генеруємо другий масив

            Arrays.sort(first); // сортуємо перший масив
            Arrays.sort(second); // сортуємо другий масив

            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(second));

            int count = countMatches(first, second); // знаходимо кількість збігів

            System.out.println("Кількість збігів: " + count);
        }

        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10); // генеруємо випадкове число від 0 до 9
            }

            return array;
        }

        public static int countMatches(int[] first, int[] second) {
            int count = 0;

            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    count++;
                }
            }

            return count;
        }
    }
