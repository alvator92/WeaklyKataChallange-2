package start.solutions;

public class NextKata {
    public static int[] sortArray(int[] array) {
        int min;
        int index;

        for (int i = 0; i < array.length - 1; i ++) {
            min = array[i];
            index = i;
            if (min % 2 != 0) {
                for (int j = i + 1; j < array.length; j ++) {
                    if (array[j] % 2 != 0) {
                        if (min > array[j]) {
                            min = array[j];
                            index = j;
                        }
                    }
                }
            }
            if (index != i) {
                array[index] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
}
