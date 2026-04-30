import java.util.Collections;
import java.util.*;

public class subsetSums_I {
//Recursion approach
    public static void main(String[] args) {
        int[] arr = {3,1};
        subsetSums_I sumsI = new subsetSums_I();
        ArrayList<Integer> arrList = sumsI.subsetSums(arr);
        System.out.println(arrList);

    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    public void func(int ind, int sum, int[] arr, ArrayList<Integer> sumSubset) {
        if (ind == arr.length) {
            sumSubset.add(sum);
            return;
        }

        // Pick
        func(ind + 1, sum + arr[ind], arr, sumSubset);

        // Don't Pick
        func(ind + 1, sum, arr, sumSubset);
    }
}



