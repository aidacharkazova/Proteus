import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Başdan 10000 element əlavə
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList başdan əlavə: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList başdan əlavə: " + (end - start));

        //Burada LinkedList daha sürətli olacaq (O(1)),
        // ArrayList isə elementləri sürüşdürməli olduğu üçün yavaşdır.
}
}
