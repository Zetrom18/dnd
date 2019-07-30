/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author lucas
 */
public class User {
    private String username;
    private int password;
    private String nickname;
    
    User(
            String user,
            String pass,
            String nick
    ){
        this.username = user;
        this.password = pass.hashCode();
        this.nickname = nick;
    }
    
    public boolean log(
            String pass
    ){
        if(this.password == pass.hashCode()){
            return true;
        }
        return false;
    }
}
