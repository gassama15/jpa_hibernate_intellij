package com.groupeisi.repository;

import com.groupeisi.entities.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoleImpl implements IRole {

    protected Session session;
    protected Transaction transaction;

    public RoleImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public int saisie(Role role) {

        try
        {
            transaction = session.beginTransaction();
            session.save(role);
            transaction.commit();

            return 1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return 0;
        }

    }

}
