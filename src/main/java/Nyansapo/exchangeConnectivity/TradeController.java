package Nyansapo.exchangeConnectivity;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Hashtable;
import java.util.Map;

@RestController
public class TradeController {
    Map<String, Flux<Trade>> exchanges = new Hashtable<>();
    WebClient webClient = WebClient.builder().baseUrl("https://exchange.matraining.com")
            .defaultHeader("Content-Type", "application/json").build();

    WebClient webClient1 = WebClient.builder().baseUrl("https://exchange2.matraining.com")
            .defaultHeader("Content-Type", "application/json").build();


    @GetMapping("/md")
    public Flux<Trade> getExchange1() {

        Flux<Trade> returnedList =
                webClient.get().uri("/md").accept(MediaType.APPLICATION_JSON)
                        .retrieve().bodyToFlux(Trade.class);

        exchanges.put("Exchange1", returnedList);

        return returnedList;

    }

    public Flux<Trade> getExchange2() {
        Flux<Trade> returnedList1 =
                webClient1.get().uri("/md").accept(MediaType.APPLICATION_JSON)
                        .retrieve().bodyToFlux(Trade.class);
        exchanges.put("Exchange2", returnedList1);

        return returnedList1;

    }
}

