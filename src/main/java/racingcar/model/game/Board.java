package racingcar.model.game;

import racingcar.exception.MessageMaker;
import racingcar.model.car.Car;
import racingcar.model.car.CarCollection;

import java.util.List;

public class Board {
    private static final String NULL_CAR_COLLECTION = "자동차컬렉션이 존재하지 않습니다";
    private static final String NULL_TRY_COUNT = "시도횟수를 입력해야 합니다";
    private static final String NOT_END_GAME = "게임이 끝나야 확인할 수 있습니다";
    private boolean isEnd = false;

    private CarCollection carCollection;
    public Board(CarCollection carCollection){
        validateEmpty(carCollection);
        this.carCollection = carCollection;
    }

    private void validateEmpty(CarCollection carCollection){
        if(carCollection == null)throw new NullPointerException(MessageMaker.getMessage(NULL_CAR_COLLECTION));
    }

    public void run(Count count) {
        if(count == null)throw new NullPointerException(MessageMaker.getMessage(NULL_TRY_COUNT));
        while (count.next()){
            carCollection.move();
        }
        isEnd = true;

    }

    public List<Car> getWinners(){
        if(!isEnd)throw new IllegalStateException(MessageMaker.getMessage(NOT_END_GAME));
        return carCollection.getMaxPositionCars();

    }
}
