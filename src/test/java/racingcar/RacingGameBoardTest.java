package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.RacingCarCollection;
import racingcar.model.RacingGameBoard;

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
    @DisplayName("경주메소드에서 시도횟수가 0이하면 예외발생")
    void throw_IllegalArgumentException_when_lessthen_0() {


        //given
        RacingGameBoard racingGameBoard = new RacingGameBoard(RacingCarCollection.create("a,b,c"));

        //when,then
        assertThatThrownBy(() -> racingGameBoard.run(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]시도횟수는 1 이상이어야 합니다");
    }


}
