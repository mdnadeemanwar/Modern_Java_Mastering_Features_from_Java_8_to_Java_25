package org.learnjava.streamGatherers;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Gatherer;

import static java.util.stream.Gatherers.windowFixed;
import static java.util.stream.Gatherers.windowSliding;

public class StreamGatherersExample {
    private static List<Movie> createSampleMovies() {

        return List.of(

                new Movie(
                        "Casablanca",
                        MovieGenere.ROMANCE,
                        LocalDate.of(1942, 11, 26),
                        8.5,
                        102
                ),

                new Movie(
                        "Citizen Kane",
                        MovieGenere.DRAMA,
                        LocalDate.of(1941, 5, 1),
                        8.3,
                        119
                ),

                new Movie(
                        "The Godfather",
                        MovieGenere.DRAMA,
                        LocalDate.of(1972, 3, 24),
                        9.2,
                        175
                ),

                new Movie(
                        "Star Wars",
                        MovieGenere.SCIENCE_FICTION,
                        LocalDate.of(1977, 5, 25),
                        8.6,
                        121
                ),

                new Movie(
                        "The Shawshank Redemption",
                        MovieGenere.DRAMA,
                        LocalDate.of(1994, 9, 23),
                        9.3,
                        142
                ),

                new Movie(
                        "Pulp Fiction",
                        MovieGenere.ACTION,
                        LocalDate.of(1994, 10, 14),
                        8.9,
                        154
                ),

                new Movie(
                        "Titanic",
                        MovieGenere.ROMANCE,
                        LocalDate.of(1997, 12, 19),
                        8.4,
                        195
                ),

                new Movie(
                        "The Matrix",
                        MovieGenere.SCIENCE_FICTION,
                        LocalDate.of(1999, 3, 31),
                        8.7,
                        136
                ),

                new Movie(
                        "Gladiator",
                        MovieGenere.ACTION,
                        LocalDate.of(2000, 5, 5),
                        8.5,
                        155
                ),

                new Movie(
                        "The Dark Knight",
                        MovieGenere.ACTION,
                        LocalDate.of(2008, 7, 18),
                        9.0,
                        152
                ),

                new Movie(
                        "Inception",
                        MovieGenere.SCIENCE_FICTION,
                        LocalDate.of(2010, 7, 16),
                        8.8,
                        148
                ),

                new Movie(
                        "Interstellar",
                        MovieGenere.SCIENCE_FICTION,
                        LocalDate.of(2014, 11, 7),
                        8.7,
                        169
                )
        );
    }


    /*
    first Example of window fixed
     */
    private static void demonstrateWindowFixedFunction(List<Movie> movies) {
        movies.stream().gather(windowFixed(3)) // this is intermediate funciton with fixed widnow size
                .forEach(window -> {
                    System.out.println("window");
                    window.forEach(movie -> {
                        System.out.println(" - " + movie.title() + " (" + movie.getReleaseYear() + ")");
                    });
                });
    }

    /*
    window sliding example
     */
    private static void demonstrateWindowSlidingFunction(List<Movie> movies) {
        System.out.println("Sliding Window");
        movies.stream()
                .limit(5)
                .gather(windowSliding(2))
                .forEach(window->{
                    System.out.println("window sliding");
                    window.forEach(movie -> {
                        System.out.println(" - " + movie.title() + " (" + movie.getReleaseYear() + ")");
                    });
                });

    }

    public static void main(String[] args) {

        System.out.println("Creating StreamGatherersExample");

        List<Movie> movies = createSampleMovies();

        System.out.println("Sample Movie");
        movies.forEach(System.out::println);


        demonstrateWindowFixedFunction(movies);

        demonstrateWindowSlidingFunction(movies);
    }
}
