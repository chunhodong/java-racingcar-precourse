package racingcar.model.car;

import java.util.List;

public class CarDto {

    private String name;
    private List<Boolean> moveRecords;
    public CarDto(Car car){
        this.name = car.getName();
        this.moveRecords = car.getMoveRecords();
    }
}
