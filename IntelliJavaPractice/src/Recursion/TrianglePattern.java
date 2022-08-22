package Recursion;

public class TrianglePattern {
    public static void print(int r, int c) {
        if(r==0) return;
       if (c<r){
           print(r,++c);
           System.out.print("* ");
       }else {

           print(--r,0);
           System.out.println();
       }
    }

    public static void main(String[] args) {
        print(4,0);
    }
}
