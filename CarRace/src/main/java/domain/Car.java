package domain;

import util.RandomUtil;

public class Car {
    private String carName;
    private RandomUtil rand;
    private int status;
    private final int STATUS_STANDARD = 4;
    private StringBuilder sb = new StringBuilder();


    public Car(String carName, RandomUtil rand) {
        this.carName = carName;
        this.rand = rand;
    }

    public void play(){
        int randStatus = rand.generateRandomNum();
        if(randStatus >= STATUS_STANDARD) this.status += randStatus;
    }

    public String getCarName(){ return this.carName; }

    public int getStatus(){
        return this.status;
    }

    public String getProgress(){
        sb.setLength(0);
        sb.append(carName).append(" : ");
        for(int i=0; i<this.status; i++) sb.append("-");
        sb.append("\n");
        return sb.toString();
    }
}
