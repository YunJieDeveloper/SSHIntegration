package com.ssh.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionFactroyUtils {
    private static Logger logger = LoggerFactory.getLogger(SessionFactroyUtils.class);
    private static final Configuration cfg = new Configuration();
    private static SessionFactory sessionFactory;
    private static final ThreadLocal threadLocal = new ThreadLocal();

    public  static Session currentSession(){
        Session session = (Session)threadLocal.get();
        if(session == null){
            if(sessionFactory == null){
                try{
                    sessionFactory = cfg.buildSessionFactory();
                }catch(Exception e){
                    logger.error("Error Creating SessionFacotry.");
                    e.printStackTrace();
                }
            }
            session = sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static void cloaseSession() throws Exception{
        Session session = (Session)threadLocal.get();
        threadLocal.set(null);
        if(session != null){
            session.close();
        }
    }
}
