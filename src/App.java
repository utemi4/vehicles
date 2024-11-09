public class App {
    public static void main(String[] args) throws Exception {
        Boat boat = new Boat("1");
        boat.info();
        boat.move();
        Boat.Oars oars = boat.new Oars();
        oars.inner_info();

        NuclearSubmarine sub = new NuclearSubmarine("Хаски", "МБМ 'Малахит'");
        sub.info();
        sub.move();
        NuclearSubmarine.ElectricEngine eng = sub.new ElectricEngine();
        eng.inner_info();
        NuclearSubmarine.NuclearReactor reactor = sub.new NuclearReactor();
        reactor.inner_info();
    }
}
