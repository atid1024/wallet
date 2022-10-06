package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PointIncreased extends AbstractEvent {

    private Long id;

    public PointIncreased(Point aggregate){
        super(aggregate);
    }
    public PointIncreased(){
        super();
    }
}
