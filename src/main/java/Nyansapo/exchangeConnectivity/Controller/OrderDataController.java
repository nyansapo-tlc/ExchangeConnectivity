package Nyansapo.exchangeConnectivity.Controller;

import Nyansapo.exchangeConnectivity.Dao.OrderDataDao;
import Nyansapo.exchangeConnectivity.Entity.OrderData;
import Nyansapo.exchangeConnectivity.Service.OrderDataService;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class OrderDataController {

    private OrderDataService orderDataService = new OrderDataService();

//    private OrderDataDao orderDataDao = new OrderDataDao();

    @RequestMapping(value = "/m", method = RequestMethod.GET)
    public String getAllMarketData1(@RequestBody OrderData order) {
        return OrderDataDao.orderDataList
    }

}
