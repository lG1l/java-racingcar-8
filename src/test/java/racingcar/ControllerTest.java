package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ControllerTest {

    private Controller controller;

    @BeforeEach
    void setUp() {
        controller = new Controller();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -100})
    void 음수_입력시_예외가_발생해야_한다(int invalidCount) {
        assertThatThrownBy(() -> controller.checkCount(invalidCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("수행횟수가 음수입니다.");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 100})
    void 양수_또는_0_입력시_예외가_발생하지_않아야_한다(int validCount) {
        assertDoesNotThrow(() -> {
            controller.checkCount(validCount);
        });
    }
}