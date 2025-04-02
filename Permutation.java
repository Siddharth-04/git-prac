import java.util.Scanner;
import java.util.Arrays;

class Permutation {
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutation(int i, char[] arr) {
        if (i >= arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            permutation(i + 1, arr);
            swap(arr, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        permutation(0, arr);
    }
}


// abc
// [a, b, c]
// [a, c, b]
// [b, a, c]
// [b, c, a]
// [c, b, a]
// [c, a, b]


