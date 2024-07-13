class Komik extends Buku {

    private int volume;

    public Komik(int id, String judul, String penulis, String jumlah_halaman, String harga, int volume) {
        // super(id, judul, penulis, jumlah_halaman, harga);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void bacaKomik() {
        System.out.println("Membaca Komik " + getJudul() + " Volume " + getVolume());
    }

    public void naikkanHarga() {
        String hargaAwal = getHarga();
        double hargaBaru = Double.parseDouble(hargaAwal.substring(3)) + 2500;
        setHarga("Rp " + String.valueOf(hargaBaru));
        System.out.println("Harga komik " + getJudul() + " dinaikkan menjadi Rp " + getHarga());
    }
}