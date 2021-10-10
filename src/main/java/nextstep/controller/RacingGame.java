package nextstep.controller;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCar;
import nextstep.service.RacingService;
import nextstep.view.InputView;

import java.util.List;

import static nextstep.common.Constant.ERROR_MESSAGE_LESS_THAN_5_DIGIT;

public class RacingGame {
    private ResponseDto responseDto;
    private InputView inputView;

    private RacingService racingService;

    public RacingGame() {
        this.inputView = new InputView();
        this.racingService = new RacingService();
    }

    public void start() {
        List<RacingCar> racingCarList = inputView.inputCars();
        int n  = inputView.inputTurns();

        racingService.play(n, racingCarList);

        responseDto = racingService.result(racingCarList);
    }

    public ResponseDto getResponseDto() {
        return responseDto;
    }
}
