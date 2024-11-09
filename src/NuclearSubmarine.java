public class NuclearSubmarine extends WaterVehicle {

    private String manufacturer;

    public NuclearSubmarine(String name, String prod) {
        super(name);
        this.manufacturer = prod;
    }

    public class ElectricEngine {

        public void inner_info() {
            System.out.println("Электродвигатель");
        }
    }

    public class NuclearReactor {

        public void inner_info() {
            System.out.println("Ядерный реактор");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Атомная подводная лодка производителя " + this.manufacturer);
    }
}
