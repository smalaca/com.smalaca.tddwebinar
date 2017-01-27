package com.smalaca.tddwebinar.testssuite.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthorTest {
    private static final String SOME_LOGIN = "some_login";
    private static final String DIFFERENT_LOGIN = "different_login";

    @Test
    public void shouldRecognizeTheSameAuthor() {
        Author author = new Author(SOME_LOGIN);
        Author theSameAuthor = new Author(SOME_LOGIN);

        assertThat(author).isEqualTo(theSameAuthor);
    }

    @Test
    public void shouldRecognizeDifferetAuthors() {
        Author author = new Author(SOME_LOGIN);
        Author differentAutor = new Author(DIFFERENT_LOGIN);

        assertThat(author).isNotEqualTo(differentAutor);
    }
}
