package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PointsUsed extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer amount;

    public PointsUsed(Point aggregate){
        super(aggregate);
    }
    public PointsUsed(){
        super();
    }
}
