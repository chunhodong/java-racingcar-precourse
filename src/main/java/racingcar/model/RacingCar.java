package racingcar.model;

public class RacingCar {

    private Name name;
    private Position position;
    public RacingCar(String name){

        this.name = new Name(name);
        this.position = new Position();
    }

}
