package pepCoding.strings;

public class StringCompression {
    public static String compression1(String a) {
        char uniq = a.charAt(0);
        StringBuilder res = new StringBuilder(a.charAt(0) + "");

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != uniq) {
                res.append(a.charAt(i));
                uniq = a.charAt(i);
            }
        }
        return res.toString();
    }

    public static String compression2(String a) {
        char uniq = a.charAt(0);
        StringBuilder res = new StringBuilder(a.charAt(0) + "");
        int times = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == uniq) {
                times++;

            } else {
                if (times != 1) res.append(times);
                times = 1;
                res.append(a.charAt(i));
                uniq = a.charAt(i);
            }
            if (i == a.length() - 1 && times !=1) res.append(times);

        }
        System.out.println(times);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(compression1("wwwwaaadexxxxxx"));
        System.out.println(compression2("wwwwaaadex"));
    }
}
