import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/users";

        HttpClient httpClient = HttpClient.newHttpClient();

        String result = httpClient
                .send(
                        HttpRequest.newBuilder(URI.create(url)).GET().build(),
                        HttpResponse.BodyHandlers.ofString()
                )
                .body();

        String checkedName = "Mrs. Dennis Schulist";
        System.out.println("Содержит " + checkedName + ": " + result.contains(checkedName));
    }
}