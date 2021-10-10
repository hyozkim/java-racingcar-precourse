package nextstep.view;

import nextstep.model.RacingCar;
import nextstep.utils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static nextstep.common.Constant.*;
public class InputView {
    public InputView() {}

    public int inputTurns() {
        systemOutPrint(INPUT_MESSAGE_MOVE_TURN);
        String input = Console.readLine();

        checkDigit(input);
        return Integer.parseInt(input);
    }

    public void checkDigit(String turns) {
        if( !turns.matches("[+-]?\\d*(\\.\\d+)?") ) {
            systemOutPrint(ERROR_MESSAGE_NUMBER_ONLY);
            throw new IllegalArgumentException(ERROR_MESSAGE_NUMBER_ONLY);
        }
    }

    public List<RacingCar> inputCars() {
        systemOutPrint(INPUT_MESSAGE_CAR_NAME);
        String[] cars = Console.readLine().split(",");;
        checkTotalSize(cars.length);
        return Arrays.stream(cars)
                .map(name -> {
                    checkStringLength(name.trim());
                    return new RacingCar(name.trim(), 0);
                })
                .collect(Collectors.toList());
    }

    public void checkTotalSize(int length) {
        if( length < 2 ) {
            systemOutPrint(ERROR_MESSAGE_MIN_LENGTH_REQUIRED);
            throw new IllegalArgumentException(ERROR_MESSAGE_MIN_LENGTH_REQUIRED);
        }
    }

    public void checkStringLength(String name) {
        if( name != null && name.length() > 5 ) {
            systemOutPrint(ERROR_MESSAGE_LESS_THAN_5_DIGIT);
            throw new NoSuchElementException(ERROR_MESSAGE_LESS_THAN_5_DIGIT);
        }
    }
}
