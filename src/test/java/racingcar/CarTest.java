package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.car.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mockStatic;

public class CarTest {


    @Test
    @DisplayName("생성자메소드 입력값검증에서 문자열이 null이면 예외발생")
    void throw_NullPointException_when_null() {

        //given
        String carName = null;

        //when,then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("[ERROR]이름이 존재하지 않습니다");
    }

    @Test
    @DisplayName("생성자메소드 입력값검증에서 문자열이 빈값이면 예외발생")
    void throw_IllegalArgumentException_when_empty_string() {

        //given
        String carName = "";

        //when,then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]빈값은 포함될 수 없습니다");
    }

    @Test
    @DisplayName("생성자메소드 입력값검증에서 문자열사이즈가 5보다 크면 예외발생")
    void throw_IllegalArgumentException_when_not_separation_by_commas() {

        //given
        String carName = "abwegb";

        //when,then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]5글자 이하의 이름을 입력해야합니다");
    }

    @Test
    @DisplayName("move메소드의 입력값이 4이상이면 포지션 1증가")
    void get_plused_position_when_call_move() {

        //given
        String carName = "test";

        //when
        Car car = new Car(carName);
        car.move(5);
        car.move(5);


        //then
        assertThat(car.getCurrentPosition()).isEqualTo(2);
    }


}
