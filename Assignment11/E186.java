//Selection sort
public class E186 {
    public static void main(String[] args)
    {
        Integer[] list = {34, 17, 23, 35, 45, 9, 1};
        System.out.println("Original Array: ");
        printArray(list);

        selectionSort(list);
        System.out.println("\nSelection sort:");
        printArray(list);
        System.out.println("\nExpected: \n[1, 9, 17, 23, 34, 35, 45]");
    }

    //selection sort
    public static <E extends Comparable<E>> void selectionSort(E[] list) {
        for(int i = 0; i < list.length -1; i++) {
            int small = i;

            for(int j = i + 1; j < list.length; j++) {
                if(list[small].compareTo((list[j])) > 0  ) {
                    small = j;
                }
            }
            E x = list[small]; //Switch one
            list[small] = list[i];
            list[i] = x;
        }
    }

    public static <E> void printArray(E[] list){
        for (int x = 0; x < list.length; x++) {
            System.out.print(list[x] + ", ");
        }
    }
}
