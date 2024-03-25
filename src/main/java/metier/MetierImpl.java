package metier;



import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    private final IDao dao; // Utilisation de final pour garantir l'immuabilité

    @Autowired // Injection automatique de dépendances par Spring
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double d = dao.getData();
        double res = d * 11.4 ;
        return res;
    }

    // Méthode setter pour l'injection de dépendances (non nécessaire si vous utilisez le constructeur)
    /*@Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }*/

    // Si vous avez besoin d'une initialisation par défaut, vous pouvez la faire dans le constructeur
    /*public MetierImpl() {
        this.dao = null; // Initialisation par défaut
    }*/
}

