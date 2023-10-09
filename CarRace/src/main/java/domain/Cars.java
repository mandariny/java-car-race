package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carList;
    private final int MAX_LENTH = 5;

    public Cars() {
        this.carList = new ArrayList<>();
    }

    public void inserCar(String carName){
        if(!isRightCarNameLength(carName)) return;

        Car car = new Car(carName);
        carList.add(car);
    }

    public int carListSize(){
        return carList.size();
    }

    private boolean isRightCarNameLength(String carName){
        if(carName.length() > MAX_LENTH) return false;
        return true;
    }
}
