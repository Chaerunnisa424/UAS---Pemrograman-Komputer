/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppUser;

/**
 *
 * @author Elsza
 */
public class Encaptulation {
    private static String nama;
    private static String jenishari;
    private static String metodepembayaran;
    private static int jumlahtiket;
    private static int total;
    private static int hargatiket;
    private static long no_telefon;
    private static String kursi;
    private static String film;
    
    public void setNama (String input){
        nama = input;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setJenishari (String input){
        jenishari = input;
    }
    
    public String getJenishari(){
        return this.jenishari;
    }
    
    public void setMetodepembayaran (String input){
        metodepembayaran = input;
    }
    
    public String getMetodepembayaran(){
        return this.metodepembayaran;
    }
    
    public void setJumlahtiket (int input){
        jumlahtiket = input;
    }
    public int getJumlahtiket (){
        return this.jumlahtiket;
    }
    
    public void setTotal (int input){
        total = input;
    }
    
    public int getTotal(){
        return this.total;
    }
    
    public void setHargatiket (int input){
        hargatiket = input;
    }
    
    public int getHargatiket (){
        return this.hargatiket;
    }
    
    public void setNo_telefon(long input){
        no_telefon = input;
    }
    
    public long getNo_telefon(){
        return this.no_telefon;
    }
    
    public void setKursi (String input){
        kursi = input;
    }
    public String getKursi (){
        return this.kursi;
    }
    
    public void setFilm (String input){
        film = input;
    }
    public String getFilm (){
        return this.film;
    }
    
}
