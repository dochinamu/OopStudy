// peaks 와 valleys 찾기

public class hw5_1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 2, 23, 90, 67, 85};

        System.out.println("Given input array:");
        printArray(array);
        System.out.println("\n");

        System.out.println("Peaks:");
        printArray(findPeaks(array));

        System.out.println("\n");
        System.out.println("Valleys:");
        printArray(findValleys(array));
    }


    public static int[] findPeaks(int[] array) {
        int[] peaks = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            // 첫번째 인덱스 + 바로 뒤 요소보다 크다면, peak로 판단
            if (i==0 && array[i] > array[i+1]) {
                peaks[count] = array[i];
                count++;
            }
            // 마지막 인덱스 + 바로 앞 요소보다 크다면, peak로 판단
            else if (i == array.length -1 && array[i] > array[i-1]) {
                peaks[count] = array[i];
                count++;
            }
            // 나머지
            else if (i > 0 && i <array.length-1 && array[i] > array[i-1] && array[i] > array[i+1]) {
                peaks[count] = array[i];
                count++;
            }
        }
        int [] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = peaks[i];
        }
        return result;
    }
    public static int[] findValleys(int[] array) {
        int[] valleys = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            // 첫번째 인덱스 + 바로 뒤 요소보다 작다면, valley로 판단
            if (i==0 && array[i] < array[i+1]) {
                valleys[count] = array[i];
                count++;
            }
            // 마지막 인덱스 + 바로 앞 요소보다 작다면, valley로 판단
            else if (i == array.length -1 && array[i] < array[i-1]) {
                valleys[count] = array[i];
                count++;
            }
            // 나머지
            else if (i > 0 && i <array.length-1 && array[i] < array[i-1] && array[i] < array[i+1]) {
                valleys[count] = array[i];
                count++;
            }

        }
        int [] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = valleys[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i =0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length -1) {
                System.out.print(" ");
            }
        }
    }
}


