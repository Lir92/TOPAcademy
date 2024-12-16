package Lesson8;

public class Lesson8PolymorphismAndInheritance {
    // если объект создаетс€ по типу: * ласс родитель* *им€ объекта* = new *объект наследник*,
    // то методы, объ€вленные в классе-наследнике не будут работать, только родительские.
    public static void main(String[] args) {

        Whale whale = new Whale();
        whale.printAll();
    }

}
