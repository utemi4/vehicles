public class User {

    private Vehicle vehicle;

    public User(Vehicle veh) {
        this.vehicle = veh;
    }

    public void vehicleInfoOutput(Boolean infoOutput) {
        if (infoOutput.equals(true)) {
            this.vehicle.info();
        }
    }

    public void vehicleMoveOutput(Boolean moveOutput) {
        if (moveOutput.equals(true)) {
            this.vehicle.move();
        }
    }
}
