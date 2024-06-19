import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 7;
        int arr[] ={2, 1, 5, 4, 3, 0, 0};

        int result[] = nextPermutation(arr);
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextPermutation(int[] A) {
        int n = A.length;


        int k = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                k = i;
                break;
            }
        }
        
        if (k == -1) {
            reverse(A, 0, n - 1);
            return A;
        }


        int l = -1;
        for (int i = n - 1; i > k; i--) {
            if (A[i] > A[k]) {
                l = i;
                break;
            }
        }


        int temp = A[k];
        A[k] = A[l];
        A[l] = temp;

        reverse(A, k + 1, n - 1);

        return A;
    }
    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}


