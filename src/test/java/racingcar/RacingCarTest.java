package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCar;
import racingcar.model.RacingCarCollection;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarTest {


    @Test
    @DisplayName("입력값검증에서 문자열이 null이면 예외발생")
    void throw_IllegalArgumentException_when_null() {

        //given
        String carName = null;

        //when,then
        assertThatThrownBy(() -> new RacingCar(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]빈값은 포함될 수 없습니다");
    }

    @Test
    @DisplayName("입력값검증에서 문자열이 빈값이면 예외발생")
    void throw_IllegalArgumentException_when_empty_string() {

        //given
        String carName = "      ";

        //when,then
        assertThatThrownBy(() -> new RacingCar(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]빈값은 포함될 수 없습니다");
    }

    @Test
    @DisplayName("입력값검증에서 문자열사이즈가 5보다 크면 예외발생")
    void throw_IllegalArgumentException_when_not_separation_by_commas() {

        //given
        String carName = "abwegb";

        //when,then
        assertThatThrownBy(() -> new RacingCar(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]5글자 이하의 이름을 입력해야합니다");
    }




}
