package CruddeUsuarios;

public class Usuario extends Pessoa {
    private String Login;
    private String Password;
    private String email;

    public Usuario {
        super
        this.Login = "";
        this.Password = "";
        this.email = "";
    }

    public Usuario(String login, String password, String email) {
        super();
        this.Login = login;
        this.Password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public boolean passwordIsEquals(String password) {
        return password.equals(this.Password);
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = login;
    }
}
