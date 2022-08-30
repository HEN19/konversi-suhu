/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi_waktu;

/**
 *
 * @author 
 * 
 */

abstract class time{
    public abstract void format();
    public void Waktu(int s){
        System.out.println("Waktu yang dikonversi adalah "+s+" s");
    }
}
class konvert extends time{
    int waktu,day=86400,jam=3600,menit=60,x;
    public konvert(int s) {
    this.waktu=s;
}
    void konvert(){
        System.out.println("============Print=================");
    }
    
    public int hari(){
    if (this.waktu>=day){
        x = this.waktu/day;
        this.waktu = this.waktu%day;
    }return x;
}
    public int jam(){
    if (this.waktu>=jam){
        if (day>this.waktu) {
            x = this.waktu/jam;
            this.waktu=this.waktu%jam;
        }
    }return x;
    }
    public int min(){
    if (this.waktu>=menit){
        if (jam>this.waktu){
           x = this.waktu/menit;
           this.waktu=this.waktu%menit;
        }
    }return x;
    }
    public int sisa(){
        x =this.waktu;
        return x;
    }

    @Override
    public void format() {
        System.out.println("Konversi dari "+waktu+" detik menjadi :");
        System.out.println("Hari    : "+hari());
        System.out.println("Jam     : "+jam());
        System.out.println("Menit   : "+min());
        System.out.println("Detik   : "+sisa());    }
}

public class Konversi_waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        konvert time = new konvert(100000);
        time.format();
        time.konvert();
        time.Waktu(100000);
    }
    
}
