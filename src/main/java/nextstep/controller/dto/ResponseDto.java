package nextstep.controller.dto;

import nextstep.model.RacingCar;

import java.util.List;

public class ResponseDto {
    private boolean success;
    private String message;
    private List<RacingCar> racingCarList;

    public ResponseDto(boolean success, String message, List<RacingCar> racingCarList) {
        this.success = success;
        this.message = message;
        this.racingCarList = racingCarList;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<RacingCar> getRacingCarList() {
        return racingCarList;
    }

    static public class Builder {
        private boolean success;
        private String message;
        private List<RacingCar> racingCarList;

        public Builder() {}

        public Builder(ResponseDto responseDto) {
            this.success = responseDto.success;
            this.message = responseDto.message;
            this.racingCarList = responseDto.racingCarList;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder racingCarList(List<RacingCar> racingCarList) {
            this.racingCarList = racingCarList;
            return this;
        }

        public ResponseDto build() {
            return new ResponseDto(success, message, racingCarList);
        }
    }
}
