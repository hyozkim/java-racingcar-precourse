package nextstep.controller.dto;

import nextstep.model.RacingCars;

public class ResponseDto {
    private String winners;
    private RacingCars racingCars;

    public ResponseDto(String winners, RacingCars racingCars) {
        this.winners = winners;
        this.racingCars = racingCars;
    }

    public String getWinners() {
        return winners;
    }

    public RacingCars getRacingCars() {
        return racingCars;
    }

    static public class Builder {
        private String winners;
        private RacingCars racingCars;

        public Builder() {}

        public Builder(ResponseDto responseDto) {
            this.winners = responseDto.winners;
            this.racingCars = responseDto.racingCars;
        }

        public Builder winners(String winners) {
            this.winners = winners;
            return this;
        }

        public Builder racingCarList(RacingCars racingCars) {
            this.racingCars = racingCars;
            return this;
        }

        public ResponseDto build() {
            return new ResponseDto(winners, racingCars);
        }
    }
}
