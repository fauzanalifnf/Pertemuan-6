/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohProsedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manusia joko = new Manusia();
        joko.nama = "Joko Anugrah";
        joko.JenisKelamin = "Laki-Laki";
        joko.Alamat = "Bandung";
        
        Manusia tini = new Manusia();
        tini.nama = "Tini Sumarni";
        tini.JenisKelamin = "Perempuan";
        tini.Alamat = "Semarang";
        
        joko.tampilInformasi();
        tini.tampilInformasi();
        
    }
    
}
