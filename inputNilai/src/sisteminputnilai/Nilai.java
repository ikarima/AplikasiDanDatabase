package sisteminputnilai;

public class Nilai {
    private String kode_skor;
    private String nim;
    private int id_semester;
    private String kode_mk;
    private double skor;

    public Nilai(String kode_skor, String nim, int id_semester, String kode_mk, double skor) {
        this.kode_skor = kode_skor;
        this.nim = nim;
        this.id_semester = id_semester;
        this.kode_mk = kode_mk;
        this.skor = skor;
    }

    public String getKodeSkor() {
        return kode_skor;
    }

    public void setKodeSkor(String kode_skor) {
        this.kode_skor = kode_skor;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getIdSemester() {
        return id_semester;
    }

    public void setIdSemester(int id_semester) {
        this.id_semester = id_semester;
    }

    public String getKodeMk() {
        return kode_mk;
    }

    public void setKodeMk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    public double getSkor() {
        return skor;
    }

    public void setSkor(double skor) {
        this.skor = skor;
    }
}
