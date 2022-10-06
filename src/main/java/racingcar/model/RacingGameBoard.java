package racingcar.model;

import racingcar.exception.MessageMaker;

public class RacingGameBoard {
    private static final String NULL_CAR_COLLECTION = "자동차컬렉션이 존재하지 않습니다";
    private RacingCarCollection racingCarCollection;
    public RacingGameBoard(RacingCarCollection racingCarCollection){
        validateEmpty(racingCarCollection);
        this.racingCarCollection = racingCarCollection;
    }

    private void validateEmpty(RacingCarCollection racingCarCollection){
        if(racingCarCollection == null)throw new NullPointerException(MessageMaker.getMessage(NULL_CAR_COLLECTION));
    }
}
