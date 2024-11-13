import java.util.Scanner;

public class App {

    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return i;
    }

    public static String scanLine() {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        return i;
    }

    public static Vehicle setChosenVehicle(int num, String name, String add) {
        switch (num) {
            case 1:
                return new Car(name, add);
            case 2:
                return new Bicycle(name, add);
            case 3:
                return new Plane(name, add);
            case 4:
                return new Helicopter(name, add);
            case 5:
                return new Boat(name);
            case 6:
                return new NuclearSubmarine(name, add);
            default:
                System.out.println("Введите корректные данные");
                System.exit(1);
                return null;
        }
    }

    public static boolean setChosenBool(int num) {
        switch (num) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Выберите транспорт: 1. Машина, 2. Велосипед, 3. Самолёт,");
        System.out.println("4. Вертолёт, 5. Лодка, 6. Атомная подводная лодка");
        int makeAChoiceOfVehicle = scanInt();

        System.out.println("Введите название вашего транспорта");
        String defineName = scanLine();

        System.out.println("Введите доп. информацию: Бренд для машины и велосипеда,");
        System.out.println("Производителя для самолёта, вертолёта и атомной подводной лодки");
        String defineAddInfo = scanLine();

        Vehicle vehicle = setChosenVehicle(makeAChoiceOfVehicle, defineName, defineAddInfo);
        User user = new User(vehicle);

        System.out.println("Показать информацию по транспорту?");
        System.out.println("1. Да, 2. Нет");
        int makeAChoice = scanInt();
        boolean infoOutput = setChosenBool(makeAChoice);
        user.vehicleInfoOutput(infoOutput);

        System.out.println("Запустить транспорт?");
        System.out.println("1. Да, 2. Нет");
        makeAChoice = scanInt();
        boolean moveOutput = setChosenBool(makeAChoice);
        user.vehicleMoveOutput(moveOutput);
    }
}
