package nextstep.view;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCar;
import nextstep.model.RacingCars;

import static nextstep.common.Constant.*;

public class OutputView {

    public static void printResult(ResponseDto responseDto) {
        printRaceResult(responseDto.getRacingCars());
        systemOutPrintf(END_MESSAGE, responseDto.getWinners());
    }

    private static void printRaceResult(RacingCars racingCars) {
        for(RacingCar racingCar : racingCars.getRacingCarList()) {
            systemOutPrintf(RESULT_MESSAGE, racingCar.getName(), racingCar.getDistance());
        }
    }
}
