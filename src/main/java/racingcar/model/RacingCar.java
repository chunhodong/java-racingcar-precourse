package racingcar.model;

public class RacingCar {

    private CarName carName;
    private Position position;
    public RacingCar(String name){

        this.carName = new CarName(name);
        this.position = new Position();
    }

}
