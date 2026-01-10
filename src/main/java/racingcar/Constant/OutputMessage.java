package racingcar.Constant;

public enum OutputMessage {
    ASK_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ASK_COUNT("시도할 횟수는 몇 회인가요?"),
    GAME_START("\n실행 결과"),
    WINNER("\n최종 우승자 :");

    private final String message;

    private OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
