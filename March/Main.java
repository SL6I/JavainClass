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
    int i[] = {1,2,3};
    int e[] = i;
    System.out.println(i == e); 
    String d = "S";
    String q = "S";
    System.out.println(q == d);
    for(int j : x){
        System.out.println(j);
    }
    // System.out.println(j); Error

    // Array in mwthods


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

    int ttt[] = {-1,2,4,5,7,1101,-3,0};
    for(int t = 0;t<ttt.length;t++){
        for(int w = t+1;w<ttt.length;w++){
            int tmp = 0;
            if(ttt[t]>ttt[w]){
                ttt[t] = ttt[w];
                tmp = ttt[t];
                
            }
        }
    }
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
    }  
      
    
    } 
  

