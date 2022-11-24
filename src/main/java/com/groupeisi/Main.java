package com.groupeisi;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;

public class Main {
    public static void main(String[] args) {
        IRole iRole = new RoleImpl();
        IUser iUser = new UserImpl();

        Role role = new Role();
        role.setId(1);
        role.setNom("ROLE_SUPERADMIN");

        int resultRole = iRole.saisie(role);

        if(resultRole == 1)
            System.out.println("Insertion de Role avec succés.");
        else
            System.out.println("Insertion de Role échouée !!!");

        User user = new User();
        user.setId(1);
        user.setPrenom("Sanoussy");
        user.setNom("GASSAMA");
        user.setEmail("sanoussy.gassama@gmail.com");
        user.setPassword("passer@1");
        user.setEtat(1);

        int resultUser = iUser.saisie(user);

        if(resultUser == 1)
            System.out.println("Insertion de User avec succés.");
        else
            System.out.println("Insertion de User échouée !!!");

    }
}