package ui;

import java.util.Scanner;

public class InputView {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carNames = s.next();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int gameCnt = s.nextInt();

        s.close();
    }
}
