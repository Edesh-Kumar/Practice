package pepCoding.strings;

public class ToggleCase {
    public static String toggleCase(String str){
        StringBuilder res = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) !=' ') {
                if(str.charAt(i)>=65 && str.charAt(i)<=90) res.append((char)(str.charAt(i)+32));
                else res.append((char)(str.charAt(i) - 32));
            }else res.append(' ');
        }

        return  res.toString();
        }

    public static void main(String[] args) {
        System.out.println(toggleCase("HeLLo theRe"));


    }
}
