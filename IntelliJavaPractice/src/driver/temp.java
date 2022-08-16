package driver;

public class temp {
    public static void diamondPattern(int n) {
        n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i * 2 - 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static String toggleChars(String st) {
        char[] str = st.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z')
                str[i] = (char) (str[i] + 'a' - 'A');
            else if (str[i] >= 'a' && str[i] <= 'z')
                str[i] = (char) (str[i] + 'A' - 'a');
        }

        return String.copyValueOf(str);

    }

    public static String toggleCase(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                res.append(str.charAt(i));

            } else {
                res.append("_");
                res.append((char) (str.charAt(i) + 32));

            }
        }
        return res.toString();
    }

    public static String replaceRepeatingChars(String str) {
        char ch = str.charAt(0);
        char[] res = str.toCharArray();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                res[i - 1] = '_';
                res[i] = '_';
            }
            ch = str.charAt(i);

        }
        return String.copyValueOf(res);
    }

    public static int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int m = 0;
        int[] res = {s, e};
        while (s <= e) {
            m = s + (e - s) / 2;
            if (nums[m] == target) {
                s = e = m;
                while (e < nums.length && nums[e + 1] == target) {
                    e++;
                }
                while (s > 0 && nums[s - 1] == target) s--;
                res[0] = s;
                res[1] = e;
                return res;
            }
            if (target < nums[m]) e = m - 1;
            else s = m + 1;

        }
        return res;


    }

    public static int pow(long base, long power) {
        int n = 1;
        for (int i = 1; i <= power; i++) {
            n *= base;
        }
        return n;
    }

    public static boolean isPrime(long n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count == 2;
    }

    public static void perfectNumber(int n) {
        long mercenePrime = 0;
        long count = 0, i = 2;
        while (count <= n) {
            i++;
            mercenePrime = (pow(2, i) - 1);
            if (isPrime(mercenePrime)) {
                System.out.println(pow(2, i - 1) * mercenePrime);
                count++;
            }
        }

    }

    public static void main(String[] args) {
//        String st = "helloYaar";
//        System.out.println(toggleChars(st));
//        System.out.println(toggleCase(st));
//        System.out.println(replaceRepeatingChars(st));
        int[] arr = {5, 7, 7, 8, 8, 10};
//        System.out.println(Arrays.toString(searchRange(arr, 8)));
        perfectNumber(10);


    }
}



