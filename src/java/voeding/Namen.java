/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voeding;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Namen {
    
    String html = "";
    String result = "";
    String lijst = "";
    private final ArrayList<Eigenschappen> array;
    
    public Namen()
    {
        array = new ArrayList<>();
    }

    public void voegToe()
    {
        array.add(new Eigenschappen("Ei", "32,0 gram.", "0,0,", "16,2 gram", "0,0", "dunno lol"));
        array.add(new Eigenschappen("Brood", "niet zoveel", "0,0,", "16,2 gram", "0,0", "dunno lol"));
        array.add(new Eigenschappen("Slappy ho burger", "veel niggu", "0,0,", "16,2 gram", "0,0", "dunno lol"));
    }
     public String getResult(int i)
    {
        result += "<form>"
                + "<label><h1>" + array.get(i).getNaam()+ "</h1></label><br>"
                + "</form>";
        return result;
    }

    public String genereerPagina()
    {

        for(Eigenschappen eigenschappen : array)
        {
            
           html +="<form>"
                + "<label for=\"vetten\"> Vetten: "+ eigenschappen.getVetten() + "</label><br />"
                + "<label for=\"koolhydraten\">  Koolhydraten: " + eigenschappen.getKoolhydraten()  + "</label><br />"
                + "<label for=\"eiwitten\">     Eiwitten: "    + eigenschappen.getEiwitten() + "</label> <br />"
                + "<label for=\"vezels\">   Vezels: " + eigenschappen.getVezels() + "</label><br />" 
                + "<label for=\"zout\">   Zout: " + eigenschappen.getZout() + "</label>"
                + "</form>";
        }
        return html;
    }
        public String lijst()
    {
        
        int x = 0;
        for(Eigenschappen eigenschappen : array)
        {
            lijst += "<option value="+x+">" + eigenschappen.naam + "</option>";
            x++;
        }
        return lijst;
    
}
}
