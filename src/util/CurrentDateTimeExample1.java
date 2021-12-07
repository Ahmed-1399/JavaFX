/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import static java.time.LocalDateTime.now;
public class CurrentDateTimeExample1 {    
     
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   
   public  String d=dtf.format(now);
//   System.out.println(dtf.format(now));  
  }    

