package service;

import domain.Cars;

public class CarRaceGame {
    private Cars cars;

    public CarRaceGame(Cars cars) {
        this.cars = cars;
    }

    public void makeCarList(String inputCarName){
        String[] carNames = inputCarName.split(",");
        for(String carName : carNames) cars.inserCar(carName);
    }
}
