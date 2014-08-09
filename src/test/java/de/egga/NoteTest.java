package de.egga;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * @author egga
 */
public class NoteTest {

    @Test
    public void aShouldHaveTheNameLa() {
        assertThat(Note.A.getName(), is(equalTo("A")));
    }

    @Test
    public void aShouldHaveThePitchSix() {
        assertThat(Note.A.getPitch(), is(equalTo(10)));
    }

    @Test
    public void thereAreTwelveNotes() {
        assertThat(Note.values().length, equalTo(12));
}
}