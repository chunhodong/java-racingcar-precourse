package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.car.RacingCarCollection;
import racingcar.model.board.RacingGameBoard;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingGameBoardTest {

    @Test
    @DisplayName("생성자메소드에서 자동차컬렉션객체가 null이면 예외발생")
    void throw_NullPointException_when_null() {


        //given
        RacingCarCollection racingCarCollection = null;

        //when,then
        assertThatThrownBy(() -> new RacingGameBoard(racingCarCollection))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("[ERROR]자동차컬렉션이 존재하지 않습니다");
    }

    @Test
    @DisplayName("winner메소드는 run메소드가 호출되기전에 호출되면 예외발생")
    void throw_IllegalStateException_when_before_run_method_is_called() {


        //given
        RacingGameBoard racingCarCollection = new RacingGameBoard(RacingCarCollection.create("a,b,c"));

        //when,then
        assertThatThrownBy(() -> racingCarCollection.getWinners())
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR]게임이 끝나야 확인할 수 있습니다");
    }


    @Test
    @DisplayName("run메소드는 입력값이없으면 예외발생")
    void throw_NullPointException_when_called_run_by_null() {


        //given
        RacingGameBoard racingCarCollection = new RacingGameBoard(RacingCarCollection.create("a,b,c"));

        //when,then
        assertThatThrownBy(() -> racingCarCollection.run(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("[ERROR]시도횟수를 입력해야 합니다");
    }



}
