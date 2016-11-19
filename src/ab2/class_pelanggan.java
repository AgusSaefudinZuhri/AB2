/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab2;

/**
 *
 * @author Agus
 */
public class class_pelanggan {
    private String kode,nama,alamat,telepon;

    public class_pelanggan(String kode, String nama, String alamat, String telepon) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public class_pelanggan() {
    }
    

    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    
    
}
