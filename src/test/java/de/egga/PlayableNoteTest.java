package de.egga;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author egga
 */
public class PlayableNoteTest {

    @Test
    public void anAwithOctave10HasPitch130() {
        PlayableNote a = new PlayableNote(Note.A, 10);
        assertThat(a.getPitch(), equalTo(130));
    }
}
