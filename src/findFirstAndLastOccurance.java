//write a program to find a index of first occurance and last occarance of element in an array in a single iteration
//int arr[] = [1,2,3,3,4,5,6];
// target element =3
//array is sorted and array is not empty
public class findFirstAndLastOccurance {

   static int firstOccurance = -1;
    static int  lastOccurance = -1;

    static void findElementsLocation(int arr[], int target) {

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                if (firstOccurance == -1) {
                    firstOccurance = i;
                }

                lastOccurance = i;


            }
            else if(arr[i] > target) {
                break;
            }
        }
        System.out.println("First Occurance:"+firstOccurance+"   last Occurance:"+lastOccurance);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,6};
        int target = 3;
        findElementsLocation(arr,target);

    }



}
