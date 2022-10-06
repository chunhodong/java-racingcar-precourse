package racingcar.model.car;

public class RacingCar {

    private CarName carName;
    private CarPosition carPosition;
    public RacingCar(String name){

        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

}
