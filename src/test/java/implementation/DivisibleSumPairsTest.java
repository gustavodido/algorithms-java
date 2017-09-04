package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DivisibleSumPairsTest extends InOutTest {
    private DivisibleSumPairs exercise = new DivisibleSumPairs();

    private static final String INPUT_SAMPLE0 = "6 3\n" +
            "1 3 2 6 1 2\n";

    private static final String OUTPUT_SAMPLE0 = "5\n";

    private static final String INPUT_CASE7 = "100 66\n" +
            "50 44 77 66 70 58 9 59 74 82 87 15 10 95 10 81 2 4 87 85 28 96 76 18 86 91 94 59 19 58 98 48 38 70 36 38 66 9 72 54 23 23 17 18 8 16 9 56 12 59 73 31 10 62 83 84 28 91 29 22 73 22 3 75 26 31 93 57 15 32 46 74 99 10 15 58 60 53 41 49 71 59 4 20 38 78 1 94 76 5 70 68 42 34 77 28 19 25 20 15\n";

    private static final String OUTPUT_CASE7 = "69\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForTestCase7() {
        input(INPUT_CASE7);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_CASE7);
    }
}