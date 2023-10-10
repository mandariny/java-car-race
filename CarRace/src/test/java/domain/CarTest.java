package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.RandomUtil;

public class CarTest {
    Car car;

    @Test
    @DisplayName("랜덤 값이 4이상일 경우 전진")
    void 랜덤값_4이상_전진(){
        // given
        car = new Car("pobi", () -> 4);

        // when
        car.play();

        // then
        Assertions.assertThat(car.getStatus()).isEqualTo(4);
    }

    @Test
    @DisplayName("랜덤 값이 4미만일 경우 전진")
    void 랜덤값_4미만_전진_안함(){
        // given
        car = new Car("pobi", () -> 3);

        // when
        car.play();

        // then
        Assertions.assertThat(car.getStatus()).isEqualTo(0);
    }
}
