package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

interface Searchable {
    boolean searchByKeyword(String keyword);
}

abstract class MediaItem implements Searchable {

    private String title;
    private String releaseDate;
    private double rating;

    public MediaItem(String title, String releaseDate, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }
}

class Movie extends MediaItem {

    private String director;
    private List<String> cast;
    private int duration;

    public Movie(String title, String releaseDate, double rating,
                 String director, List<String> cast, int duration) {

        super(title, releaseDate, rating);
        this.director = director;
        this.cast = cast;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public List<String> getCast() {
        return cast;
    }

    public boolean searchByKeyword(String keyword) {

        keyword = keyword.toLowerCase();

        if (getTitle().toLowerCase().contains(keyword))
            return true;

        if (director.toLowerCase().contains(keyword))
            return true;

        for (String actor : cast) {
            if (actor.toLowerCase().contains(keyword))
                return true;
        }

        return false;
    }
}

public class MovieLibraryManagementSystem {

    public static void sortByAttribute(List<Movie> movieList, String attribute, String order) {

        Collections.sort(movieList, new Comparator<Movie>() {

            public int compare(Movie m1, Movie m2) {

                int result = 0;

                if (attribute.equalsIgnoreCase("title")) {
                    result = m1.getTitle().compareToIgnoreCase(m2.getTitle());
                } 
                else if (attribute.equalsIgnoreCase("releaseDate")) {
                    result = m1.getReleaseDate().compareToIgnoreCase(m2.getReleaseDate());
                } 
                else if (attribute.equalsIgnoreCase("director")) {
                    result = m1.getDirector().compareToIgnoreCase(m2.getDirector());
                } 
                else if (attribute.equalsIgnoreCase("duration")) {
                    result = m1.getDuration() - m2.getDuration();
                }

                if (order.equalsIgnoreCase("desc")) {
                    result = -result;
                }

                return result;
            }
        });
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();

        int numberOfMovies = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfMovies; i++) {

            String title = scanner.nextLine();
            String releaseDate = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            String director = scanner.nextLine();
            int duration = Integer.parseInt(scanner.nextLine());

            List<String> cast = new ArrayList<>(
                    Arrays.asList(scanner.nextLine().split(",\\s*"))
            );

            movieList.add(new Movie(title, releaseDate, rating, director, cast, duration));
        }

        String sortAttribute = scanner.nextLine();
        String sortOrder = scanner.nextLine();
        String searchKeyword = scanner.nextLine();

        for (Movie movie : movieList) {
            if (movie.searchByKeyword(searchKeyword)) {
                System.out.println(movie.getTitle());
            }
        }

        sortByAttribute(movieList, sortAttribute, sortOrder);

        for (Movie movie : movieList) {
            System.out.println(movie.getTitle());
        }

        scanner.close();
    }
}

