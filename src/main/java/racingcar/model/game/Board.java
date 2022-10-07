package racingcar.model.game;

import racingcar.exception.MessageMaker;
import racingcar.model.car.Car;
import racingcar.model.car.CarCollection;

import java.util.List;

public class Board {
    private static final String NULL_CAR_COLLECTION = "자동차컬렉션이 존재하지 않습니다";
    private static final String NOT_END_GAME = "게임이 끝나야 확인할 수 있습니다";
    private Count count;

    private CarCollection carCollection;
    public Board(CarCollection carCollection,Count count){
        validateEmpty(carCollection);
        this.carCollection = carCollection;
        this.count = count;
    }

    private void validateEmpty(CarCollection carCollection){
        if(carCollection == null)throw new NullPointerException(MessageMaker.getMessage(NULL_CAR_COLLECTION));
    }

    public void run() {
        while (count.next()){
            carCollection.move();
        }

    }

    public List<Car> getWinners(){
        //if(count.)throw new IllegalStateException(MessageMaker.getMessage(NOT_END_GAME));
        return carCollection.getMaxPositionCars();

    }

    public List<Car> getEntrys(){
        return carCollection.getCars();
    }
}
