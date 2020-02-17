package app;

import java.util.Arrays;

public class SwitchArray {
    public static void main(String[] args) {

        int[] array= new int[10];


        for (int i =0; i<array.length; i++){
            int num = (int)((Math.random()*20)-10);
            array[i]=num;

        }

        for (int i =0; i<array.length-1; i++){

        }

        System.out.println(Arrays.toString(array));
        int l=(array[array.length-1]);
        for (int i=array.length-1; i >0; i--){
            //if (array[i]>0){
                //Arrays.sort(array);
                array[i]=array[i-1];
                //i--;
                ;
                //if ([array.length])

           // }
            /*if (i==0){
                array[i]=array[array.length-1];
            }*/
        }

        array[0]=l;

        //array[array.length] = array[0];

        System.out.println(Arrays.toString(array));
    }
}
