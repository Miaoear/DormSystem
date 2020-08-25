package cn.edu.guet.model;


public class User {

    private String userId;
    private String username;
    private String password;
    private String sex;
    private String dorno;
    private String phone;
    //private List<Role> roles;
    //private List<User> users;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDorno() {
        return dorno;
    }

    public void setDorno(String dorno) {
        this.dorno = dorno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
