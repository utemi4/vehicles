public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car("Beast", "BMW");
        car.info();
        car.move();
        Car.InternalCombustionEngine eng = car.new InternalCombustionEngine();
        eng.inner_info();

    }
}
