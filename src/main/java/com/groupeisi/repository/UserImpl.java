package com.groupeisi.repository;

import com.groupeisi.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserImpl implements IUser{

    protected Session session;
    protected Transaction transaction;

    public UserImpl() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public int saisie(User user) {
        try
        {
            transaction = session.beginTransaction();
            session.save(user);
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
