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

}