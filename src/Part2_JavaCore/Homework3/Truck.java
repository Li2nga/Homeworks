package Part2_JavaCore.Homework3;

public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        super.check();
        checkTrailer();
    }

    void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}