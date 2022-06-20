public class Barang {
    private String kode;
    private int stok;
    private int nextNum;
    private String nama;
    private long harga;

    Barang(String kode, int stok, long harga){
        this.kode = kode;
        this.stok = stok;
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public long getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }
}
