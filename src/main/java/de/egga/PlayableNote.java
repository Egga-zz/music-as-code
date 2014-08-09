package de.egga;

/**
 * @author egga
 */
public class PlayableNote {

    private Note note;

    private int octave;

    public PlayableNote(Note note, int octave) {
        this.note = note;
        this.octave = octave;
    }

    public int getPitch(){
        //A: basePitch = 10
        //A: octavePitch = 10 + (12 * octave)
        return note.getBasePitch() + Note.values().length * octave;
    }
}
