package com.smalaca.tddwebinar.testssuite;

import com.smalaca.tddwebinar.testssuite.domain.Author;
import com.smalaca.tddwebinar.testssuite.domain.TestScenario;

class TestScenarioService {
    private Author existsFor = null;

    boolean existsFor(Author author) {
        return existsFor != null && existsFor.equals(author);
    }

    void add(TestScenario testScenario) {
        existsFor = testScenario.author();
    }
}
