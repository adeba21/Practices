public class ThisExample {


    int d;
    int b;

    String food;
    char size;
    public void setData1(String food, char size){


    }

    public void setData(int i, int b){

        this.d=i;
        this.b =b;

    }
    public static void main(String[] args) {

        ThisExample t=new ThisExample();
        t.setData(4,3);
        System.out.println(t.b);
        System.out.println(t.d);

        System.out.println("********");

        t.setData1("soup",'L');
        System.out.println(t.food);
        System.out.println(t.size);


    }
}
