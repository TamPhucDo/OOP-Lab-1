public class Exercise3 {
    public static int sumAllEven(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 55, 32,13, 4, 20 };
        System.out.println("Sum all even numbers: " + sumAllEven(arr));
    }
}