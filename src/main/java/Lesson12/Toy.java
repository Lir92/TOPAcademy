package Lesson12;

public class Toy {
    String name;
    int size;

    public Toy(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
