package de.egga;

/**
 * @author egga
 */
public enum Note {
    C("Do", 1),
    D("Re", 2),
    E("Mi", 3),
    F("Fa", 4),
    G("Sol", 5),
    A("La", 6),
    B("Ti", 7);


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
