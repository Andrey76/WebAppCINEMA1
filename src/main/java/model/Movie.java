package model;

import java.sql.Date;

/**
 * Created by andr_ on 18.05.2017.
 */
public class Movie extends Entity<Integer> {
    private String title;
    private String description;
    private Long duration;
    private Date rent_start;
    private Date rent_end;
    private String genre;
    private String rating;
    private String pict_url;

    public String getTreiler_url() {
        return treiler_url;
    }

    public void setTreiler_url(String treiler_url) {
        this.treiler_url = treiler_url;
    }

    private String treiler_url;

    public Movie(String title,
                 String description,
                 Long duration,
                 Date rent_start,
                 Date rent_end,
                 String genre,
                 String rating,
                 String pict_url,
                 String treiler_url) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.rent_start = rent_start;
        this.rent_end = rent_end;
        this.genre = genre;
        this.rating = rating;
        this.pict_url = pict_url;
        this.treiler_url = treiler_url;
    }

    public Movie() {
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

    public Date getRent_start() {
        return rent_start;
    }

    public void setRent_start(Date rent_start) {
        this.rent_start = rent_start;
    }

    public Date getRent_end() {
        return rent_end;
    }

    public void setRent_end(Date rent_end) {
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

    public String getPict_url() { return pict_url;}

    public void setPict_url(String pict_url) { this.pict_url = pict_url;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Movie movie = (Movie) o;

        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        if (description != null ? !description.equals(movie.description) : movie.description != null) return false;
        if (duration != null ? !duration.equals(movie.duration) : movie.duration != null) return false;
        if (rent_start != null ? !rent_start.equals(movie.rent_start) : movie.rent_start != null) return false;
        if (rent_end != null ? !rent_end.equals(movie.rent_end) : movie.rent_end != null) return false;
        if (genre != null ? !genre.equals(movie.genre) : movie.genre != null) return false;
        if (rating != null ? !rating.equals(movie.rating) : movie.rating != null) return false;
        if (pict_url != null ? !pict_url.equals(movie.pict_url) : movie.pict_url != null) return false;
        return treiler_url != null ? treiler_url.equals(movie.treiler_url) : movie.treiler_url == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (rent_start != null ? rent_start.hashCode() : 0);
        result = 31 * result + (rent_end != null ? rent_end.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (pict_url != null ? pict_url.hashCode() : 0);
        result = 31 * result + (treiler_url != null ? treiler_url.hashCode() : 0);
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
                ", pict_url='" + pict_url + '\'' +
                ", treiler_url='" + treiler_url + '\'' +
                '}';
    }
}
