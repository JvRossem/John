/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

import java.util.ArrayList;

/**
 *
 * @author mosqu
 */
public class Toetslijst {
 
protected static ArrayList<Vragen> toetslijst;     
protected static ArrayList<Vragen> toetslijst1;  
protected static ArrayList<Vragen> toetslijst2;
/*Superclass die de grote lijst met alle vragen bevat. Bij uitbreiding een nieuwe sublist met 10 vragen toevoegen. 
*Hierdoor kan je een vaste set antwoorden erbij maken
*/

   protected static void SetupToetslijst() { 

        ArrayList<ArrayList<Vragen> > toetslijst = new ArrayList<ArrayList<Vragen> >(); 
     
        Vragen toetsvraag1 = new Vragen("Vraag 1: Hoeveel inwoners heeft Nederland? (Afronden in miljoenen)"+ "\n\n A: 1 Miljoen \n B: 5 Miljoen \n C: 17 Miljoen \n D: 22 Miljoen");
        Vragen toetsvraag2 = new Vragen("Vraag 2: Hoeveel cm zit er in een kilometer?"+"\n\n A: 1000  \n B: 20000  \n C: 100  \n D: 10000 ");
        Vragen toetsvraag3 = new Vragen("Vraag 3: Wat is de uitkomst van 8 x (9-3)+ 5 x (3+8)"+"\n\n A: 45  \n B: 89  \n C: 103  \n D: 96");
        Vragen toetsvraag4 = new Vragen ("Vraag 4: Wat is de oppervlakte van een vierkant met zijdes van 5cm?"+"\n\n A: 75  \n B: 50 \n C: 87  \n D: 25");
        Vragen toetsvraag5 = new Vragen ("Vraag 5: Wat is de inhoud van een kubus met gelijke zijdes van 5cm?"+"\n\n A: 15  \n B: 50  \n C: 25 \n D: 125");
        Vragen toetsvraag6 = new Vragen ("Vraag 6: Hoeveel vierkante meter is 1 hectare?"+"\n\n A: 100  \n B: 10000 \n C: 100000  \n D: 10000");
        Vragen toetsvraag7 = new Vragen ("Vraag 7: Hoeveel geld heb je in totaal als 20x 10cent, 3x 1 euro en 8x 5 euro bij elkaar optelt?"+"\n\n A: 87  \n B: 30  \n C: 45 \n D:60");
        Vragen toetsvraag8 = new Vragen ("Vraag 8: Een auto rijd constant 50km per uur. Hij moet 600km afleggen. Hoeveel uur is hij onderweg?"+"\n\n A: 12  \n B: 16  \n C: 24  \n D: 14");
        Vragen toetsvraag9 = new Vragen ("Vraag 9: Wat is de uitkomst van 1/3 + 4/6?"+"\n\n A: 4  \n B: 1  \n C: 2  \n D: 24");
        Vragen toetsvraag10 = new Vragen ("Vraag 10: 3 kinderen willen tegelijk spelen op een nintendo switch. Hoeveel nintendo's moet je dan minimaal hebben?"+"\n\n A: 4  \n B: 2  \n C: 3  \n D: 1");
            Vragen toetsvraag11 = new Vragen ("....");  
            Vragen toetsvraag12 = new Vragen ("....");  
           
        toetslijst1 = new ArrayList<Vragen>();  
        toetslijst1.add(toetsvraag1);
        toetslijst1.add(toetsvraag2);
        toetslijst1.add(toetsvraag3);
        toetslijst1.add(toetsvraag4);
        toetslijst1.add(toetsvraag5);
        toetslijst1.add(toetsvraag6);
        toetslijst1.add(toetsvraag7);
        toetslijst1.add(toetsvraag8);
        toetslijst1.add(toetsvraag9);
        toetslijst1.add(toetsvraag10);
            toetslijst.add(toetslijst1);
        
            toetslijst2 = new ArrayList<Vragen>();  
            toetslijst2.add(toetsvraag11);
            toetslijst2.add(toetsvraag12);
                toetslijst.add(toetslijst2);   
   }
   
    protected static ArrayList<Vragen> getToetslijst() {
         return toetslijst;}       
        
    protected static ArrayList<Vragen> getToetslijst1() {
         return toetslijst1;}   
    
    protected static ArrayList<Vragen> getToetslijst2() {
         return toetslijst2;} 
}
