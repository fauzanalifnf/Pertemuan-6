/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ContohParameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matematika mtk = new Matematika();
        
        int a = mtk.tambah(100, 50);
        System.out.println(a);
        
        a = mtk.kurang(255, 75);
        System.out.println(a);
        
        double b = mtk.bagi(100.0, 3.0);
        System.out.println(b);
       
      
       
    }
    
}
