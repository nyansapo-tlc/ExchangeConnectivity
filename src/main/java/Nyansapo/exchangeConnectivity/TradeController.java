package Nyansapo.exchangeConnectivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
public class TradeController {

    @Autowired
    private TradeService tradeService;


    @GetMapping("/md")
    public Flux<Trade> getExchange1() {

        Flux<Trade> returnedList = tradeService.getMarketDataFromExchange();
        return returnedList;

    }
}

