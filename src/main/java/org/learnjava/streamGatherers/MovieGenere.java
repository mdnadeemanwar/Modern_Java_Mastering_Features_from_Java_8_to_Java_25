package org.learnjava.streamGatherers;

public enum MovieGenere {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    SCIENCE_FICTION("Science Fiction"),
    THRILLER("Thriller"),
    DOCUMENTARY("Documentary"),
    ANIMATION("Animation"),
    FANTASY("Fantasy");

    private final String displayName;
    MovieGenere(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }

}
