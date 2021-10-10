package nextstep.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class InputViewTest {

    @ParameterizedTest
    @DisplayName("숫자만 입력, 그외 예외처리")
    @CsvSource(value = {"1l","l123","1o38729"})
    void 숫자만_입력_그외_예외처리(String turns) {
        InputView inputView = new InputView();

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    inputView.checkDigit(turns);
                }).withMessageMatching("숫자만 입력이 가능합니다.");
    }

    @ParameterizedTest
    @DisplayName("자동차 입력 최소 2대, 그외 예외처리")
    @CsvSource(value = {"1","0"})
    void 자동차_입력_최소_2대_이상_예외처리(String length) {
        InputView inputView = new InputView();

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    inputView.checkTotalSize(Integer.parseInt(length));
                }).withMessageMatching("자동차는 2개 이상 입력되어야 합니다.");
    }

    @ParameterizedTest
    @DisplayName("자동차 이름 5자 미만 입력, 그외 예외처리")
    @CsvSource(value = {"람보르기니이","제네시스GV80","BMWX5Series","벤츠S시리즈"})
    void 자동차_이름_5자_이상_입력_예외처리(String name) {
        InputView inputView = new InputView();

        assertThatExceptionOfType(NoSuchElementException.class)
                .isThrownBy(() -> {
                    inputView.checkStringLength(name);
                }).withMessageMatching("자동차 이름을 5자 이상 입력할 수 없습니다.");
    }
}