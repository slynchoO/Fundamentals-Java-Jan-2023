package fundamentals.objAndClassesExer.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        double sumCar = 0;
        double sumTruck = 0;

        int carCounter = 0;
        int truckCounter = 0;

        while (!command.equals("End")) {

            String type = command.split("\\s+")[0];
            String model = command.split("\\s+")[1];
            String color = command.split("\\s+")[2];
            int horsePower = Integer.parseInt(command.split("\\s+")[3]);

            if (type.equals("car")) {
                type = "Car";
                sumCar += horsePower;
                carCounter++;
            } else {
                type = "Truck";
                sumTruck += horsePower;
                truckCounter++;
            }

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);

            command = sc.nextLine();
        }

        String input = sc.nextLine();

        while (!input.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList
            ) {
                if (input.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", vehicle.getModel());
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    System.out.printf("Horsepower: %d%n", vehicle.getHorsePower());
                }
            }

            input = sc.nextLine();
        }

        double avgCar = sumCar / carCounter;
        double avgTruck = sumTruck / truckCounter;


        if (Double.isNaN(avgTruck)) {
            avgTruck = 0.00;
        } else if (Double.isNaN(avgCar)) {
            avgCar = 0.00;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCar);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruck);
    }
}
