package Lesson11.Classwork;

public class MiddleTaskTask {
    String task;
    int priority;

    public MiddleTaskTask(String task, int priority) {
        this.task = task;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "(task='" + task + '\'' +
                ", priority=" + priority +
                ")";
    }
}
