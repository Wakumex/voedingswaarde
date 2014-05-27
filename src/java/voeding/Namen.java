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
        array.add(new Eigenschappen("ei.jpg", "Ei", "32,0 gram.", "0,0 gram.", "16,2 gram.", "0,0 gram.", "nvt"));
        array.add(new Eigenschappen("brood.jpg", "Brood", "3,7 gram.", "45,6 gram.", "7 gram.", "5,7 gram.", "1,6 mg."));
        array.add(new Eigenschappen("biefstuk.jpg","Biefstuk", "3,5 gram.", "0,0 gram.", "23,8 gram.", "0,0 gram.", "20 mg."));
    }
     public String getResult(int i)
    {
        result += "<form>"
                + "<div class=\"namen\">"
                + "<label><h1>" + array.get(i).getNaam()+ "</h1></label><br>"
                + "</div>"
                + "</form>";
        return result;
    }
     
                Eigenschappen eigenschappen;
            
    public String genereerPagina(int i)
    {
           html +="<form>"
                + "<div class=\"afbeelding\">"
                + "<img src=" + array.get(i).getFoto() + ">"
                + "</div>"
                + "<div class=\"gegevens\">"
                + "<label for=\"vetten\"> Vetten: " + array.get(i).getVetten() + "</label><br />"
                + "<label for=\"koolhydraten\">  Koolhydraten: " + array.get(i).getKoolhydraten()  + "</label><br />"
                + "<label for=\"eiwitten\">     Eiwitten: "    + array.get(i).getEiwitten() + "</label> <br />"
                + "<label for=\"vezels\">   Vezels: " + array.get(i).getVezels() + "</label><br />" 
                + "<label for=\"zout\">   Zout: " + array.get(i).getZout() + "</label>"
                + "</div>"
                + "</form>";
        
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
