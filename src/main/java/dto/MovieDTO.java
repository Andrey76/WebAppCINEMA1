package dto;

import model.Entity;

/**
 * Created by andr_ on 18.05.2017.
 */
public class MovieDTO extends Entity<Integer> {
    private String title;
    private String description;
    private int duration;
    private int rent_start;
    private int rent_end;
    private String genre;
    private String rating;
    public MovieDTO(){

    }

    public MovieDTO(String title, String description, int duration, int rent_start, int rent_end, String genre, String rating) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.rent_start = rent_start;
        this.rent_end = rent_end;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", rent_start=" + rent_start +
                ", rent_end=" + rent_end +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
