package dataStructures.strings;

public class StringRecursionQ {
    public static String removeAs(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    public static String removeARecursion(String str) {
        if (str.length()==0){
            return "";
        }
        if(str.charAt(0)=='a'){
            return removeARecursion(str.substring(1));
        }else return str.charAt(0)+removeARecursion(str.substring(1));

    }

    public static String removeAppple(String str){
            if(str.length()==0) return "";
            if(str.startsWith("apple")){
               return removeAppple(str.substring(5));
            }else return str.charAt(0) + removeAppple(str.substring(1));
        }

    public static void main(String[] args) {
        String str = "baccad";
        String  str1 = "baapplejaku";
        System.out.println(removeARecursion(str));
        System.out.println(removeAppple(str1));

    }
}
