package ClassTasks;

import java.util.LinkedList;

public class Task{
    String taskName;
    String deadline;

    public Task(String taskName, String deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
