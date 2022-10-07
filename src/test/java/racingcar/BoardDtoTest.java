package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racingcar.model.car.CarCollection;
import racingcar.model.game.Board;
import racingcar.model.game.BoardDto;
import racingcar.model.game.Count;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class BoardDtoTest {


    @Test
    @DisplayName("getWinner메소드는 position값높은 자동차이름를 반환 ")
    void returns_racingcars_with_max_position(){

        //given
        MockedStatic<Randoms> mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(5, Arrays.stream(new Integer[]{1,2,3,7,1}).toArray());
        Board board = new Board(CarCollection.create("a,b,c"),new Count("5"));
        board.run();


        //when
        BoardDto boardDto = new BoardDto(board);


        //then
        assertThat(boardDto.getWinners().length).isEqualTo(2);
        assertThat(boardDto.getWinners()[0]).isEqualTo("a");
        assertThat(boardDto.getWinners()[1]).isEqualTo("b");

    }
}
