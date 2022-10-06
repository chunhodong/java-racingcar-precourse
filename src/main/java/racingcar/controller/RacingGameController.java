package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.car.RacingCarCollection;

public class RacingGameController {


    public void start() {
        String carNames = Console.readLine();
        RacingCarCollection racingCars = requestRacingCarCollection(carNames);


    }


    private RacingCarCollection requestRacingCarCollection(String carNames){

        while(true) {
            try {

            } catch (IllegalArgumentException exception) {

            }
        }

    }

}
