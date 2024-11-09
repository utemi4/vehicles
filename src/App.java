public class App {
    public static void main(String[] args) throws Exception {
        Plane plane = new Plane("Ил-12", "ОКБ");
        plane.info();
        plane.move();
        Plane.AircraftEngine eng = plane.new AircraftEngine();
        eng.inner_info();

        Helicopter heli = new Helicopter("Ми-8", "ОКБ");
        heli.info();
        heli.move();
    }
}
