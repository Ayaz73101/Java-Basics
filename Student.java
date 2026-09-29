class Student {
    int id;
    String name;
    double marks;
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
    }   
     public static void main(String[] args) {
        Student s1 = new Student(1015, "Ayaz ", 80.5);
        s1.display();
    }
}