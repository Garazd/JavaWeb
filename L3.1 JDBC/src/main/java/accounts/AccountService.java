package accounts;

public interface AccountService {
    void singUp(String login, String password);

    boolean singIn(String login, String password);
}