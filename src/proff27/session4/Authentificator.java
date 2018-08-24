package proff27.session4;
// create method which make user authentification if as arguments String login, String paswword
//

import java.util.HashMap;
import java.util.Map;

public class Authentificator {
    private Map<String, String> users = new HashMap<>();

    public Authentificator() {

    }

    public String putUser(String login, String password) {
        return users.put(login, password);
    }

    public boolean containsUser(String login) {
        return users.containsKey(login);
    }

    public boolean auth(String login, String password) {
        return users.containsKey(login) && users.get(login).equals(password);
    }
}
