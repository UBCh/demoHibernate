import org.exampl.config.PropertiesSessionFactoryProvider;
import org.exampl.config.SessionFactoryProvider;
import org.exampl.config.XmlSessionFactoryProvider;
import org.hibernate.SessionFactory;

import java.util.Map;

public class main {



    public static void main(String[] args){
        SessionFactoryProvider sessionFactoryProviderXml=new XmlSessionFactoryProvider();
        SessionFactoryProvider sessionFactoryProviderProperty=new PropertiesSessionFactoryProvider();
        SessionFactory sessionFactoryP= sessionFactoryProviderProperty.getSessionFactory();
        SessionFactory sessionFactoryX=sessionFactoryProviderXml.getSessionFactory();
        printResult(sessionFactoryP);
        printResult(sessionFactoryX);
    }


    private static void printResult(SessionFactory sessionFactory){
        for (Map.Entry<String, Object> stringObjectEntry : sessionFactory.getProperties().entrySet()){
            System.out.println(stringObjectEntry.getKey()+ " = " +stringObjectEntry.getValue());
        }
    }

}
