package org.exampl.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PropertiesSessionFactoryProvider implements SessionFactoryProvider {


    public PropertiesSessionFactoryProvider() {
    }

    @Override
    public SessionFactory getSessionFactory() {
	return new Configuration().buildSessionFactory();
    }
}
