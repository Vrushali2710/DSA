//Time Complexity O(n3)
public class longestPalindromSubstring1 {
    static boolean isPalindrom(String s, int i, int j) {
        while (i<j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        int max= 0;
        int start=0;
        int end = 0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(isPalindrom(s,i,j) == true) {
                    if(j-i+1>max) {
                        max = j - 1 + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.printf(s.substring(start,end+1));
    }


}
