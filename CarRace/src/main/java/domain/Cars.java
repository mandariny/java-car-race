package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final int RANDOM_RANGE = 10;
    private List<Car> carList;

    private StringBuilder sb = new StringBuilder();

    public Cars() {
        this.carList = new ArrayList<>();
    }

    public void insertCar(String carName){
        try{
            Car car = new Car(carName, ()-> (int)(Math.random() * RANDOM_RANGE));
            carList.add(car);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public int carListSize(){
        return carList.size();
    }

    public ArrayList<Car> getWinners() {
        ArrayList<Car> winners = new ArrayList<>();
        Position maxPosition = getMaxPosition();

        for(Car car : carList){
            if(car.isSame(maxPosition)) winners.add(car);
        }
        return winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for(Car car : carList){
            maxPosition = car.getMaxPosition(maxPosition);
        }
        return maxPosition;
    }


    public String playGames() {
        sb.setLength(0);
        carList.stream().forEach(c -> {
            c.play();
            sb.append(c.getProgress());
        });
        return sb.toString();
    }
}
