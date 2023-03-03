public class PersonSort {
    public static void sort(Person[] array) {
        int length = array.length;

        if (length == 1) {
            return;
        }

        int middle = length / 2;
        Person[] left = new Person[middle];
        Person[] right= new Person[length - middle];

        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, length - middle);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private static void merge(Person[] array, Person[] leftPart, Person[] rightPart) {
        int leftPartLength = leftPart.length;
        int rightPartLength = rightPart.length;

        int leftIndex = 0;
        int indexRight = 0;

        int indexArray = 0;

        while (leftIndex < leftPartLength && indexRight < rightPartLength) {
            if (leftPart[leftIndex].getAge() > rightPart[indexRight].getAge()) {
                array[indexArray] = leftPart[leftIndex];
                leftIndex++;
                indexArray++;
            } else {
                array[indexArray] = rightPart[indexRight];
                indexRight++;
                indexArray++;
            }
        }

        while (leftIndex < leftPartLength) {
            array[indexArray] = leftPart[leftIndex];
            leftIndex++;
            indexArray++;
        }

        while (indexRight < rightPartLength) {
            array[indexArray] = rightPart[indexRight];
            indexRight++;
            indexArray++;
        }
    }
}
