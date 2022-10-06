package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class BoughtCoupon extends AbstractEvent {

    private Long id;
    private String customerId;
    private Integer couponPrice;
    private Integer pointAmount;

    public BoughtCoupon(Coupon aggregate){
        super(aggregate);
    }
    public BoughtCoupon(){
        super();
    }
}
