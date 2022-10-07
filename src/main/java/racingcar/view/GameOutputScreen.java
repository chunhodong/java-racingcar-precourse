package racingcar.view;

import racingcar.model.car.CarDto;

import java.util.List;

public class GameOutputScreen {

    public void printRacingResult(List<CarDto> carDtos,int count) {
        System.out.println("실행 결과");
        for(int i = 0; i < count; i++){
           printRacingCarsRecord(carDtos,i);
        }

    }

    private void printRacingCarsRecord(List<CarDto> carDtos,int index){
        for(int i = 0; i < carDtos.size(); i++){
            System.out.print(carDtos.get(i).getName().concat(" : "));
            printRacingCarMoveRecord(carDtos.get(i).getMoveRecords(),index);
        }
    }

    private void printRacingCarMoveRecord(List<Boolean> moveRecords,int index){

        for(int i = 0; i <= index; i++){
            printRacingCarMove(moveRecords.get(i));
        }
    }

    private void printRacingCarMove(boolean isMove){
        if(isMove)
            System.out.print("-");

    }


}
