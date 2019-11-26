package per.vastzhang.MySpringBootShiroDemo.bean;

import java.util.List;

public class User {
    private String username;
    private String password;
    private Boolean available;
    private String role;
    private List<String> permissions;

    public User(String username, String password, Boolean available, String role, List<String> permissions) {
        this.username = username;
        this.password = password;
        this.available = available;
        this.role = role;
        this.permissions = permissions;
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

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
}