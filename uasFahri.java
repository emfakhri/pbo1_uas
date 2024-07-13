public class uasFahri {

    private int id;
    private String nama;
    private String npm;
    private String kelas;

    public void lulus() {
        System.out.println("Ini Method Lulus Kuliah");
    }

    public int getId() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNpm() {
        return this.npm;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public uasFahri() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}
