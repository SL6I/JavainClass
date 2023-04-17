/**
 * testArray
 */
public class testArray {

    public static void main(String[] args) {
        int []twoDimArray[] = {{1,2},{1,2},{1,2},{1,2,3,4}};
        // System.out.println(twoDimArray[0].length);
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  // New
        int []x = {1,1,1};
        int []z = new int[x.length];
        // z =
        z = x.clone();
        x[0] = 1000;
        for(int i: z){
            System.out.println(i);
        }
        // System.out.println(x);
        // System.out.println(z);

        int[][] originalArray = {{1, 2}, {3, 4}};
        int[][] clonedArray = originalArray.clone();
        
        // This will affect the originalArray, as the clonedArray is a shallow copy of the outer array.
        clonedArray[0][0] = 10; // Now, originalArray[0][0] will also be 10.
        
        // However, the inner single-dimensional arrays are deep copied.
        clonedArray[0] = new int[] {5, 6}; // This will not affect the originalArray.
        System.out.println(originalArray);
        System.out.println(clonedArray);

    }
}