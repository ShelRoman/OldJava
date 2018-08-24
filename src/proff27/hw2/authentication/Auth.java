package proff27.hw2.authentication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Auth {
    private Map<String, String> users = new HashMap<>();

    public Auth() {
    }

    public boolean authenticate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter login");
        if (scan.hasNext()) {
            String login = scan.next();
            System.out.println("Enter login");
            if (scan.hasNext()) {
                String password = scan.next();
                return authenticate(login, password);
            } else {
                return false;
            }
        } else {
            return false;
        }
     }

    public boolean authenticate(String login, String pass) {
        return users.containsKey(login) && users.get(login).equals(pass);
    }

    public void add(String login, String pass) {
        users.put(login, pass);
    }

    public String getPass(String user) {
        return users.get(user);
    }

    public boolean containsLogin(String login) {
        return users.containsKey(login);
    }

    public void remove(String login) {
        users.remove(login);
    }
}
