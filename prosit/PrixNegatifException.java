/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prosit;

/**
 *
 * @author User
 */
public class PrixNegatifException extends Exception{
  public PrixNegatifException(){
        super();
    }
    
    public PrixNegatifException(String msg){
        super(msg);
    }    
}
