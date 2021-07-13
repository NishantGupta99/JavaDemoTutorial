package com.company;

import java.util.ArrayList;

public class UserApplication {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("Ram");
        user.setAge(10);
        users.add(user);
        for(int i = 1 ; i<=10 ;i++ ){
            users.add(user);

        }
        System.out.println(users);
    }
}
