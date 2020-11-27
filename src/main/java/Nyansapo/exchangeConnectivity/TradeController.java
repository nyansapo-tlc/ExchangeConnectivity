package Nyansapo.exchangeConnectivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin()
@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @GetMapping("/md")
    public Flux<Trade> getMarketDataFromExchange1(@RequestParam String exchangePath) {
        Flux<Trade> returnedList = tradeService.getMarketDataFromExchange();
        return returnedList;
    }
    
    @PostMapping(value="/order")
    public Mono<String> sendOrderToMallonExchange(@RequestBody Order order) {
        return tradeService.sendOrderToExchange(order, order.getExchangePath());
    }
    
}

