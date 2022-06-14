
package com.company.main;

import com.company.dao.inter.UserDaoInter;


public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter dao = Context.instanceUserDao();
        
    }
}

