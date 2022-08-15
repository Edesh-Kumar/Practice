package pepCoding.strings;

public class CharDiff {
    public static String everyTwoConsecutiveCharacters(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length()-1; i++) {
            sb.append(str.charAt(i) + "" + (str.charAt(i + 1) - str.charAt(i)));
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(everyTwoConsecutiveCharacters("abecd"));
    }
}
