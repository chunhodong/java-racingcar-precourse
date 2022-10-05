package racingcar.model;

import racingcar.exception.MessageMaker;
import racingcar.utils.StringUtils;

public class RacingCars {
    private static final String INVALID_CARNAMES = "자동차이름은 쉼표를 기준으로 구분할 수 있어야합니다";
    private static final String CARNAME_DELIMITER = ",";

    private RacingCars(String carNames){

        validateNames(carNames);
    }
    public static RacingCars createCars(String carNames) {
        return new RacingCars(carNames);
    }

    private void validateNames(String carNames){
        if(carNames == null) throw new IllegalArgumentException(MessageMaker.getMessage(INVALID_CARNAMES));


        int delimiterCount = StringUtils.getCharacterCount(carNames,CARNAME_DELIMITER.charAt(0));
        String[] carNameTokens = carNames.split(CARNAME_DELIMITER);
        if(carNameTokens.length != delimiterCount + 1)throw new IllegalArgumentException(MessageMaker.getMessage(INVALID_CARNAMES));

    }

}
