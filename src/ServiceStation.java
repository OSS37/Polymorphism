public class ServiceStation {
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Transport car = cars[i];
            System.out.println("Обслуживаем " + car.getModelName());
            for (int j = 0; j < car.wheelsCount; j++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }

    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Transport truck = trucks[i];
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int j = 0; j < truck.wheelsCount; j++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Transport bicycle = bicycles[i];
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int j = 0; j < bicycle.wheelsCount; j++) {
                bicycle.updateTyre();
            }
        }
    }
}