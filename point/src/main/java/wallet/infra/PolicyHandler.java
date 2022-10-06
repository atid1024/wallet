package wallet.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import wallet.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import wallet.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired PointRepository pointRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='BoughtCoupon'")
    public void wheneverBoughtCoupon_PointDeduction(@Payload BoughtCoupon boughtCoupon){

        BoughtCoupon event = boughtCoupon;
        System.out.println("\n\n##### listener PointDeduction : " + boughtCoupon + "\n\n");


        

        // Sample Logic //
        Point.pointDeduction(event);
        

        

    }

}


