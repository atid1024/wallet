package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class BoughtCoupon extends AbstractEvent {

    private Long id;
    private String customerId;
    private Integer couponPrice;
    private Integer pointAmount;
}


