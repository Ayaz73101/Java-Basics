public class AdditionDemo {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        AdditionDemo a=new AdditionDemo();
        a.add(5, 7);
        a.add(10.3, 4.7);
        a.add(7, 3, 4);
    }
}