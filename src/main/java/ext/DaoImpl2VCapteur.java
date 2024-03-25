package ext;

import dao.IDao;
import org.springframework.stereotype.Component;


@Component("dao3")
public class DaoImpl2VCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double data=77;
        return data;

    }
}