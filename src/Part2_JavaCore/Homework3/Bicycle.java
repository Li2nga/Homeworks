package Part2_JavaCore.Homework3;

public class Bicycle implements VehicleInterface {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}


