package sisteminputnilai;

public class Semester {
    private int id_semester;
    private String nama_semester;
    
    public Semester(int id_semester, String nama_semester) {
        this.id_semester = id_semester;
        this.nama_semester = nama_semester;
    }
    
    public int getIdSemester() {
        return id_semester;
    }
    
    public void setIdSemester(int id_semester) {
        this.id_semester = id_semester;
    }
    
    public String getNamaSemester() {
        return nama_semester;
    }
    
    public void setNamaSemester(String nama_semester) {
        this.nama_semester = nama_semester;
    }
}
