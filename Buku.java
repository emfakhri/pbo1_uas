public class Buku {

    private int id;
    private String judul;
    private String penulis;
    private String jumlah_halaman;
    private String harga;

    public void beli() {
        System.out.println("Ini Method Daftar Beli Buku");
    }

    public void berhasiBayar() {
        System.out.println("Ini Method Berhasil Bayar");
    }

    public void suksesBeli() {
        System.out.println("Ini Method Pembelian Berhasil");
    }

    public void naikkanHarga() {
        String hargaAwal = getHarga();
        double hargaBaru = Double.parseDouble(hargaAwal.substring(3)) + 1000; // Naikkan Rp 1.000
        setHarga("Rp " + String.valueOf(hargaBaru));
        System.out.println("Harga buku " + getJudul() + " dinaikkan menjadi Rp " + getHarga());
    }

    public void naikkanHarga(double kenaikan) {
        String hargaAwal = getHarga();
        double hargaBaru = Double.parseDouble(hargaAwal.substring(3)) + kenaikan;
        setHarga("Rp " + String.valueOf(hargaBaru));
        System.out.println("Harga buku " + getJudul() + " dinaikkan menjadi Rp " + getHarga());
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getJumlah_halaman() {
        return this.jumlah_halaman;
    }

    public String getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlah_halaman(String jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public Buku() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}