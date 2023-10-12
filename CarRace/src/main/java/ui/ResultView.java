package ui;

import domain.Car;

import java.util.ArrayList;

public class ResultView {
    private StringBuilder sb = new StringBuilder();

    public void printProgress(String progress){
        System.out.println(progress);
    }
    public void printWinners(ArrayList<Car> winners){
        int len = winners.size();
        if(len == 0) {
            System.out.println("우승자가 없습니다.\n");
            return;
        }
        sb.setLength(0);
        sb.append(winners.get(0));
        for(int i=1; i<len; i++){
            sb.append(", ").append(winners.get(i).getCarName());
        }
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb.toString());
    }
}
