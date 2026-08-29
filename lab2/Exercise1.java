public class Exercise1 {
    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 55, 32,13, 4, 20 };
        System.out.println("The max num: " + findMax(arr));
    }
}