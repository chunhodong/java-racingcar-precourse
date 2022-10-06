package racingcar.model.car;

import racingcar.exception.MessageMaker;
import racingcar.utils.StringUtils;

import java.util.*;

public class RacingCarCollection {
    private static final String NULL_CARNAMES = "자동차이름이 존재해야합니다";
    private static final String INVALID_CARNAMES = "자동차이름은 쉼표를 기준으로 구분할 수 있어야합니다";
    private static final String DUPLICATE_CARNAME = "자동차이름은 중복될 수 없습니다";
    private static final String CARNAME_DELIMITER = ",";

    private List<RacingCar> racingCars;
    private RacingCarCollection(String carNames){
        validateNames(carNames);
        validateDuplicate(carNames);
        this.racingCars = createRacingCars(carNames);

    }
    public static RacingCarCollection create(String carNames) {
        return new RacingCarCollection(carNames);
    }
    private void validateDuplicate(String carNames){
        String[] carNameTokens = carNames.split(CARNAME_DELIMITER);
        if(new HashSet(Arrays.asList(carNameTokens)).size() != carNameTokens.length)
            throw new IllegalArgumentException(MessageMaker.getMessage(DUPLICATE_CARNAME));
    }

    private void validateNames(String carNames){
        if(carNames == null) throw new NullPointerException(MessageMaker.getMessage(NULL_CARNAMES));


        int delimiterCount = StringUtils.getCharacterCount(carNames,CARNAME_DELIMITER.charAt(0));
        String[] carNameTokens = carNames.split(CARNAME_DELIMITER);
        if(carNameTokens.length != delimiterCount + 1)throw new IllegalArgumentException(MessageMaker.getMessage(INVALID_CARNAMES));

    }

    private List<RacingCar> createRacingCars(String carNames){
        List<RacingCar> racingCars = new ArrayList<>();
        String[] carNameTokens = carNames.split(CARNAME_DELIMITER);
        for(int i = 0; i < carNameTokens.length; i++){
            racingCars.add(new RacingCar(carNameTokens[i]));
        }
        return racingCars;

    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }
}
