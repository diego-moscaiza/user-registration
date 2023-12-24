package User;

/**
 *
 * @author Diego Moscaiza
 */
public class UserModel {
    
    private int id;
    private String name;
    private String surname;
    private int age;
    private String address;
    
    public UserModel(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    
    public void setUserId(int id) {
        this.id = id;
    }
    
    public int setUserId() {
        return id;
    }

    public void setUserName(String name) {
        this.name = name;
    }
    
    public String getUserName() {
        return name;
    }
    
    public void setUserSurname(String surname) {
        this.surname = surname;
    }
    
    public String getUserSurname() {
        return surname;
    }
    
    public void setUserAge(int age) {
        this.age = age;
    }
    
    public int getUserAge() {
        return age;
    }

    public void setUserAddress(String address) {
        this.address = address;
    }
    
    public String getUserAddress() {
        return address;
    }    
}
