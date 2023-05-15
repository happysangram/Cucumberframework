package Objects;

public class DtableObject {

private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DtableObject(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    private String password;
}
