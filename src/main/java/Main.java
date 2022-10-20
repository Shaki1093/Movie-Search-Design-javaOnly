import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    /*Future Updates will be more on swing to make it more presentable
    * for now the code runs normally without the GUI part of it
    * here are the steps for the next updates
    * 1. Implement more data on the search that way the user can see other different releases from the same title
    * 2. Master the GUI portion of it. That way the user can see other reference from that they are looking
    * 3. Might have to rework on the query link so i can work on the data part of it
    * 4. possibly add a function that can save a save search txt as a way to save the user searches
    * and there more
    *
    * As of now please ignore buttomFrame, Frame and searchBoxFrame they are there for practices purposes they don't
    * contribute anything with the main app for now */

    public static void main(String[] args) throws JsonProcessingException {
        API_URL.searchURL();
    }

}
