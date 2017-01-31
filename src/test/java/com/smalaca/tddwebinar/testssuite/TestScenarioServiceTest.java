package com.smalaca.tddwebinar.testssuite;

import com.smalaca.tddwebinar.testssuite.domain.Author;
import com.smalaca.tddwebinar.testssuite.domain.TestScenario;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestScenarioServiceTest {
    private static final Author SOME_AUTHOR = new Author("smalaca");
    private static final Author DIFFERENT_AUTHOR = new Author("malacas");
    private final TestScenarioService service = new TestScenarioService();

    @Test
    public void shouldRecognizeIfNoTestScenariosForGivenAuthor() {
        boolean result = service.existsFor(SOME_AUTHOR);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldRecognizeIfTestScenariosExistForGivenAuthor() {
        service.add(givenTestScenarioWrittenBy(SOME_AUTHOR));

        boolean result = service.existsFor(SOME_AUTHOR);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldRecognizeIfTestScenarioExistForDifferentAuthor() {
        service.add(givenTestScenarioWrittenBy(SOME_AUTHOR));

        boolean result = service.existsFor(DIFFERENT_AUTHOR);

        assertThat(result).isFalse();
    }

    private TestScenario givenTestScenarioWrittenBy(Author author) {
        return new TestScenario(author);
    }
}
