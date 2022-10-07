package racingcar.model.game;

import racingcar.model.car.Car;
import racingcar.model.car.CarDto;

import java.util.ArrayList;
import java.util.List;

public class BoardDto {

    private List<CarDto> entrys;
    private List<CarDto> winners;
    public BoardDto(Board board){
        this.winners = createWinners(board.getWinners());
        this.entrys = createEntrys(board.getEntrys());
    }

    private List<CarDto> createWinners(List<Car> winners){
        List<CarDto> carDtos = new ArrayList<>();
        for(int i = 0; i < winners.size(); i++){
            carDtos.add(new CarDto(winners.get(i)));
        }
        return carDtos;
    }

    private List<CarDto> createEntrys(List<Car> entrys){
        List<CarDto> carDtos = new ArrayList<>();
        for(int i = 0; i < entrys.size(); i++){
            carDtos.add(new CarDto(entrys.get(i)));
        }
        return carDtos;
    }

    public String[] getWinners(){
        String[] carNames = new String[winners.size()];
        for(int i = 0; i < winners.size(); i++){
            carNames[i] = winners.get(i).getName();
        }
        return carNames;
    }
}
