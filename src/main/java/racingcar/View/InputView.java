package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Constant.ErrorMessage;
import racingcar.Constant.OutputMessage;

public class InputView {
    public static String askCarName(){
        System.out.println(OutputMessage.ASK_CAR_NAMES.getMessage());
        String carName = Console.readLine();
        validateCarNameInput(carName);
        return carName;
    }

    private static void validateCarNameInput(String carName){
        if(carName.isEmpty()){
            throw new IllegalArgumentException(ErrorMessage.INPUT_CAR_NAME_NULL.getMessage());
        }
    }

    public static int askCount(){
        System.out.println(OutputMessage.ASK_COUNT.getMessage());
        String count = Console.readLine();
        validateCount(count);
        return Integer.parseInt(count);
    }

    private  static void validateCount(String count){
        try{
            Integer.parseInt(count);
        }
        catch (Exception exception){
            throw new IllegalArgumentException(ErrorMessage.INPUT_COUNT_NOT_INTEGER.getMessage());
        }

        if(Integer.parseInt(count) < 0){
            throw new IllegalArgumentException(ErrorMessage.INPUT_COUNT_NEGATIVE.getMessage());
        }
    }
}
