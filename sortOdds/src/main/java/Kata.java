import java.util.Arrays;

public class Kata {
    public static Integer nextOdd(int[] array, VariableByRef<Integer> index, int length) {
        while (array[index.getValue()] %2 == 0) {
            index.setValue(index.getValue() + 1);
            if (! (index.getValue() < length)) {
                index.setValue(length);
                return null;
            }
        }

        int i = index.getValue();
        index.setValue(i + 1);
        return array[i];
    }

    public static int[] sortArray(int[] array) {
        int index = 0;
        VariableByRef<Integer> oddIndex = new VariableByRef<Integer>(0);
        int length = array.length;
        int[] odd = array.clone();
        Arrays.sort(odd);

        while (index < length) {
            if (array[index] % 2 == 1) {
                array[index] = nextOdd(odd, oddIndex, length);
            }

            index += 1;
        }

        return array;
    }
}