package nextstep.view;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCar;

import java.util.List;

import static nextstep.common.Constant.*;

public class OutputView {
    public OutputView() {
    }

    public void printResult(ResponseDto responseDto) {
        if (responseDto.isSuccess()) {
            printRaceResult(responseDto.getRacingCarList(), responseDto.getMessage());
            systemOutPrintf(END_MESSAGE, responseDto.getMessage());
            return;
        }
    }

    private void printRaceResult(List<RacingCar> racingCarList, String winner) {
        StringBuilder sb = new StringBuilder();
        for(RacingCar racingCar : racingCarList) {
            String name = racingCar.getName();

            sb = buildResultString(sb, name, winner.equals(name));
        }

        systemOutPrint(sb.toString());
    }

    private StringBuilder buildResultString(StringBuilder sb, String name, boolean isWinner) {
        sb.append(name).append(" : ").append(isWinner ? "-" : "").append("\n");
        return sb;
    }

}
