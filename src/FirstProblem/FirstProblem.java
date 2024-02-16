package FirstProblem;

import java.util.Arrays;

public class FirstProblem {

    // First Implementation but excessive time 18 ms
    public void function(int[] array){
        int[] array2 = array.clone();
        for(int i=0;i<array.length-1;i++){
            if(array[i]==0){
                array[i+1]=0;
                int var = i;
                for (int j=i+2;j<array.length;j++){
                    array[j]=array2[var+1];
                    var++;
                }
                i++;
                array2 = array.clone();
            }
        }
    }

    //Second Implementation
    public void function2(int[] array){
        int n= array.length;
        for(int i=0;i<n-1;i++){
            if(array[i]==0){
                correrhaciader(array,i,n-1);
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private void correrhaciader(int[] array, int ini, int sal) {
        for (int i = sal; i > ini; i--) {
            array[i] = array[i - 1];
        }
    }

    /*
        FirstProblem first = new FirstProblem();
        int array[] = {1,0,2,3,0,4,5,0};
        first.function2(array);
    */

}
