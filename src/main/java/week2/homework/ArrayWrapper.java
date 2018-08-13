package week2.homework;

public class ArrayWrapper {

    private ArrayWrapper(){}

    private static int[] arr = new int[10];
    private static int size = 0;

    public static void add(int num) {
        if(size >= arr.length) {
            extendArray();
        }
        arr[size++] = num;
    }

    private static void extendArray() {
        int[] newArr = new int[size << 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int[] getArr(){
        return arr.clone();
    }

    // returns element by index
    public static int get(int index) {
        return 0;
    }

    // copy of sorted array
    public static int[] sort(){
        return null;
    }

    // remove by index
    public static void remove(int index) {

    }

    // remove by value
    public static void removeByValue(int value) {

    }

    // search by value
    public static void search(int value) {
    }

    // returns revers of array
    public static int[] revers(){
        return null;
    }

    // returns sub array
    public static int[] subArray(int start, int end){
        return null;
    }

    // returns sum of all elements
    public static int sum(){
        return 0;
    }

    // add whole array
    public static void add(int[] newArr) {
    }

    // add on specific position
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static void add(int index, int value) {
    }

    // prepend value
    public static void prepend(int num) {
    }

    // set new value instead old value
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static int set(int index, int value) {
        throw new ArrayIndexOutOfBoundsException();
    }

    // search sub array
    public static int searchSubArray(int[] subArray){
        return 0;
    }

    /**
     *
     *
     *
     *
     * @param subArray
     */
    public static void removeSubArray(int[] subArray) {
    }

}
