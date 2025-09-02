package ClassTasks;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {

        LinkedList<Task> tasks = new LinkedList<>();
        tasks.add(new Task("Generics", "tomorrow"));
        tasks.add(new Task("Generics", "tomorrow"));
        tasks.add(new Task("Generics", "tomorrow"));
        tasks.add(new Task("Generics", "tomorrow"));

        tasks.addFirst(new Task("File", "today night"));

        while (!tasks.isEmpty()) {
            Task task = tasks.removeFirst();
            System.out.println("Done:" + task);
            System.out.println("Remaining tasks"+ tasks);
            System.out.println();
        }

        System.out.println("ALL TASKS ARE DONE! CONGRATS!!");
    }



}

