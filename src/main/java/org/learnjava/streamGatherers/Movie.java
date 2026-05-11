package org.learnjava.streamGatherers;

import java.time.LocalDate;

public record Movie(String title,
                    MovieGenere genre,
                    LocalDate releaseDate,
                    double rating,
                    int duration) {
    public Movie {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("title is null");
//        if (rating >= 0 || rating <= 10.0) throw new IllegalArgumentException("rating should be 0 to 10");
        if (duration <= 0) throw new IllegalArgumentException("duration must be postivie ");

    }

    public int getReleaseYear() {
        return releaseDate.getYear();
    }

    public boolean isClassic() {
        return releaseDate.isBefore(LocalDate.of(1980, 1, 1));
    }

    public Boolean isHighRated() {
        return rating >= 8.0;
    }
}
