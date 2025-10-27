package racingcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNamesParseTest {

    @Test
    void 유효한_이름_목록은_Car_객체_리스트로_변환되어야_한다() {
        String input = "pobi,woni,jun";

        List<Car> cars = CarNamesParse.parse(input);

        assertThat(cars).hasSize(3);
        assertThat(cars.get(0).getCarName()).isEqualTo("pobi");
        assertThat(cars.get(2).getCarName()).isEqualTo("jun");
    }

    @ParameterizedTest
    @ValueSource(strings = {"pobigi,woni", "woni,javaji"})
    void 자동차_이름이_5자_초과시_예외가_발생해야_한다(String input) {
        assertThatThrownBy(() -> CarNamesParse.parse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름이 5글자를 초과합니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "pobi,", ",woni", "pobi,,woni"})
    void 자동차_이름이_없는_경우_예외가_발생해야_한다(String input) {
        assertThatThrownBy(() -> CarNamesParse.parse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름이 입력되지 않았습니다.");
    }
}