package domain;

public class CarName {
    private static final int MAX_LENTH = 5;
    private String name;

    public CarName(String name){
        if(name.length() > MAX_LENTH) throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        this.name = name;
    }

    public String getCarName() {
        return this.name;
    }
}
