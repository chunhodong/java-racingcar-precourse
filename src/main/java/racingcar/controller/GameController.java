package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.car.CarCollection;

public class GameController {


    public void start() {
        String carNames = Console.readLine();
        CarCollection racingCars = requestRacingCarCollection(carNames);


    }


    private CarCollection requestRacingCarCollection(String carNames){

        while(true) {
            try {

            } catch (IllegalArgumentException exception) {

            }
        }

    }

}
