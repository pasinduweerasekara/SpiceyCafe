/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spicycafe;

import java.text.SimpleDateFormat;  
import java.util.Date;

public class User {
    private String f_name;
    private String l_name;
    private String u_id;
    private String j_roll;
    private Date last_loging_datetime;
    
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat time_formatter = new SimpleDateFormat("HH:mm:ss");
    
    
    
    public User(String first_name,String last_name,String userId,String job_roll,Date log_in_date) {
        f_name = first_name;
        l_name = last_name;
        u_id = userId;
        j_roll = job_roll;
        last_loging_datetime = log_in_date;
    }
    
    public String get_first_name(){
        return f_name;
    }
    public void set_first_name(String new_first_name){
        f_name = new_first_name;
    }
    
    public String get_last_name(){
        return l_name;
    }
    public void set_last_name(String new_last_name){
        f_name = new_last_name;
    }
    
    public String get_userId(){
        return u_id;
    }
    public void set_userId(String new_user_id){
        u_id = new_user_id;
    }
    
    public String get_job_roll(){
        return j_roll;
    }
    public void set_job_roll(String new_job_roll){
        u_id = new_job_roll;
    }
    public String get_current_login_date(){
       String date = formatter.format(last_loging_datetime);
       return date;
    }
    
    public String get_current_login_time(){
       String date = time_formatter.format(last_loging_datetime);
       return date;
    }
}
