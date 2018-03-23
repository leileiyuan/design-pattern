package com.yuanleilei.prototype.simple;

public class Client {
     private  Prototype prototype;

     public Client(Prototype prototype){
         this.prototype = prototype;
     }

     public void operation(){
         Prototype prototype = this.prototype.clone();
     }
}
