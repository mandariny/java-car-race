package domain;

import util.RandomUtil;

public class Car {

    private static final int STATUS_STANDARD = 4;
    private CarName carName;
    private RandomUtil rand;
    private Position position;
    private StringBuilder sb = new StringBuilder();

    public Car(String carName, RandomUtil rand) {
        this.carName = new CarName(carName);
        this.position = new Position();
        this.rand = rand;
    }

    public void play(){
        int randStatus = rand.generateRandomNum();
        if(randStatus >= STATUS_STANDARD) position.increase();
    }

    public String getCarName(){ return this.carName.getCarName(); }

    public String getProgress(){
        sb.setLength(0);
        sb.append(carName.getCarName()).append(" : ");
        sb.append(position.getPositionString());
        sb.append("\n");
        return sb.toString();
    }

    public boolean isLessThen(Position maxStatus) {
        return position.isLessThen(maxStatus);
    }

    public boolean isSame(Position maxStatus) {
        return position.equals(maxStatus);
    }

    public Position getMaxPosition(Position maxPosition) {
        return this.position.getMaxPosition(maxPosition);
    }

    public Position getPosition() {
        return this.position;
    }
}
