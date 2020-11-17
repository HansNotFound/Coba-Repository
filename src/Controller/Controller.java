/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HansNotFound
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table users
    public static ArrayList<DataUser> getAllUsers() {
        ArrayList<DataUser> users = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM datauser";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DataUser user = new DataUser();
                user.setNIK(rs.getString("NIK"));
                user.setNama(rs.getString("Nama"));
                user.setTempatLahir(rs.getString("TempatLahir"));
                user.setTanggallahir(rs.getString("JenisKelamin"));
                user.setGolonganDarah(rs.getString("GolonganDarah"));
                user.setAlamat(rs.getString("alamat"));
                user.setRTRW(rs.getString("RTRW"));
                user.setKecamatan(rs.getString("Kecamatan"));
                user.setKelDesa(rs.getString("KelDesa"));
                user.setAgama(rs.getString("Agama"));
                user.setStatusPerkawinan(rs.getString("StatusPerkawinan"));
                user.setPekerjaan(rs.getString("Pekerjaan"));
                user.setKewarganegaraan(rs.getString("Kewarganegaraan"));
                user.setFoto(rs.getString("Foto"));
                user.setTandaTangan(rs.getString("TandaTangan"));
                user.setTempatPembuatKTP(rs.getString("TempatPembuatKTP"));
                user.setTanggalPembuatKTP(rs.getString("TanggalPembuatKTP"));
                user.setBerlakuHingga(rs.getString("BerlakuHingga"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (users);
    }

    // SELECT WHERE
    public static DataUser getUser(String NIK) {
        conn.connect();
        String query = "SELECT * FROM datauser WHERE NIK='" + NIK + "'";
        DataUser user = new DataUser();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setNIK(rs.getString("NIK"));
                user.setNama(rs.getString("Nama"));
                user.setTempatLahir(rs.getString("TempatLahir"));
                user.setTanggallahir(rs.getString("Tanggallahir"));
                user.setJenisKelamin(rs.getString("JenisKelamin"));
                user.setGolonganDarah(rs.getString("GolonganDarah"));
                user.setAlamat(rs.getString("alamat"));
                user.setRTRW(rs.getString("RTRW"));
                user.setKecamatan(rs.getString("Kecamatan"));
                user.setKelDesa(rs.getString("KelDesa"));
                user.setAgama(rs.getString("Agama"));
                user.setStatusPerkawinan(rs.getString("StatusPerkawinan"));
                user.setPekerjaan(rs.getString("Pekerjaan"));
                user.setKewarganegaraan(rs.getString("Kewarganegaraan"));
                user.setFoto(rs.getString("Foto"));
                user.setTandaTangan(rs.getString("TandaTangan"));
                user.setTempatPembuatKTP(rs.getString("TempatPembuatKTP"));
                user.setTanggalPembuatKTP(rs.getString("TanggalPembuatKTP"));
                user.setBerlakuHingga(rs.getString("BerlakuHingga"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (user);
    }
    
    // INSERT
    public static boolean insertNewUser(DataUser user) {
        conn.connect();
        String query = "INSERT INTO datauser VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, user.getNIK());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getTempatLahir());
            stmt.setString(4, user.getTanggallahir());
            stmt.setString(5, user.getJenisKelamin());
            stmt.setString(6, user.getGolonganDarah());
            stmt.setString(7, user.getAlamat());
            stmt.setString(8, user.getRTRW());
            stmt.setString(9, user.getKecamatan());
            stmt.setString(10, user.getKelDesa());
            stmt.setString(11, user.getAgama());
            stmt.setString(12, user.getStatusPerkawinan());
            stmt.setString(13, user.getPekerjaan());
            stmt.setString(14, user.getKewarganegaraan());
            stmt.setString(15, user.getFoto());
            stmt.setString(16, user.getTandaTangan());
            stmt.setString(17, user.getTempatPembuatKTP());
            stmt.setString(18, user.getBerlakuHingga());
            stmt.setString(19, user.getTanggalPembuatKTP());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateUser(DataUser user, Boolean filechooserFoto, Boolean filechooserTT) {
        conn.connect();
        String query = null;
        if(filechooserFoto == true && filechooserTT == true){
            query = "UPDATE datauser SET Nama='" + user.getNama() + "', "
                + "TempatLahir='" + user.getTempatLahir() + "', "
                + "Tanggallahir='" + user.getTanggallahir() + "', "
                + "JenisKelamin='" + user.getJenisKelamin() + "', "
                + "GolonganDarah='" + user.getGolonganDarah() + "', "
                + "alamat='" + user.getAlamat() + "', "
                + "RTRW='" + user.getRTRW() + "', "
                + "Kecamatan='" + user.getKecamatan() + "', "
                + "KelDesa='" + user.getKelDesa() + "', "
                + "Agama='" + user.getAgama() + "', "
                + "StatusPerkawinan='" + user.getStatusPerkawinan() + "', "
                + "Pekerjaan='" + user.getPekerjaan() + "', "
                + "Kewarganegaraan='" + user.getKewarganegaraan() + "', "
                + "Foto='" + user.getFoto() + "', "
                + "TandaTangan='" + user.getTandaTangan() + "', "
                + "TempatPembuatKTP='" + user.getTempatPembuatKTP() + "', "
                + "BerlakuHingga='" + user.getBerlakuHingga() + "', "
                + "TanggalPembuatKTP='" + user.getTanggalPembuatKTP() + "' "
                + " WHERE NIK='" + user.getNIK() + "'";
        } else if(filechooserFoto == true && filechooserTT == false){
            query = "UPDATE datauser SET Nama='" + user.getNama() + "', "
                + "TempatLahir='" + user.getTempatLahir() + "', "
                + "Tanggallahir='" + user.getTanggallahir() + "', "
                + "JenisKelamin='" + user.getJenisKelamin() + "', "
                + "GolonganDarah='" + user.getGolonganDarah() + "', "
                + "alamat='" + user.getAlamat() + "', "
                + "RTRW='" + user.getRTRW() + "', "
                + "Kecamatan='" + user.getKecamatan() + "', "
                + "KelDesa='" + user.getKelDesa() + "', "
                + "Agama='" + user.getAgama() + "', "
                + "StatusPerkawinan='" + user.getStatusPerkawinan() + "', "
                + "Pekerjaan='" + user.getPekerjaan() + "', "
                + "Kewarganegaraan='" + user.getKewarganegaraan() + "', "
                + "Foto='" + user.getFoto() + "', "
                + "TempatPembuatKTP='" + user.getTempatPembuatKTP() + "', "
                + "BerlakuHingga='" + user.getBerlakuHingga() + "', "
                + "TanggalPembuatKTP='" + user.getTanggalPembuatKTP() + "' "
                + " WHERE NIK='" + user.getNIK() + "'";
        }else if(filechooserFoto == false && filechooserTT == true){
            query = "UPDATE datauser SET Nama='" + user.getNama() + "', "
                + "TempatLahir='" + user.getTempatLahir() + "', "
                + "Tanggallahir='" + user.getTanggallahir() + "', "
                + "JenisKelamin='" + user.getJenisKelamin() + "', "
                + "GolonganDarah='" + user.getGolonganDarah() + "', "
                + "alamat='" + user.getAlamat() + "', "
                + "RTRW='" + user.getRTRW() + "', "
                + "Kecamatan='" + user.getKecamatan() + "', "
                + "KelDesa='" + user.getKelDesa() + "', "
                + "Agama='" + user.getAgama() + "', "
                + "StatusPerkawinan='" + user.getStatusPerkawinan() + "', "
                + "Pekerjaan='" + user.getPekerjaan() + "', "
                + "Kewarganegaraan='" + user.getKewarganegaraan() + "', "
                + "TandaTangan='" + user.getTandaTangan() + "', "
                + "TempatPembuatKTP='" + user.getTempatPembuatKTP() + "', "
                + "BerlakuHingga='" + user.getBerlakuHingga() + "', "
                + "TanggalPembuatKTP='" + user.getTanggalPembuatKTP() + "' "
                + " WHERE NIK='" + user.getNIK() + "'";
        } else if(filechooserFoto == false && filechooserTT == false){
            query = "UPDATE datauser SET Nama='" + user.getNama() + "', "
                + "TempatLahir='" + user.getTempatLahir() + "', "
                + "Tanggallahir='" + user.getTanggallahir() + "', "
                + "JenisKelamin='" + user.getJenisKelamin() + "', "
                + "GolonganDarah='" + user.getGolonganDarah() + "', "
                + "alamat='" + user.getAlamat() + "', "
                + "RTRW='" + user.getRTRW() + "', "
                + "Kecamatan='" + user.getKecamatan() + "', "
                + "KelDesa='" + user.getKelDesa() + "', "
                + "Agama='" + user.getAgama() + "', "
                + "StatusPerkawinan='" + user.getStatusPerkawinan() + "', "
                + "Pekerjaan='" + user.getPekerjaan() + "', "
                + "Kewarganegaraan='" + user.getKewarganegaraan() + "', "
                + "TempatPembuatKTP='" + user.getTempatPembuatKTP() + "', "
                + "BerlakuHingga='" + user.getBerlakuHingga() + "', "
                + "TanggalPembuatKTP='" + user.getTanggalPembuatKTP() + "' "
                + " WHERE NIK='" + user.getNIK() + "'";
        }
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE
    public static boolean deleteUser(String NIK) {
        conn.connect();

        String query = "DELETE FROM datauser WHERE NIK='" + NIK + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
