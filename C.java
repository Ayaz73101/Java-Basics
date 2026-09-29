class C {
    int roll_no, marks;
    String name;
    void input() {
        System.out.println("Enter your roll_no, marks, name");
    }
}
class AIML extends C {
    void display() {
        roll_no = 55;
        marks = 77;
        name = "Ayaz";
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        AIML obj = new AIML();
        obj.input();
        obj.display();
    }
}
