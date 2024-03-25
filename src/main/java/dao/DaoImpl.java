package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de données");
        double data=34 ;
        return data;
    }

}
