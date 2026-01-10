package racingcar.Domain;

public class Car {
    private final int MAX_NAME_SIZE = 5;

    private final String name;
    private int state;

    public Car(String name) {
        validateCarName(name);
        this.name = name;
        state = 0;
    }

    private void validateCarName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("차 이름 빈 문자열");
        }
        if (name.length() > MAX_NAME_SIZE) {
            throw new IllegalArgumentException("5글자 초과");
        }
    }

    public void move() {
        state += 1;
    }

    public String getStateMessage() {
        String message = name + " : ";
        for (int i = 0; i < state; i++) {
            message = message.concat("-");
        }
        return message + "\n";
    }

    public int compareState(Car car) {
        return state - car.state;
    }

    public String getName() {
        return name;
    }
}
