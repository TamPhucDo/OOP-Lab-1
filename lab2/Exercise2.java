public class Exercise2 {
    public static int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 55, 32,13, 4, 20 };
        System.out.println("The min num: " + findMin(arr));
    }
}