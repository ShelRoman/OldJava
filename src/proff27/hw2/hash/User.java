package proff27.hw2.hash;


public class User {
    private String login;
    private String password;
    private String registrationDate;
    private double rating;
    private boolean sex;

    public User() {
        login = "Login";
        password = "PassWord";
        registrationDate = "11.09.2015";
        rating = 3.33;
        sex = true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        User user = (User)obj;
        return user.sex == this.sex
                && Double.compare(user.rating, this.rating) == 0
                && user.login.equals(this.login)
                && user.password.equals(this.password)
                && user.registrationDate.equals(this.registrationDate);
    }

    @Override
    public int hashCode() {
        int rating = 31 * (int)Double.doubleToLongBits(this.rating);
        int login = 31 * this.login.hashCode();
        int password = 31 * this.password.hashCode();
        int registrationDate = 31 * this.registrationDate.hashCode();
        int sex = this.sex ? 1 : 0;
        return 31 * (rating + login + password + registrationDate + sex);
    }

}
