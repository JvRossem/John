/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindopdracht.oop;

/**
 *
 * @author mosqu
 */
public class GemCijfers {
    
  protected static int getGemStudent() {        
       int total = 0;
       int avg;
        for(int i=0; i<StudentCijfers.getStudentCijfers().size(); i++){
        total=total+StudentCijfers.getStudentCijfers().get(i);
        }
        avg=total/StudentCijfers.getStudentCijfers().size();
       return avg;  
  }
    protected static int getGemJoenna() {        
       int total = 0;
       int avgj;
        for(int i=0; i<StudentCijfers.getJoenna().size(); i++){
        total=total+StudentCijfers.getJoenna().get(i);
        }
        avgj=total/StudentCijfers.getJoenna().size();
        return avgj;  
  }
  
    protected static int getGemLisa() {        
       int total = 0;
       int avgl;
        for(int i=0; i<StudentCijfers.getLisa().size(); i++){
        total=total+StudentCijfers.getLisa().get(i);
        }
        avgl=total/StudentCijfers.getLisa().size();
        return avgl;  
  }
    
       protected static int getGemRafael() {        
       int total = 0;
       int avgr;
        for(int i=0; i<StudentCijfers.getRafael().size(); i++){
        total=total+StudentCijfers.getRafael().get(i);
        }
        avgr=total/StudentCijfers.getRafael().size();
       return avgr;  
   } 
}