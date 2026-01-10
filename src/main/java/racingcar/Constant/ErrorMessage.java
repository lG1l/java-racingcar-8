package racingcar.Constant;

public enum ErrorMessage {
    INPUT_CAR_NAME_NULL("차 이름으로 빈 문자열을 입력할 수 없습니다."),
    INPUT_COUNT_NOT_INTEGER("입력한 횟수가 정수가 아닙니다."),
    INPUT_COUNT_NEGATIVE("입력한 횟수가 음수입니다.");

    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
