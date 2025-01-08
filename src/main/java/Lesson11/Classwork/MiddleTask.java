package Lesson11.Classwork;

import java.util.*;

public class MiddleTask {
    public static void main(String[] args) {
//        HashMap<String, Integer> todoList = new HashMap<>();
//        HashMap<String, Integer> finalList = new HashMap<>();
//
//        todoList.put("���� ����", 2);
//        todoList.put("������� �����", 4);
//        todoList.put("����� ������", 11);
//        todoList.put("�������", 10);
        int priorityValue = 9;
//
//        for(Map.Entry<String, Integer> value: todoList.entrySet()) {
//            if(value.getValue() > priorityValue) {
//                finalList.put(value.getKey(), value.getValue());
//            }
//        }
//
//        System.out.println(finalList);

        // teacher's solution:
        List<MiddleTaskTask> taskList = new ArrayList<>();
        taskList.add(new MiddleTaskTask("������", 10));
        taskList.add(new MiddleTaskTask("������", 9));
        taskList.add(new MiddleTaskTask("����������", 3));
        taskList.add(new MiddleTaskTask("�������� �� ����", 6));

        Iterator<MiddleTaskTask> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            MiddleTaskTask task = iterator.next();
            if(task.priority < priorityValue) {
                iterator.remove();
            }
        }

        Collections.sort(taskList, new Comparator<MiddleTaskTask>() {
            @Override
            public int compare(MiddleTaskTask o1, MiddleTaskTask o2) {
                return Integer.compare(o1.priority, o2.priority);
            }
        });
        System.out.println(taskList);
    }
}
