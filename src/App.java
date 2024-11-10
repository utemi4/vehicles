public class App {

    public static void perform(Vehicle vehicle) {
        System.out.println("Информация по транспорту:");
        vehicle.info();
        vehicle.move();
    }

    public static void main(String[] args) throws Exception {

    }
}
