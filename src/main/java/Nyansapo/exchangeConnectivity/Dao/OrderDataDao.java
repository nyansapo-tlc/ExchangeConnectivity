package Nyansapo.exchangeConnectivity.Dao;

import Nyansapo.exchangeConnectivity.Entity.OrderData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDataDao {
    public static List<OrderData> orderDataList;
    OrderData orderData = new OrderData();

    static {
        orderDataList = new ArrayList<OrderData>() {
            {
               new OrderData("IBM", 1000 , 110.0, "BUY");
            }

        };
    }

    public List<OrderData> getAllOrderData() {
        return this.orderDataList;
    }

    public void save (OrderData oderData) {
        if (!this.orderDataList.isEmpty() && this.orderDataList.size() >= 8) {
            this.orderDataList.clear();
        }
        this.orderDataList.add(oderData);


    }

    public String baseUrl () {
        return orderData.getExchange_Path();
    }
    public String orderKey () {
        String key = "bd0f2680-2e42-4b25-9971-7c7c441f07dc";
        return key;
    }
}
