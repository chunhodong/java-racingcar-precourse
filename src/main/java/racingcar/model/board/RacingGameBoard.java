package racingcar.model.board;

import racingcar.exception.MessageMaker;
import racingcar.model.car.RacingCarCollection;

public class RacingGameBoard {
    private static final String NULL_CAR_COLLECTION = "자동차컬렉션이 존재하지 않습니다";
    private static final String NOT_ALLOW_COUNT = "시도횟수는 1 이상이어야 합니다";

    private RacingCarCollection racingCarCollection;
    public RacingGameBoard(RacingCarCollection racingCarCollection){
        validateEmpty(racingCarCollection);
        this.racingCarCollection = racingCarCollection;
    }

    private void validateEmpty(RacingCarCollection racingCarCollection){
        if(racingCarCollection == null)throw new NullPointerException(MessageMaker.getMessage(NULL_CAR_COLLECTION));
    }

    public void run(int tryCount) {
        if(tryCount <= 0)throw new IllegalArgumentException(MessageMaker.getMessage(NOT_ALLOW_COUNT));
    }
}
