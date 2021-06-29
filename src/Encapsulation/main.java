package Encapsulation;

public class main {

    public static void main(String[] args) {
        student s=new student();
      s.setName("Demhat");
      s.setAge(25);
        //System.out.println(s.name);this wont print since it is private
        System.out.println(s.getName()); // this will print because we did encapsulation
        //System.out.println(s.age); this wont print since it is private
        System.out.println(s.getAge()); //this will print because we did encapsulation

    }
}
