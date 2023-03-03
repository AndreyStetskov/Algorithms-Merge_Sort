public class GradeSort {

    public static void sort(int[] array) {
        int length = array.length;

        if (length == 1) {
            return;
        }

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right= new int[length - middle];

        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, length - middle);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(int[] array, int[] leftPart, int[] rightPart) {
        int leftPartLength = leftPart.length;
        int rightPartLength = rightPart.length;

        int indexLeft = 0;
        int indexRight = 0;

        int indexArray = 0;

        while (indexLeft < leftPartLength && indexRight < rightPartLength) {
            if (leftPart[indexLeft] > rightPart[indexRight]) {
                array[indexArray] = leftPart[indexLeft];
                indexLeft++;
                indexArray++;
            } else {
                array[indexArray] = rightPart[indexRight];
                indexRight++;
                indexArray++;
            }
        }

        while (indexLeft < leftPartLength) {
            array[indexArray] = leftPart[indexLeft];
            indexLeft++;
            indexArray++;
        }

        while (indexRight < rightPartLength) {
            array[indexArray] = rightPart[indexRight];
            indexRight++;
            indexArray++;
        }
    }
}
