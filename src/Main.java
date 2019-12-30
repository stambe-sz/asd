import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            List<Tire> tires = new ArrayList<>();
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];

            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            Engine engine = new Engine(engineSpeed, enginePower);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);
            tires.add(new Tire(tire1Pressure, tire1Age));
            tires.add(new Tire(tire2Pressure, tire2Age));
            tires.add(new Tire(tire3Pressure, tire3Age));
            tires.add(new Tire(tire4Pressure, tire4Age));

            carList.add(new Car(model, tires, engine, cargo));
        }
        String line = scanner.nextLine();
        switch (line) {
            case "fragile":
                carList.stream()
                        .filter(c -> c.getCargo().getCargoType().equals("fragile"))
                        .filter(c -> c.getTire().stream().anyMatch(tire -> tire.getTirePressure() < 1))
                        .forEach(e -> System.out.println(e.getModel()));
                break;

            case "flamable":
                carList.stream()
                        .filter(c -> c.getCargo().getCargoType().equals("flamable"))
                        .filter(c -> c.getEngine().getEnginePower() > 250)
                        .forEach(e -> System.out.println(e.getModel()));
                break;
        }
    }

}
