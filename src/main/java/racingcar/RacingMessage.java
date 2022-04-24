package racingcar;

import static racingcar.ValidUtils.COMPARE_LENGTH;

public class RacingMessage {
    public static final String MESSAGE_ERROR = "[ERROR] ";
    public static final String MESSAGE_ERROR_EMPTY = MESSAGE_ERROR + "자동차 이름을 입력하여 주세요.";
    public static final String MESSAGE_ERROR_OVER_LENGTH = MESSAGE_ERROR + "자동차 이름은 " + COMPARE_LENGTH + "5글자를 넘을 수 없습니다.";
    public static final String MESSAGE_ERROR_NUMBER_FORMAT = MESSAGE_ERROR + "시도 횟수는 숫자여야 합니다.";


}
