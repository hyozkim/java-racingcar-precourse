package nextstep.view;

import nextstep.model.Distance;
import nextstep.model.RacingCar;
import nextstep.utils.Console;

import java.util.ArrayList;
import java.util.List;

import static nextstep.common.Constant.*;
public class InputView {
    public static int createTurns() {
        systemOutPrint(INPUT_MESSAGE_MOVE_TURN);
        String input = Console.readLine();
        checkDigit(input);
        return Integer.parseInt(input);
    }

    public static void checkDigit(String turns) {
        if( !turns.matches("[+-]?\\d*(\\.\\d+)?") ) {
            systemOutPrint(ERROR_MESSAGE_NUMBER_ONLY);
            throw new IllegalArgumentException(ERROR_MESSAGE_NUMBER_ONLY);
        }
    }

    public static List<RacingCar> createRacingCars() {
        systemOutPrint(INPUT_MESSAGE_CAR_NAME);
        String[] names = Console.readLine().split(",");
        List<RacingCar> racingCarList = new ArrayList<>();
        for( String name : names ) {
            racingCarList.add(new RacingCar(name.trim(), new Distance()));
        }
        return racingCarList;
    }
}
