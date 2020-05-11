/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fix.tugas.akhir;

/**
 *
 * @author 9dmiq
 */
public class bmiclass {

    private Object bmi;
    public String calculatebmi(double bobot, double tinggi){
        double hasil;
        hasil = bobot / (tinggi*tinggi);
        String result;
        result = String.format("%.6f",hasil);
        return result;
    }
    
}
