public class Boat extends WaterVehicle {

    public Boat(String name) {
        super(name);
    }

    public class Oars {

        public void inner_info() {
            System.out.println("Вёсла");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Лодка");
    }
}
