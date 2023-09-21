package Part2_JavaCore.Homework3;

public class Car extends Bicycle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        checkEngine();
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}