package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponCancelled extends AbstractEvent {

    private Long id;
    private Integer buyPoint;
    private String userId;
    private Integer amount;

    public CouponCancelled(Coupon aggregate){
        super(aggregate);
    }
    public CouponCancelled(){
        super();
    }
}
