/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Priska
 */
public class Tempat {
    private int tinggi; // tinggi tempat Game
    private int lebar;  // lebar tempat Game
    private ArrayList<Sel> daftarSel; // daftar sel

    private String isi; // isi file konfigurasi
    
    public static int batasKanan;
    public static int batasBawah;
    
    public Tempat() {
        daftarSel = new ArrayList<Sel>();
    }
    
    
    
    /**
     * Fungsi pembaca file konfigurasi.
     * Hasil pembacaan file akan disimpan di atribut 'isi'.
     * @param file 
     */
    public void bacaKonfigurasi(File file) throws IOException{
        FileInputStream input = null;
            this.isi = " ";
            int data;
            int baris = 0;
            int kolom = 0;
            boolean hasil = false;
            Tempat pointer = new Tempat();
            input = new FileInputStream(file);
            while ((data = input.read()) != -1){
                isi = isi + (char) data;
                if ((char)data != '\n') {
                    Sel sel = new Sel(baris, kolom, (char) data);
                    this.tambahSel(sel);
                    kolom++;
                }else {
                    baris++;
                }
            }
    }
    
    /**
     * Fungsi penambah daftar sel.
     * @param sel 
     */
    public void tambahSel(Sel sel){
        daftarSel.add(sel);
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the daftarSel
     */
    public ArrayList<Sel> getDaftarSel() {
        return daftarSel;
    }

    /**
     * @param daftarSel the daftarSel to set
     */
    public void setDaftarSel(ArrayList<Sel> daftarSel) {
        this.daftarSel = daftarSel;
    }

    /**
     * @return the isi
     */
    public String getIsi() {
        return isi;
    }

    /**
     * @param isi the isi to set
     */
    public void setIsi(String isi) {
        this.isi = isi;
    }
}
