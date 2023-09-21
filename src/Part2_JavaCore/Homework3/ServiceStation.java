package Part2_JavaCore.Homework3;

public class ServiceStation {


    public void check(Bicycle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.check();
    }
}
