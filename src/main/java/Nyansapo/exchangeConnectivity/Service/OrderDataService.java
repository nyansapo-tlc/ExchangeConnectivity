package Nyansapo.exchangeConnectivity.Service;

import Nyansapo.exchangeConnectivity.Dao.OrderDataDao;
import Nyansapo.exchangeConnectivity.Entity.OrderData;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OrderDataService {

    private OrderDataDao orderDataDao = new OrderDataDao();
    private OrderData orderData = new OrderData();

    String BaseURL = orderDataDao.baseUrl();
    String myURI = "/" + orderDataDao.orderKey() + "/order/";

    // return all MDE
    public String CreateOrder(OrderData order) {
        System.out.println(myURI);
        return  WebClient.builder().baseUrl(BaseURL)
                .build().post()
                .uri(myURI).body(Mono.just(order), OrderData.class).retrieve()
                .bodyToMono(String.class).block();
    }

//    public Flux<OrderData> getAllOrderData2() {
//        return  WebClient.builder().baseUrl("https://exchange2.matraining.com")
//                .build().get()
//                .uri("/orderbook/ /*+ticker+*/ "/open")
//                .accept(MediaType.APPLICATION_JSON)
//                .retrieve()
//                .bodyToFlux(OrderData.class);
//    }


}
