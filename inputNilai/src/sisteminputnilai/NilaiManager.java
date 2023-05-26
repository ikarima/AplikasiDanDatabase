package sisteminputnilai;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NilaiManager {
    private Connection connection;
    
    public NilaiManager(Connection connection) {
        this.connection = connection;
    }
    
    public void insertNilai(Nilai nilai) {
        try {
            String query = "INSERT INTO nilai (kode_skor, nim, id_semester, kode_mk, skor) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nilai.getKodeSkor());
            statement.setString(2, nilai.getNim());
            statement.setInt(3, nilai.getIdSemester());
            statement.setString(4, nilai.getKodeMk());
            statement.setDouble(5, nilai.getSkor());
            
            statement.executeUpdate();
            System.out.println("Nilai inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateNilai(Nilai nilai) {
        try {
            String query = "UPDATE nilai SET skor = ? WHERE kode_skor = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDouble(1, nilai.getSkor());
            statement.setString(2, nilai.getKodeSkor());
            
            statement.executeUpdate();
            System.out.println("Nilai updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteNilai(String kode_skor) {
        try {
            String query = "DELETE FROM nilai WHERE kode_skor = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, kode_skor);
            
            statement.executeUpdate();
            System.out.println("Nilai deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Nilai> getAllNilai() {
        List<Nilai> nilaiList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM nilai";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                String kode_skor = resultSet.getString("kode_skor");
                String nim = resultSet.getString("nim");
                int id_semester = resultSet.getInt("id_semester");
                String kode_mk = resultSet.getString("kode_mk");
                double skor = resultSet.getDouble("skor");
                
                Nilai nilai = new Nilai(kode_skor, nim, id_semester, kode_mk, skor);
                nilaiList.add(nilai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return nilaiList;
    }
    
    public double calculateAverageScore(String nim) {
        double average = 0;
        int count = 0;
        
        try {
            String query = "SELECT skor FROM nilai WHERE nim = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nim);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                double skor = resultSet.getDouble("skor");
                average += skor;
                count++;
            }
            
            if (count > 0) {
                average /= count;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return average;
    }
    
    public String getKodeSkor(Nilai nilai) {
        return nilai.getKodeSkor();
    }
    
    public int getIdSemester(Nilai nilai) {
        return nilai.getIdSemester();
    }
    
    public String getKodeMk(Nilai nilai) {
        return nilai.getKodeMk();
    }
    
    
}
