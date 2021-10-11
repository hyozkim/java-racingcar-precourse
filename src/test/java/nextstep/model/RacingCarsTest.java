package nextstep.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class RacingCarsTest {

    @ParameterizedTest
    @DisplayName("자동차 입력 최소 2대, 그외 예외처리")
    @CsvSource(value = {"자동차1"})
    void 자동차_입력_최소_2대_이상_예외처리(String name) {
        List<RacingCar> racingCarList = new ArrayList<>();
        racingCarList.add(new RacingCar(name, new Distance()));

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    RacingCars racingCars = new RacingCars(racingCarList);
                }).withMessageMatching("자동차는 2개 이상 입력되어야 합니다.");
    }

    @ParameterizedTest
    @DisplayName("자동차 이름 5자 미만 입력, 그외 예외처리")
    @CsvSource(value = {"람보르기니이","제네시스GV80","BMWX5Series","벤츠S시리즈"})
    void 자동차_이름_5자_이상_입력_예외처리(String name) {
        List<RacingCar> racingCarList = new ArrayList<>();
        racingCarList.add(new RacingCar(name, new Distance()));
        racingCarList.add(new RacingCar(name, new Distance()));

        assertThatExceptionOfType(NoSuchElementException.class)
                .isThrownBy(() -> {
                    RacingCars racingCars = new RacingCars(racingCarList);
                }).withMessageMatching("자동차 이름을 5자 이상 입력할 수 없습니다.");
    }

}