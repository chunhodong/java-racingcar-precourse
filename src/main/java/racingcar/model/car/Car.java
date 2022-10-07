package racingcar.model.car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private static final int VALUE_TO_ADVANCE = 4;
    private static final int INITIAL_POSITION = 0;
    private Name name;
    private Position position;
    private List<Integer> positionRecords;
    public Car(String name){

        this.name = new Name(name);
        this.position = new Position(INITIAL_POSITION);
        this.positionRecords = new ArrayList<Integer>();
    }

    public void move(int value){
        if(value >= VALUE_TO_ADVANCE)
            position.go();
        positionRecords.add(position.value());
    }

    public int getCurrentPosition(){
        return position.value();

    }

    public String getName(){
        return name.toString();
    }

    public List<Integer> getPositionRecords(){
        return positionRecords;
    }

}
