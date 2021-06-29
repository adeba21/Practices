package ForEachLoop;

import java.util.ArrayList;

public class HappyFunTime {

    public static void main(String[] args) {

        String[] cars={"BMW","GTI", "Mercedes"};



        for ( int i=0; i< cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("**********");
        for (String car:cars){
            System.out.println(car);
        }
        System.out.println("*****************");

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(21);
        numbers.add(20);
        numbers.add(19);

        for (int a: numbers){
            System.out.println(a);
        }

    }
}
