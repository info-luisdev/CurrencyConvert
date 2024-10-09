package APIs;

import com.google.gson.Gson;
import records.DivisaRecord;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarValorMoneda {

    public DivisaRecord convertirDivisas(String valorDeVenta, String valorDeCompra, double importe) {

        URI url = URI.create("https://v6.exchangerate-api.com/v6/b6fd4882b8fc96809e6b2b2b/pair/" + valorDeVenta + "/" + valorDeCompra + "/" + importe);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DivisaRecord.class);
        } catch (Exception error) {
            throw new RuntimeException("Error de conexión: No se puede establecer una conexión con la API. Inténtalo nuevamente.");
        }
        // HttpResponse<String> response = new
    }

}
