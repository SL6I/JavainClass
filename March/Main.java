//package March;
import java.util.Arrays;   

public class Main {
  public static void main(String[] args) {
    // one type in array
     int [] x ;
     x = new int[3];
     x[0] = 2;
     x[1] = 3;
     x[2] = 1;
     int y = x.length; // not a method
    int z[][] ={{1,2},{1,2},{2,1}};
    int www[] = new int[1];
    int rr[] = www;
    www[0] = 1;
    System.out.println(rr[0]);
    int a = z.length;
    int[][] kk = new int[2][1];
    kk[0][0] = 200;
    kk[1][0] = 1000;
    // kk[0][2] = 111;
    System.out.println(a);
    int iii[] = {1,2,3};
    int e[] = iii;
    System.out.println(iii == e); 
    String d = "S";
    String q = "S";
    System.out.println(q == d);
    for(int j : x){
        System.out.println(j);
    }
    // System.out.println(j); Error

    // Array in mwthods
//

    // ----------------------------------
    // -------At home from slides--------
    // ----------------------------------
    System.out.println("--------------------");
    for(int ii = 0;ii<kk.length;ii++){
        for(int j = 0;j<kk[0].length ; j++){
            System.out.println(kk[ii][j]);
        }
    }
    Arrays.sort(x);
    for(int j : x){
        System.out.println(j);
    }

    int array[] = {-1,2,4,5,7,1101,-3,0};
    for(int i = 0;i<array.length;i++){
        for(int j = i+1;j<array.length;j++){
            int tmp = 0;
            if(array[i]>array[j]){
                array[i] = array[j];
                tmp = array[i];
                
            }
        }
    }
    // System.out.println("############# "+tmp);
    /*--------------------------
     *---Array from W3schools---
     *--------------------------
     */
    String[] cars;
    String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNum = {10, 20, 30, 40};
    System.out.println(cars1[0]);
    // cars[1] = "ACCENT"; Error
    cars1[0] = "ACCENT";
    System.out.println(cars1.length);


    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[0][1]);
    //-----------------------------
    // Now lets go to JavaPoint

    // dataType[] arr; (or)  
    // dataType []arr; (or)  
    // dataType arr[];  
    //Java Program to demonstrate the way of passing an array  
//to method.
int a1[]={33,3,4,5};//declaring and initializing an array  
min(a1);//passing array to method    

  }
    //creating a method which receives an array as a parameter  
    static void min(int arr[]){  
    int min=arr[0];  
    for(int i=1;i<arr.length;i++)  
     if(min>arr[i])  
      min=arr[i];  
      
    System.out.println(min);  

    // Copy array from another array
    int[] b = {1,2,3};
    int[] c = new int[b.length];
    for(int i = 0;i<b.length;i++){
        c[i] = b[i];
    }
    for(int i = 0;i<c.length;i++){
        System.out.println(c[i]);
    }
// Didn't finish
    int[] y = {1,2,3,4,1,2,3,2,1,2,1,2};
    // int counter = 1;
    for(int i = 0;i<y.length;i++){
        int counter = 1;
        for(int j = i+1;j<y.length;j++){
            if(y[i] == y[j]){
                counter++;
            }
            else{

            }
        }
        System.out.println("This number "+y[i]+" Has repeated "+counter);
    }

    // Largest Number in array
    int L[] = {22,5,9,10,11,15,1,2,4,19,1,3,24};
    int op = L[0];
    for(int i = 0;i<L.length;i++){
        // op = L[i];
        if(op < L[i]){
            op = L[i];
        }
        else{

        }


    }
    System.out.println(op);
    int[][] test = new int[2][10];
    System.out.println(test[0].length);
    }  
      
    
    } 
  

