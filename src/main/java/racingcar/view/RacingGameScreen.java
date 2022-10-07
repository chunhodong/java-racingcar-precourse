package racingcar.view;

import racingcar.model.car.Car;
import racingcar.model.car.CarDto;

import java.util.List;

public class RacingGameScreen {

    public void printEntry() {
        System.out.println("경주 할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printRetryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printRacingResult(String result) {
        System.out.println("실행 결과");
        System.out.println(result);
    }

    public void printRacingRecords(List<CarDto> carDtos){

    }

    public void printRacingWinner(String winner) {
        System.out.println("최종 우승자 : ".concat(winner));
    }
}



