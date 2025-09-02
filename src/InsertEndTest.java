import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertEndTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Sona 1.000.000 element əlavə
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList sona əlavə: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList sona əlavə: " + (end - start));
}
}