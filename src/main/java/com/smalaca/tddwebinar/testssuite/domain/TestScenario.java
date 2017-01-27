package com.smalaca.tddwebinar.testssuite.domain;

import static com.smalaca.tddwebinar.testssuite.domain.Status.ACCEPTED;
import static com.smalaca.tddwebinar.testssuite.domain.Status.DONE;
import static com.smalaca.tddwebinar.testssuite.domain.Status.DRAFT;

public class TestScenario {
    private Status status = DRAFT;

    public boolean isAccepted() {
        return isInStatus(ACCEPTED);
    }

    public boolean isDone() {
        return isInStatus(DONE);
    }

    private boolean isInStatus(Status statusToCompare) {
        return statusToCompare.equals(status);
    }

    void done() {
        moveTo(DONE);
    }

    void accept() {
        moveTo(ACCEPTED);
    }

    private void moveTo(Status transition) {
        status = status.moveTo(transition);
    }
}
