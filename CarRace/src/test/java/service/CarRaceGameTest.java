package service;

import domain.Cars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarRaceGameTest {
    Cars cars;

    @BeforeEach
    void setup(){
        cars = new Cars();
    }

    @Test
    @DisplayName("자동차 이름 쉼표로 구분")
    void 자동차_이름_쉼표_구분(){
        // given
        CarRaceGame carRaceGame = new CarRaceGame(cars);

        // when
        carRaceGame.makeCarList("pobi,crong,honux");

        // then
        assertThat(cars.carListSize()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 이름 쉼표로 구분")
    void 자동차_이름_쉼표_구분2(){
        // given
        CarRaceGame carRaceGame = new CarRaceGame(cars);

        // when
        carRaceGame.makeCarList("pi.ng,honux");

        // then
        assertThat(cars.carListSize()).isEqualTo(2);
    }
}