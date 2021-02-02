package assignments.Lab4_ArrayMethods;

import java.util.Arrays;

public class Q11 {

public static void main(String[] args) {
        
        int[] x = {1,2,3};
        int[] x1 = {2,3,5};
        int[] x2 = {1,2,1};
        int[] x3 = {11,2,13,2,3};
        
        System.out.println(Arrays.toString(find23(x)));
        System.out.println(Arrays.toString(find23(x1)));
        System.out.println(Arrays.toString(find23(x2)));
        System.out.println(Arrays.toString(find23(x3)));
    }
    public static int[] find23(int[] arr) {
        
        for(int i=0;i<arr.length-1;i++) {
            
            if (arr[i]==2 && arr[i+1]==3) {
                
                arr[i+1] = 0;
            }
        }
        return arr;
    }
    
    
    
}


