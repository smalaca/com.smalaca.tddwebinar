package com.smalaca.tddwebinar.testssuite.domain;

import org.junit.Test;

import static com.smalaca.tddwebinar.testssuite.domain.Status.ACCEPTED;
import static com.smalaca.tddwebinar.testssuite.domain.Status.DONE;
import static com.smalaca.tddwebinar.testssuite.domain.Status.DRAFT;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.StrictAssertions.fail;

public class StatusTest {
    @Test
    public void shouldAllowToMoveFromDraftToDone() {
        Status result= DRAFT.moveTo(DONE);

        assertThat(result).isEqualTo(DONE);
    }

    @Test
    public void shouldNotAllowForTransitionFromDoneToDraft() {
        try {
            DONE.moveTo(DRAFT);
            fail("Exception should be thrown in case of transition from DONE to DRAFT");
        } catch (UnsupportedTransitionException exception) {
            assertThat(exception.getMessage()).isEqualTo("Transition from DONE to DRAFT is impossible.");
        }
    }

    @Test
    public void shouldAllowToMoveFromDoneToAccepted() {
        Status result= DONE.moveTo(ACCEPTED);

        assertThat(result).isEqualTo(ACCEPTED);
    }

    @Test
    public void shouldNotAllowForTransitionFromAcceptedToDraft() {
        try {
            ACCEPTED.moveTo(DRAFT);
            fail("Exception should be thrown in case of transition from ACCEPTED to DRAFT");
        } catch (UnsupportedTransitionException exception) {
            assertThat(exception.getMessage()).isEqualTo("Transition from ACCEPTED to DRAFT is impossible.");
        }
    }

    @Test
    public void shouldNotAllowForTransitionFromAcceptedToDone() {
        try {
            ACCEPTED.moveTo(DONE);
            fail("Exception should be thrown in case of transition from ACCEPTED to DONE");
        } catch (UnsupportedTransitionException exception) {
            assertThat(exception.getMessage()).isEqualTo("Transition from ACCEPTED to DONE is impossible.");
        }
    }
}