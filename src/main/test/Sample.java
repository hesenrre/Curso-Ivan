// #include <blabla.h>
//import java.util.*;
import java.util.ArrayList;

/*
 * public - visible to all
 * private - visible to object or class
 * protected - visible to package
 *
 */

public class Sample{

    private String message = "hi"; // new String("hi");

    /*
     * int            : Integer  new Integer(5), new Integer("5");
     * char -> char[] : Character -> String, new String(), "asdasdas"
     * bool           : boolean -> Boolean
     * float          : Float
     * double         : Double
     * long           : Long
     */

    public String toString(){
        return "Hola soy sample y mi id de clase es "+super.toString();
    }

    public static void main(String [] args){
        //int array[] = new int[10];
        //for(int i=0; i < 10 ; i++){
            //array[i] = i+1;
            //System.out.println(array[i]);
        //}
        //System.out.println(array);
        
        //ArrayList array2 = new ArrayList();
        //for(int i=0; i < 10 ; i++){
            //array2.add(i+1);
            //System.out.println(array2.get(i));
        //}
        //System.out.println(array2);
        Sample reference = new Sample();
        System.out.println(reference);
    }

}
