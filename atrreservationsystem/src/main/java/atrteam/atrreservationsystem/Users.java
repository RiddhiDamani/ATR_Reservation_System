package atrteam.atrreservationsystem;


public class Users {
    private Integer id;
    private String username;
    private String passwordHash;
    private String fname;
    private String lname;
    private String email;

    public void login(String username, String passwordHash) {};

    public Integer register(String username, String passwordHash, String fname, String email, String lname) {};

    public void logout() {};
};
