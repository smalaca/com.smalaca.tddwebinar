package com.smalaca.tddwebinar.testssuite.domain;

enum Status {
    DRAFT {
        @Override
        protected boolean isSupported(Status transition) {
            return DONE.equals(transition);
        }
    },
    DONE {
        @Override
        protected boolean isSupported(Status transition) {
            return ACCEPTED.equals(transition);
        }
    },
    ACCEPTED {
        @Override
        protected boolean isSupported(Status transition) {
            return false;
        }
    };

    Status moveTo(Status transition) {
        if (isSupported(transition)) {
            return transition;
        }

        throw new UnsupportedTransitionException("Transition from " + this.name() + " to " + transition.name() + " is impossible.");
    }

    abstract protected boolean isSupported(Status transition);
}
