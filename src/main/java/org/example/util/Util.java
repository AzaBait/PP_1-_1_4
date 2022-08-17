package org.example.util;

import org.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Util {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        try {
            if (sessionFactory == null) {
                sessionFactory = new Configuration()
                        .setProperty(Environment.DRIVER, "com.mysql.cj.jdbc.Driver")
                        .setProperty(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect")
                        .setProperty(Environment.URL, "jdbc:mysql://localhost:3306/kata")
                        .setProperty(Environment.USER, "root")
                        .setProperty(Environment.PASS, "ormonhan8687")
                        .setProperty(Environment.HBM2DDL_AUTO, "update")
                        .setProperty(Environment.SHOW_SQL, "true")
                        .addAnnotatedClass(User.class)
                        .buildSessionFactory();

            }
        }catch (Exception h){
            h.printStackTrace();
        }
        return sessionFactory;
    }
}
