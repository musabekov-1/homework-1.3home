public class Main {
    public static void main(String[] args) {

        double[] numbers = {9.3, 3.8, -4.3, -7.8, 8.1, 5.9, -3.4, 78.4, -54.7, -12.8, 45.2, -34.4, 56.1, 9.7, -66.9, 76.6};
        double num = 0;
        int anotherNum = 0;

        boolean startSumming = false;
        for (double current : numbers) {
            if (current < 0) {
                startSumming = true;
            } else if (startSumming && current > 0) {
                num = num + current;
                anotherNum++;
            }

        }
        System.out.println(num / anotherNum);


// дз на собразителность


        int[] arr = {-7, -4, -2, 2, 3, 6,8};
        selectionSort(arr);

    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}