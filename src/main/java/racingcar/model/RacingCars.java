package racingcar.model;

import racingcar.exception.MessageMaker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RacingCars {
    private static final String INVALID_CARNAMES = "자동차이름은 쉼표를 기준으로 구분할 수 있어야합니다";
    private static final String CARNAME_DELIMITER = ",";

    private RacingCars(String carNames){

        validateNames(carNames);
    }
    public static void createCars(String carNames) {
        new RacingCars(carNames);

    }

    public void validateNames(String carNames){

        Matcher matcher = Pattern.compile(CARNAME_DELIMITER).matcher(carNames);
        int delimiterCount = 0;
        while (matcher.find()) {
            delimiterCount++;
        }

        String[] carNameTokens = carNames.split(CARNAME_DELIMITER);

        if(carNameTokens.length != delimiterCount + 1)throw new IllegalArgumentException(MessageMaker.getMessage(INVALID_CARNAMES));


    }
}
