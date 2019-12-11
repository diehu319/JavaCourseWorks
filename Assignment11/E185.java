//Generic Binary Search
public class E185 {

    public static <T extends Comparable<T>> int BinarySearch(T[] arr, T val, int left, int right){
        if (left < right){
            int mid= (left + right) / 2;
            if (arr[mid].compareTo(val) > 0) return BinarySearch(arr, val, left, mid-1);
            if (arr[mid].compareTo(val) < 0) return BinarySearch(arr, val, mid + 1, right);
            return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        String[] array = new String[]{"a","b","c","d","e"};
        System.out.println("c is at index " + BinarySearch(array, "c", 0, array.length-1));
    }
}
