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
    @DisplayName("입력값검증에서 문자열이 null값이면 예외발생")
    void throw_IllegalArgumentException_when_not_separation_by_commas() {

 /*       //given
        String carName = null;

        //when,then
        assertThatThrownBy(() -> new RacingCar(carName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]5글자 이하의 자동차이름을 입력해야합니다");*/
    }



}
