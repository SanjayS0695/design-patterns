package creationalPattern.prototypePattern;

public class Movie extends Item implements Cloneable{

    private Double runTime;
    private Director director;

    public Double getRunTime() {
        return runTime;
    }

    public void setRunTime(Double runTime) {
        this.runTime = runTime;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }

    public Movie deepClone() throws CloneNotSupportedException{
        Movie movie = (Movie) super.clone();
        movie.setDirector(this.director.clone());
        return movie;
    }
}
