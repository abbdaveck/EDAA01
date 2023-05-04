public class Rekrusion {

    
    // public static void mystery(int n) {
    //    if (n > 0){
    //       mystery(n-1); 
    //     //   System.out.print(n * 4);
    //       mystery(n-1);
    //    } 
    // }
 
    public static void main(String[] args) {
        int[] a = {4,5,6,1,2,3};
        // int b = findSmallestUsingBinarySearch(a);
        // System.out.println(b);
        
    } 

    public static <E extends Comparable<E>> E findSmallestUsingBinarySearch(E[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        if (array.length == 1) {
            return array[0];
        }
        return findSmallestUsingBinarySearch(array, 0, array.length - 1);
    }
    
    private static <E extends Comparable<E>> E findSmallestUsingBinarySearch(E[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }
        int mid = (left + right) / 2;
        E leftSmallest = findSmallestUsingBinarySearch(array, left, mid);
        E rightSmallest = findSmallestUsingBinarySearch(array, mid + 1, right);
        if (leftSmallest.compareTo(rightSmallest) <= 0) {
            return leftSmallest;
        } else {
            return rightSmallest;
        }
    }
 }