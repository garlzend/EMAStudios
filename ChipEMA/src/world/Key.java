/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import java.awt.image.BufferedImage;

/**
 *
 * @author Antonius
 */
public class Key extends Item{
    public final static String KUNCI_BIRU="KUNCI BIRU";
    public final static String KUNCI_MERAH="KUNCI MERAH";
    public final static String KUNCI_KUNING="KUNCI KUNING";
    
    /**
     * Constuctor untuk membuat sebuah kunci
     * @param x posisi x dimana kunci dibuat
     * @param y posisi y dimana kunci dibuat
     * @param warnaKunci bisa didapatkan dari attribute final static di kelas Key
     */
    public Key(int x, int y,String warnaKunci)
    {
        super(x,y);
        this.namaItem=warnaKunci;
        //this.isReusable=false;
        if(this.namaItem.equals("KUNCI BIRU"))
        {
            this.imgFileName="image/key.jpg";
        }
        else if(this.namaItem.equals("KUNCI MERAH"))
        {
            this.imgFileName="image/key.jpg";
        }
    }
    
    public BufferedImage getImage()
    {  
        return this.img;
    }
}
