package Nyansapo.exchangeConnectivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping("/md")
    public Flux<Trade> getMarketDataFromExchange1() {
        Flux<Trade> returnedList = tradeService.getMarketDataFromExchange();
        return returnedList;
    }
    
    @PostMapping(value="/order")
    public Mono<String> sendOrderToExchange(@RequestBody Order order) {
        return tradeService.sendOrderToExchange(order);
    }
    
}

