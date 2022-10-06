package racingcar.model.board;

import racingcar.exception.MessageMaker;
import racingcar.model.car.RacingCarCollection;

public class RacingGameBoard {
    private static final String NULL_CAR_COLLECTION = "자동차컬렉션이 존재하지 않습니다";
    private static final String NULL_TRY_COUNT = "시도횟수를 입력해야 합니다";
    private static final String NOT_END_GAME = "게임이 끝나야 확인할 수 있습니다";
    private boolean isEnd = false;

    private RacingCarCollection racingCarCollection;
    public RacingGameBoard(RacingCarCollection racingCarCollection){
        validateEmpty(racingCarCollection);
        this.racingCarCollection = racingCarCollection;
    }

    private void validateEmpty(RacingCarCollection racingCarCollection){
        if(racingCarCollection == null)throw new NullPointerException(MessageMaker.getMessage(NULL_CAR_COLLECTION));
    }

    public void run(TryCount tryCount) {
        if(tryCount == null)throw new NullPointerException(MessageMaker.getMessage(NULL_TRY_COUNT));
        while (tryCount.next()){
            racingCarCollection.move();
        }
        isEnd = true;

    }

    public void getWinners(){
        if(!isEnd)throw new IllegalStateException(MessageMaker.getMessage(NOT_END_GAME));

    }
}
