package pepCoding.strings;

public class PalindromeSubString {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String palindromeSubString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                res.append(s.substring(i,j).equals(reverse(s.substring(i,j))) ? (s.substring(i,j)+" ") : "");



            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(palindromeSubString("aabccbd"));


    }
}
