package nextstep.view;

import nextstep.model.RacingCar;
import nextstep.utils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static nextstep.common.Constant.*;
public class InputView {

    public int inputTurns() {
        systemOutPrint(INPUT_MESSAGE_MOVE_TURN);
        String input = Console.readLine();

        checkDigit(input);
        return Integer.parseInt(input);
    }

    public void checkDigit(String turns) {
        if( !turns.matches("[+-]?\\d*(\\.\\d+)?") ) {
            throw new IllegalArgumentException(ERROR_MESSAGE_NUMBER_ONLY);
        }
    }

    public List<RacingCar> inputCars() {
        systemOutPrint(INPUT_MESSAGE_CAR_NAME);
        String carString = Console.readLine();
        String[] cars = carString.split(",");

        checkTotalSize(cars.length);
        return Arrays.stream(cars)
                .map(name -> new RacingCar(name, 0))
                .collect(Collectors.toList());
    }

    public void checkTotalSize(int length) {
        if( length < 2 ) {
            throw new IllegalArgumentException(ERROR_MESSAGE_MIN_LENGTH_REQUIRED);
        }
    }

    public void checkStringLength(String name) {
        if( name != null && name.length() > 5 ) {
            throw new IllegalArgumentException(ERROR_MESSAGE_LESS_THAN_5_DIGIT);
        }
    }
}
