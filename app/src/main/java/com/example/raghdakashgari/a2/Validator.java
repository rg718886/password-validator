package com.example.raghdakashgari.a2;


public class Validator {
    private String password;
    public Validator(){
        password = "";
    }
    public void setPassword(String pw){
        password = pw;
    }
    public String getPassword(){
        return password;
    }
    public boolean length(String pw){
        if (pw.length() >= 8){
            return true;
        }
        else {
            return false;
        }
    }
    public int Validate(String pw){
        boolean tmp_cmp = cmp(pw);
        boolean tmp_length = length(pw);


        if ((tmp_length && !tmp_cmp) || (!tmp_length && tmp_cmp)){
            return 1;
        }
        else if (tmp_length && tmp_cmp){
            return 2;
        }

        else {
            return 0;
        }
    }
    public boolean cmp(String pw){
        boolean test = pw.toLowerCase().equals("password");
        if (!test){
            return true;
        }
        else {
            return false;
        }
    }
    //at least 1 uppercase character
    public static boolean uppercase(String password){
        char temp;
        int uppercase =0, i;
        for (i=0; i<password.length()-1; i++){
            temp = password.charAt(i);
            if (Character.isUpperCase(temp)){
                uppercase ++;
            }
        }
        if (uppercase < 1){
            return false;
        }
        else {
            return true;
        }
    }
    //at least 1 special character
    public boolean specialchar(String password){
        char temp;
        int specialchar=0, i;
        for (i=0; i<password.length()-1; i++){
            temp = password.charAt(i);
            if (!Character.isLetterOrDigit(temp)){
                specialchar ++;
            }
        }
        if (specialchar<1) {
            return false;
        }
        else {
            return true;
        }
    }
    //at least 1 digit
    public boolean digits(String password){
        char temp;
        int digits=0, i;
        for (i=0; i<password.length()-1; i++){
            temp = password.charAt(i);
            if (Character.isDigit(temp)){
                digits++;
            }

        }
        if (digits < 1){
            return false;
        }
        else {
            return true;
        }
    }



}