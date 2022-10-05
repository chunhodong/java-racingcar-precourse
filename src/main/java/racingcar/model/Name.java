package racingcar.model;

import racingcar.exception.MessageMaker;

public class Name {
    private static final String EMPTY_NAME = "빈값은 포함될 수 없습니다";
    private static final String NOT_ALLOW_SIZE = "5글자 이하의 이름을 입력해야합니다";

    private static final int MAX_SIZE = 5;
    private String name;
    public Name(String name){
        validateEmpty(name);
        validateSize(name);
        this.name = name;
    }

    private void validateEmpty(String name){
        if(name == null || name.isEmpty())throw new IllegalArgumentException(MessageMaker.getMessage(EMPTY_NAME));
        if(isEmpty(name)) throw new IllegalArgumentException(MessageMaker.getMessage(EMPTY_NAME));
    }
    private boolean isEmpty(String name){
        int emptyCount = 0;
        for(int i = 0; i < name.length(); i++){
            emptyCount += checkEmptyCharacter(name.charAt(i));
        }
        return emptyCount == name.length();
    }
    private int checkEmptyCharacter(char c){
        return c == ' ' ? 1 : 0;

    }

    private void validateSize(String name){
        if(name.length() > MAX_SIZE)throw new IllegalArgumentException(MessageMaker.getMessage(NOT_ALLOW_SIZE));

    }
}
