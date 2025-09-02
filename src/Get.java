import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Get {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1 milyon element əlavə edək
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // ArrayList get sürəti
        long start = System.nanoTime();
        arrayList.get(500_000);
        long end = System.nanoTime();
        System.out.println("ArrayList get time: " + (end - start));

        // LinkedList get sürəti
        start = System.nanoTime();
        linkedList.get(500_000);
        end = System.nanoTime();
        System.out.println("LinkedList get time: " + (end - start));

        //ArrayList → index üzərindən oxumaq (get(i)) çox sürətli oldu.
        // Çünki arxada dinamik massiv var və elementin ünvanı birbaşa hesablanır (O(1) vaxt).
        //
        //LinkedList → eyni əməliyyat çox yavaş oldu.
        // Çünki ortadakı elementə çatmaq üçün əvvəlindən (və ya sonundan) node-ları
        // bir-bir gəzməli oldu (O(n) vaxt).
    }
}