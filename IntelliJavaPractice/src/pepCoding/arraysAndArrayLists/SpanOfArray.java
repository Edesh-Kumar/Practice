package pepCoding.arraysAndArrayLists;


public class SpanOfArray {
    public static int spanOfArray(int[] a){
        int min =0;
        int max =0;
        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[min]) min =i;
            if(a[i]>a[max]) max =i;

        }

        return a[max]- a[min];

        }



    public static void main(String[] args) {
        int[] a = {341,1235};
        System.out.println(spanOfArray(a));
        System.out.println(pepCoding.arraysAndArrayLists.Search.binarySearch(a, 1235));
    }
}
