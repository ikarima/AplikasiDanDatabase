package sisteminputnilai;

public class MataKuliah {
    private String kode_mk;
    private String nama_mk;
    private int sks;
    
    public MataKuliah(String kode_mk, String nama_mk, int sks) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.sks = sks;
    }
    
    public String getKodeMk() {
        return kode_mk;
    }
    
    public void setKodeMk(String kode_mk) {
        this.kode_mk = kode_mk;
    }
    
    public String getNamaMk() {
        return nama_mk;
    }
    
    public void setNamaMk(String nama_mk) {
        this.nama_mk = nama_mk;
    }
    
    public int getSks() {
        return sks;
    }
    
    public void setSks(int sks) {
        this.sks = sks;
    }
}
