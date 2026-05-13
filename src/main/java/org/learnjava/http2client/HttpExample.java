package org.learnjava.http2client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class HttpExample {

    /*
    first create a http client here
     */

    static HttpClient httpClient = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(2))
            .version(HttpClient.Version.HTTP_2).build();
    public static String jsonsampleApi = "https://jsonplaceholder.typicode.com/todos";
    public static String jsonsampleApiByid = "https://jsonplaceholder.typicode.com/todos/1";
    static ObjectMapper mapper = new ObjectMapper();

    public static UserDetails getUserDetailsById() throws IOException, InterruptedException {

        var request = requestBuilder(HttpExample.jsonsampleApiByid);
        try {
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response of api is " + response.body());
            return mapper.readValue(
                    response.body(),
                    UserDetails.class
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static CompletableFuture<UserDetails> getUserDetailsByIdAsync() throws IOException, InterruptedException {

        var request = requestBuilder(HttpExample.jsonsampleApiByid);
        try {
            var response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

            return response.thenApply(httpResponse -> {
                System.out.println("Response of api is " + httpResponse.body());
                try {
                    return mapper.readValue(
                            httpResponse.body(),
                            UserDetails.class
                    );
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static HttpRequest requestBuilder(String url) {
        return HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
//        getUserDetailsById();
        getUserDetailsByIdAsync();
    }
}
