package com.smalaca.tddwebinar.testssuite.domain;

public class Author {
    private final String login;

    public Author(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return login.equals(author.login);
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }
}
