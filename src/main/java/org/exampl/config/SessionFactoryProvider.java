package org.exampl.config;

import org.hibernate.SessionFactory;

public interface SessionFactoryProvider {

  public SessionFactory getSessionFactory();
}
