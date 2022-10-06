package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;

public class RacingCar implements Comparable<RacingCar> {

    private static final int VALUE_TO_ADVANCE = 4;
    private static final int INITIAL_POSITION = 0;
    private CarName carName;
    private CarPosition carPosition;
    private List<Integer> carPositionRecords;
    public RacingCar(String name){

        this.carName = new CarName(name);
        this.carPosition = new CarPosition(INITIAL_POSITION);
        this.carPositionRecords = new ArrayList<Integer>();
    }

    public void move(int value){
        if(value >= VALUE_TO_ADVANCE)
            carPosition.go();
        carPositionRecords.add(carPosition.value());
    }

    public int getCurrentPosition(){
        return carPosition.value();

    }

    @Override
    public int compareTo(RacingCar racingCar) {
        return getCurrentPosition() - racingCar.getCurrentPosition();
    }
}
