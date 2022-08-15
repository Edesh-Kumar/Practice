package dataStructures.strings;

public class StringsPractice1 {
    public static String StringInSentenceReverse(String s1) {
        String[] s2 = s1.split(" ");
        String[] s3 = new String[s2.length];
        for (int i = 0; i < s2.length; i++) {

            String res = "";
            for (int j = s2[i].length() - 1; j >= 0; j--) {
                res += s2[i].charAt(j);

            }
            s3[i] = res;

        }


        return String.join(" ", s3);

    }


}
