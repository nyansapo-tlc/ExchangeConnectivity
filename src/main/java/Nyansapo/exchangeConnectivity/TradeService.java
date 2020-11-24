package Nyansapo.exchangeConnectivity;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class TradeService {

    private final String API_KEY = "bd0f2680-2e42-4b25-9971-7c7c441f07dc";
    
    private WebClient webClient = WebClient.builder().baseUrl("https://exchange.matraining.com")
            .defaultHeader("Content-Type", "application/json").build();

    // private WebClient webClient1 = WebClient.builder().baseUrl("https://exchange2.matraining.com")
    //         .defaultHeader("Content-Type", "application/json").build();

    public Flux<Trade> getMarketDataFromExchange(){
        return webClient.get().uri("/md").accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToFlux(Trade.class);
    }

    public Mono<String> sendOrderToExchange(Order order){
        return webClient.post().uri("/" + API_KEY + "/order")
        .accept(MediaType.APPLICATION_JSON)
        .body(Mono.just(order), Order.class)
        .retrieve().bodyToMono(String.class);
    }

}