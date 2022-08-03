public class Fib {
    int result = 0;

    public Fib() {

    }

    public int fib(int sol) {
        int arr[] = new int[sol + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= sol; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[sol];
    }

}