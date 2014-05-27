/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voeding;

/**
 *
 * @author kevin
 */
public class Eigenschappen {
    
    String foto;
    String naam;
    String vetten;
    String koolhydraten;
    String eiwitten;
    String vezels;
    String zout;
       
    public Eigenschappen (String foto, String naam, String vetten, String koolhydraten, String eiwitten, String vezels, String zout)
    {
        this.foto=foto;
        this.naam=naam;
        this.vetten=vetten;
        this.koolhydraten=koolhydraten;
        this.eiwitten=eiwitten;
        this.vezels=vezels;
        this.zout=zout;

    }
    public String getFoto(){
        return foto;
    }
    public String getNaam(){
        return naam;
    }
    public String getVetten(){
        return vetten;
    }
    public String getKoolhydraten(){
        return koolhydraten;
    }
    public String getEiwitten(){
        return eiwitten;
    }
    public String getVezels(){
        return vezels;
    }
    public String getZout(){
        return zout;
    }

}

