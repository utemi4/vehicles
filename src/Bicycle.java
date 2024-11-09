public class Bicycle extends GroundVehicle {

    private String brand;

    public Bicycle(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public class BicycleDrivetrain {

        public void inner_info() {
            System.out.println("Велосипедная трансмиссия");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Велосипед бренда " + this.brand);
    }
}
