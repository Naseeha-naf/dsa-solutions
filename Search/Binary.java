import java.util.*;

public class Main {

    public static int binarySearch(int[] arr, int tar) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == tar) {
                return mid;
            } 
            else if (arr[mid] < tar) {
                l = mid + 1;
            } 
            else {
                r = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        System.out.println(binarySearch(arr, tar));
    }
}
