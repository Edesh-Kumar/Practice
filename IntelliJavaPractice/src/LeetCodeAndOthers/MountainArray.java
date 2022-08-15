package LeetCodeAndOthers;

public class MountainArray {
     int[] arr;
     int count;
    MountainArray(int[] arr){
        this.arr= arr;
    }
    public int length(){
        count++;
        return arr.length;

    }
    public int get(int index){
        count++;
        return arr[index];
    }
    public int getCount(){
        return count;
    }
}
