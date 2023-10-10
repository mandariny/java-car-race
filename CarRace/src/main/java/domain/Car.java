package domain;

import util.RandomUtil;

public class Car {
    private String carName;
    private RandomUtil rand;
    private int status;
    private final int STATUS_STANDARD = 4;


    public Car(String carName, RandomUtil rand) {
        this.carName = carName;
        this.rand = rand;
    }

    public void play(){
        int randStatus = rand.generateRandomNum();
        if(randStatus >= STATUS_STANDARD) this.status += randStatus;
    }

    public int getStatus(){
        return this.status;
    }

}
