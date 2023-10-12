package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;
    private final int MAX_LENTH = 5;
    private StringBuilder sb = new StringBuilder();

    public Cars() {
        this.carList = new ArrayList<>();
    }

    public void insertCar(String carName){
        if(!isRightCarNameLength(carName)) return;

        Car car = new Car(carName, ()-> (int)(Math.random() * 10));
        carList.add(car);
    }

    public int carListSize(){
        return carList.size();
    }

    private boolean isRightCarNameLength(String carName){
        if(carName.length() > MAX_LENTH) return false;
        return true;
    }

    public ArrayList<String> getWinners() {
        ArrayList<String> winners = new ArrayList<>();
        int maxStatus = 0;

        for(Car car : carList){
            int carStatus = car.getStatus();
            if(maxStatus > carStatus) continue;
            if(maxStatus == carStatus){
                winners.add(car.getCarName());
                continue;
            }
            maxStatus = carStatus;
            winners.clear();
            winners.add(car.getCarName());
        }
        return winners;
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
