package org.lab.strategy;//package org.lab.strategy;
//
//import org.lab.singleton.SingletonEager;
//import org.lab.singleton.SingletonLazy;
//import org.lab.singleton.SingletonLazyHolder;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento agressivo = new ComportamentoAgressivo();
//        Comportamento defensivo = new ComportamentoDefensivo();
//
//
//        var robo = new Robo();
//        robo.setComportamento(normal);
//
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(agressivo);
//
//        robo.mover();
//        robo.mover();
//
//        robo.setComportamento(defensivo);
//
//        robo.mover();
//        robo.mover();
//
//    }
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}



public class Main {
    private static final List<User> users = new ArrayList<>();
    static class UserManager {

        private static UserManager userManager = new UserManager();

        private UserManager() {

        }

        public static UserManager getInstance() {
            return userManager;
        }

        public void insert(String name) {
            User user = new User(users.size()+2, name);
            users.add(user);
        }

        public List<User> list() {
            return users;
        }

    }

    private static final UserManager userManager = UserManager.getInstance();

    public static void addUser(String name) {
        userManager.insert(name);
    }

    public static void listUsers() {
        userManager.list().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha após a leitura do número

        for (int i = 1; i <= quantity; i++) {
            String name = scanner.nextLine();
            addUser(name);
        }

        listUsers();
    }
}