import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);
    }
}