package wallet.domain;

import wallet.domain.BoughtCoupon;
import wallet.CouponApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Coupon_table")
@Data

public class Coupon  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String price;
    
    
    
    
    
    private String userId;

    @PostPersist
    public void onPostPersist(){


        BoughtCoupon boughtCoupon = new BoughtCoupon(this);
        boughtCoupon.publishAfterCommit();

    }

    public static CouponRepository repository(){
        CouponRepository couponRepository = CouponApplication.applicationContext.getBean(CouponRepository.class);
        return couponRepository;
    }






}
