//Time Complexity O(n)
//Two pointers solution
public class checkIfStringIsPalindrom {
    static boolean  checkPalindrom(String s) {
       int right = s.length()-1;
       int left=0;
       while(left < right) {
           if(s.charAt(left) != s.charAt(right)) {
               return false;
           }
           left++;
           right--;

       }
         return true;
     }

    public static void main(String[] args) {
        String s = "ANANA";
        System.out.println(checkPalindrom(s));
    }
}
