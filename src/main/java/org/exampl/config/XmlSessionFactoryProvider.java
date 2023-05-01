package org.exampl.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XmlSessionFactoryProvider implements SessionFactoryProvider{

    public XmlSessionFactoryProvider() {
    }

    @Override
    public SessionFactory getSessionFactory() {
	return new Configuration().configure().buildSessionFactory();
    }
}
