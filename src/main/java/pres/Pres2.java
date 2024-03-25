package pres;

import dao.IDao;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        // DaoImpl2 dao = new DaoImpl2();
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClasseName = scanner.nextLine();
        Class cDao = Class.forName(daoClasseName);
        IDao dao =(IDao)cDao.getConstructor().newInstance(); // => new DaoImp()
        System.out.println(dao.getData());

        //  MetierImpl metier = new MetierImpl();
        String metierClasseName = scanner.nextLine() ;
        Class cMetier = Class.forName(metierClasseName);
        IMetier metier =(IMetier)cMetier.getConstructor().newInstance();


        //   metier.setDao(dao); statique
        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao); // Injection des dépendances dynamique
        System.out.println("RES "+metier.calcul());


    }
}

