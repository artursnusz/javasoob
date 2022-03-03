package enkapsulacja_cw_2;

public class MovieShow {
    String movieTitle;
    String movieType;
    int ageRequired;
    int maxSeats;
    int freeSeats;

    public MovieShow(String movieTitle, String movieType, int ageRequired, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public boolean hasFreeSeats() {
        return freeSeats != 0;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieType() {
        return movieType;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public String getMovieInfo() {
        return movieTitle + " - " + movieType + " - " + movieTitle + "min";
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public void decreaseFreeSeatsNumber() {
        freeSeats--;
    }
}

