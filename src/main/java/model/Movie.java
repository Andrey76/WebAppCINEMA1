package model;

/**
 * Created by andr_ on 18.05.2017.
 */
public class Movie extends Entity<Integer> {
    private String title;
    private String description;
    private Long duration;
    private int rent_start;
    private int rent_end;
    private String genre;
    private String rating;
    public Movie(String title, String description, Long duration, int rent_start, int rent_end, String genre, String rating) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.rent_start = rent_start;
        this.rent_end = rent_end;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        if (rent_start != movie.rent_start) return false;
        if (rent_end != movie.rent_end) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        if (description != null ? !description.equals(movie.description) : movie.description != null) return false;
        if (duration != null ? !duration.equals(movie.duration) : movie.duration != null) return false;
        if (genre != null ? !genre.equals(movie.genre) : movie.genre != null) return false;
        return rating != null ? rating.equals(movie.rating) : movie.rating == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + rent_start;
        result = 31 * result + rent_end;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", rent_start=" + rent_start +
                ", rent_end=" + rent_end +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public int getRent_start() {
        return rent_start;
    }

    public void setRent_start(int rent_start) {
        this.rent_start = rent_start;
    }

    public int getRent_end() {
        return rent_end;
    }

    public void setRent_end(int rent_end) {
        this.rent_end = rent_end;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
