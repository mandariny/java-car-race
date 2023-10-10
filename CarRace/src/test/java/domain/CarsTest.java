package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    void setup(){
        cars = new Cars();
    }

    @Test
    @DisplayName("자동차 이름 부여")
    void 자동차_이름_부여(){
        cars.inserCar("pobi");
        assertThat(cars.carListSize()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없음")
    void 자동차_이름_길이_검사(){
        cars.inserCar("abcdefg");
        assertThat(cars.carListSize()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 이름 5자 이하는 사용 가능")
    void 자동차_이름_사용_가능_길이_검사(){
        cars.inserCar("abcde");
        assertThat(cars.carListSize()).isEqualTo(1);
    }
}

