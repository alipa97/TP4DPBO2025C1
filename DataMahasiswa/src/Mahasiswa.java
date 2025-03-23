public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String hobi;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String hobi) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.hobi = hobi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getHobi() {
        return this.hobi;
    }
}
