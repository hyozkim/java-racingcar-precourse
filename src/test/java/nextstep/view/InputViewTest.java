package nextstep.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class InputViewTest {
    private InputView inputView;

    @BeforeEach
    void beforeEach() {
        inputView = new InputView();
    }

    @ParameterizedTest
    @DisplayName("숫자만 입력, 그외 예외처리")
    @CsvSource(value = {"12","0123","923"})
    void 숫자_1부터_9까지_입력_그외_예외처리(String turns) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    inputView.checkDigit(turns);
                }).withMessageMatching("[ERROR] 숫자만 입력이 가능합니다.");
    }

    @ParameterizedTest
    @DisplayName("자동차 입력 최소 2대, 그외 예외처리")
    @CsvSource(value = {"1","0"})
    void 자동차_입력_최소_2대_이상_예외처리(String length) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    inputView.checkTotalSize(Integer.parseInt(length));
                }).withMessageMatching("[ERROR] 자동차는 2개 이상 입력되어야 합니다.");
    }

    @ParameterizedTest
    @DisplayName("자동차 이름 5자 미만 입력, 그외 예외처리")
    @CsvSource(value = {"람보르기니이","제네시스GV80","BMWX5Series","벤츠S시리즈"})
    void 자동차_이름_5자_이상_입력_예외처리(String name) {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    inputView.checkStringLength(name);
                }).withMessageMatching("[ERROR] 5자 이상 입력을 할 수 없습니다.");
    }
}