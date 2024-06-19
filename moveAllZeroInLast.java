import java.util.ArrayList;
import java.util.Arrays;

public class moveAllZeroInLast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2,0,25,0,0,36, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] ans = moveZeros(n, arr);
       // Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

     static int[] moveZeros(int n, int[] a) {
//
//         ArrayList<Integer> temp = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             if (a[i] != 0)
//                 temp.add(a[i]);
//         }
//         for (int i = 0; i < temp.size(); i++) {
//             a[i] = temp.get(i);
//         }
//         for (int i = temp.size(); i < n; i++) {
//             a[i] = 0;
//         }
//         return a;

         //optimal soluation

         int j=-1;
         for(int i=0;i<n;i++){
             if(a[i]==0){
                 j=i;
                 break;
             }
         }
         if(j==-1){
             return a;
         }
         for(int i=j+1;i<n;i++){
             if(a[i]!=0){
                 int tem=a[i];
                 a[i]=a[j];
                 a[j]=tem;
                 j++;
             }
         }
         return a;
    }
}
