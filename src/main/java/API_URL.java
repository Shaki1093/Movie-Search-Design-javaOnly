import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class API_URL {
    static final String SEARCH_URL = "https://www.omdbapi.com/?apikey=eeddffc2";
    public static String sendGET(String SEARCH_URL) {
        //** Start of GET request algorithm
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create(SEARCH_URL);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();
        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body();
            } else {
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public static void searchURL() throws JsonProcessingException {
        //This area is for the user prompt
        Scanner scanner = new Scanner(System.in);

        //Variable
        String searchString;
        String plot;
        String jsonString = "";
        String queryString;
        String queryString1;
        String responseString;

        //This will be a Movies, Series and Episode Searcher
        //Here will recreate the URL adding the search through title and if the user want a shor or full plot
            System.out.println("Enter a Movie, series, episode title: ");
            searchString = scanner.nextLine();
            System.out.println("Plot short or full? ");
            plot = scanner.nextLine();


            queryString = "&t=" + searchString.replace(" ", "+");
            queryString1 = "&plot=" + plot.replace(" ", "+");
            System.out.println(queryString);

            //By Calling the HTTP GET request will help me so manipulate the URL so the user get the Search that is needed
            responseString = sendGET(SEARCH_URL + queryString + queryString1);
            System.out.println(SEARCH_URL + queryString + queryString1);

            //Adding a read Value to it that way the program print what is necessarily for the user to know
            ObjectMapper objectMapper = new ObjectMapper();
            MovieDTO movieListDTO = new MovieDTO();
            movieListDTO = objectMapper.readValue(responseString, MovieDTO.class);

            jsonString = "Title: " + movieListDTO.getTitle() + "\n" + "Release Date: " + movieListDTO.getReleased() +
                    "\n" + "Genre: " + movieListDTO.getGenre() + "\n" + "Plot: " + movieListDTO.getPlot();

            System.out.println(jsonString);
    }
}
