package com.ssh.handler;

import org.hibernate.Session;

import java.io.Serializable;

public  interface HibernateHandler extends Serializable {
      Object doInHibernate(Session paramSession);
}
