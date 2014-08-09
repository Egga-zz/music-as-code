package de.egga;

/**
 * @author egga
 */
public enum Note {

    C("C", 1),
    CSharp("C#/Db", 2),
    D("D", 3),
    DSharp("D#/Eb", 4),
    E("E", 5),
    F("F", 6),
    FSharp("F#/Gb", 7),
    G("G", 8),
    GSharp("G#/Ab", 9),
    A("A", 10),
    ASharp("A#/Bb", 11),
    B("B", 12);

    private String name;

    private int pitch;


    Note(final String name, final int pitch) {
        this.name = name;
        this.pitch = pitch;
    }

    public String getName() {
        return name;
    }

    public int getPitch() {
        return pitch;
    }
}
