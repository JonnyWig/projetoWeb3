
package model;


public class User {
   //atributos
    private String userName;
    private String userPass;
    
    
    //construtor
    public User(String u, String p){
    this.userName = u;
    this.userPass = p;
    
    
  
    
    
    }
     //getter e setter
    public String getUserName(){
    return this.userName;
    }
    public void setUserName(String u){
    this.userName = u;
    }

    public String getUserPass() {
        return userPass;
    }
     //toStreing
  public String toString(){
    return "<hr>Nome:" + userName +
        "<br>senha:" + userPass;
    
   
}
  public boolean isLogged(){
  return (userName.equals("email@gmail.com")
          && userPass.equals("senha1234"));
  }
  
}

