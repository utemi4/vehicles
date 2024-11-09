public class Car extends GroundVehicle {

    private String brand;

    public Car(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public class InternalCombustionEngine {

        public void inner_info() {
            System.out.println("Двигатель внутреннего сгорания");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Автомобиль бренда " + this.brand);
    }
}
