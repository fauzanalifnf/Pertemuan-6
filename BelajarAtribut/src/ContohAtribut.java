/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohAtribut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Orang budi = new Orang();
        budi.nama = "budi";
        budi.alamat = "Sumedang";
        budi.umur = 18;
        budi.menikah = false;
        
        Orang alif = new Orang();
        alif.nama = "alif";
        alif.alamat = "Bandung";
        alif.umur = 19;
        alif.menikah = false;
        
        System.out.println(budi.nama);
        System.out.println(alif.nama);
    }
    
}
