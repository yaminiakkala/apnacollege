 import java.util.*;

public class ArrayList{
    public static void main(String args[]){
         ArrayList<Integer> list=new ArrayList <>();  //interger type arraylsit
        //  ArrayList<String> str=new ArrayList<>();
        //  ArrayList<Boolean> bl=new ArrayList<>();
         
         //add operation 
         list.add(1);
         list.add(3);
         list.add(7);
         list.add(9);
         System.out.print(list);
         //get operation
        int ele= list.get(2);
        System.out.println(ele);
        //remove elemnt
        list.remove(2);
        System.out.print(list);
        //set element
        list.set(2,10);
        System.out.print(list);
        //contains 
        list.contains(10);

    }
}