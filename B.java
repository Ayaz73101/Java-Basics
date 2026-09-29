class B {
    int age;
    String name;

    void show(int age, String name) {
        System.out.println(age + " " + name);
    }
}

class Test {
        public static void main(String args[]) {
        B aiml = new B();
        aiml.show(20, "Ayaz");
    }
}