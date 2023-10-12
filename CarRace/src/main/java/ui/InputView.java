package ui;

import domain.Cars;
import service.CarRaceGame;

import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = s.next();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int gameCnt = s.nextInt();

        Cars cars = new Cars();
        CarRaceGame carRaceGame = new CarRaceGame(cars);
        carRaceGame.makeCarList(carNames);

        System.out.println("실행 결과\n");
        carRaceGame.playGames(gameCnt);

        s.close();
    }
}
