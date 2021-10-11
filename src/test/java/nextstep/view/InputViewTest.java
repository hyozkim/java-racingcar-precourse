package nextstep.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
}