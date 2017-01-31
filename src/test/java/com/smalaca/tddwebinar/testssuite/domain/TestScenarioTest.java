package com.smalaca.tddwebinar.testssuite.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestScenarioTest {
    private static final Author DUMMY_AUTHOR = null;

    private final TestScenario scenario = new TestScenario(DUMMY_AUTHOR);

    @Test
    public void shouldRecognizeIfIsNotDone() {
        boolean result = scenario.isDone();

        assertThat(result).isFalse();
    }

    @Test
    public void shouldRecognizeIfIsDone() {
        scenario.done();

        boolean result = scenario.isDone();

        assertThat(result).isTrue();
    }

    @Test
    public void shouldRecognizeIfIsNotAccepted() {
        boolean result = scenario.isAccepted();

        assertThat(result).isFalse();
    }

    @Test
    public void shouldRecognizeIfIsAccepted() {
        scenario.done();
        scenario.accept();

        boolean result = scenario.isAccepted();

        assertThat(result).isTrue();
    }

    @Test(expected = UnsupportedTransitionException.class)
    public void shouldThrowExceptionInCaseOfTransitionFromAcceptedToDone() {
        scenario.accept();
        scenario.done();
    }
}