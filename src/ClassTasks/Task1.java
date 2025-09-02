package ClassTasks;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Apple");
        products.add("Banana");
        products.add("Grapes");
        products.add("Pie");
        products.add("Orange");

        System.out.println(products);

        System.out.println("Ilk mehsul: " + products.get(0));
        System.out.println("Son mehsul: "+ products.get(4));

        products.remove(0);

        System.out.println("Yenilenmis siyahi: "+products);

        products.set(3, "Watermelon");

        for(String product : products) {
            System.out.println(product);
        }

    }
}
