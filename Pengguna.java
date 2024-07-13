public class Pengguna {

    private int id;
    private String username;
    private String password;

    public void login() {
        System.out.println("Ini Method Daftar User Login");
    }

    public void lupaPassword() {
        System.out.println("Ini Method Lupa Password");
    }

    public void daftar() {
        System.out.println("Ini Method Daftar User Baru");
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pengguna() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }

}
