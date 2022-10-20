import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovieDTO {

    @JsonProperty("Response")
    private String Response;
    @JsonProperty("Website")
    private String Website;
    @JsonProperty("Production")
    private String Production;
    @JsonProperty("BoxOffice")
    private String BoxOffice;
    @JsonProperty("DVD")
    private String DVD;
    @JsonProperty("Type")
    private String Type;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("imdbVotes")
    private String imdbVotes;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonProperty("Metascore")
    private String Metascore;
    @JsonProperty("Ratings")
    private List<Ratings> Ratings;
    @JsonProperty("Poster")
    private String Poster;
    @JsonProperty("Awards")
    private String Awards;
    @JsonProperty("Country")
    private String Country;
    @JsonProperty("Language")
    private String Language;
    @JsonProperty("Plot")
    private String Plot;
    @JsonProperty("Actors")
    private String Actors;
    @JsonProperty("Writer")
    private String Writer;
    @JsonProperty("Director")
    private String Director;
    @JsonProperty("Genre")
    private String Genre;
    @JsonProperty("Runtime")
    private String Runtime;
    @JsonProperty("Released")
    private String Released;
    @JsonProperty("Rated")
    private String Rated;
    @JsonProperty("Year")
    private String Year;
    @JsonProperty("Title")
    private String Title;

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getProduction() {
        return Production;
    }

    public void setProduction(String Production) {
        this.Production = Production;
    }

    public String getBoxOffice() {
        return BoxOffice;
    }

    public void setBoxOffice(String BoxOffice) {
        this.BoxOffice = BoxOffice;
    }

    public String getDVD() {
        return DVD;
    }

    public void setDVD(String DVD) {
        this.DVD = DVD;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getMetascore() {
        return Metascore;
    }

    public void setMetascore(String Metascore) {
        this.Metascore = Metascore;
    }

    public List<Ratings> getRatings() {
        return Ratings;
    }

    public void setRatings(List<Ratings> Ratings) {
        this.Ratings = Ratings;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String Poster) {
        this.Poster = Poster;
    }

    public String getAwards() {
        return Awards;
    }

    public void setAwards(String Awards) {
        this.Awards = Awards;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String Plot) {
        this.Plot = Plot;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String Actors) {
        this.Actors = Actors;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String Writer) {
        this.Writer = Writer;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    public String getReleased() {
        return Released;
    }

    public void setReleased(String Released) {
        this.Released = Released;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String Rated) {
        this.Rated = Rated;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
}
