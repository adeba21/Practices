package ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        String[] fruits= new String[3];
        fruits[0]="Mango";
        fruits[1]="Banana";
        fruits[2]="Cherry";

        System.out.println(fruits[1]);

        System.out.println("*******************");

        ArrayList fruitList=new ArrayList();

        fruitList.add("Mango") ;
        fruitList.add("Banana");
        fruitList.add("Cherry");

        System.out.println(fruitList);

        fruitList.remove("Banana");

        System.out.println(fruitList);

        fruitList.clear();
        System.out.println(fruitList);
    }



}
