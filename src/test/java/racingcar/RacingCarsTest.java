package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarsTest {

    @Nested
    @DisplayName("자동차컬렉션을 생성하는 create메소드는")
    class Create{

        @Test
        @DisplayName("입력값검증에서 쉼표로 구분한 문자열개수가 쉼표+1개수보다 적으면 예외발생")
        void throw_IllegalArgumentException_when_not_separation_by_commas() {

            //given
            String carNames = "awfwaf,";

            //when,then
            assertThatThrownBy(() -> RacingCars.createCars(carNames))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessageContaining("[ERROR]자동차이름은 쉼표를 기준으로 구분할 수 있어야합니다");
        }

    }







}
