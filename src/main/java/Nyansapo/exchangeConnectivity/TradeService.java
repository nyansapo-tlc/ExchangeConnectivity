package Nyansapo.exchangeConnectivity;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


@Service
public class TradeService {
    
    private WebClient webClient = WebClient.builder().baseUrl("https://exchange.matraining.com")
            .defaultHeader("Content-Type", "application/json").build();

    // private WebClient webClient1 = WebClient.builder().baseUrl("https://exchange2.matraining.com")
    //         .defaultHeader("Content-Type", "application/json").build();

    public Flux<Trade> getMarketDataFromExchange(){
        return webClient.get().uri("/md").accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToFlux(Trade.class);
    }

    

}