package service;

import domain.Car;
import domain.Cars;
import ui.ResultView;

import java.util.ArrayList;

public class CarRaceGame {
    private Cars cars;
    private ResultView resultView = new ResultView();

    public CarRaceGame(Cars cars) {
        this.cars = cars;
    }

    public void makeCarList(String inputCarName){
        String[] carNames = inputCarName.split(",");
        for(String carName : carNames) cars.insertCar(carName);
    }

    public void playGames(int gameCnt){
        for(int i=0; i<gameCnt; i++) {
            String result = cars.playGames();
            resultView.printProgress(result);
        }

        printWinners(cars.getWinners());
    }

    public void printWinners(ArrayList<Car> winners){
        resultView.printWinners(winners);
    }
}
