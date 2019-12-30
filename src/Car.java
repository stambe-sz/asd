import java.util.List;

public class Car {
    private String model;
    private List<Tire> tire;
    private Engine engine;
    private Cargo cargo;

    public Car(String model, List<Tire> tire, Engine engine, Cargo cargo) {
        this.model = model;
        this.tire = tire;
        this.engine = engine;
        this.cargo = cargo;
    }

    public String getModel() {
        return model;
    }

    public List<Tire> getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }


}
/*
Raw Data

On the first line of the input you will receive a number N - the number
of cars you have, on each of the next N lines you will receive information
 about a car in the format "<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType>
  <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>" where the speed, power, weight and tire age are integers, tire pressure is a double.
After the N lines you will receive a single line with one of 2 commands "fragile" or "flamable" , if the command is "fragile" print all cars whose Cargo Type is "fragile" with a tire whose pressure is  < 1, if the command is "flamable" print all cars whose Cargo Type is "flamable" and have Engine Power > 250. The cars should be printed in order of appearing in the input.
2
ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
fragile

 */