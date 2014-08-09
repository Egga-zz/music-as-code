package de.egga;

import java.math.BigInteger;

/**
 * @author egga
 */
public class PlayableNote {

    private Note note;

    private BigInteger octave;

    public PlayableNote(Note note, BigInteger octave) {
        this.note = note;
        this.octave = octave;
    }

    public void play(){

    }
}
