/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penitenciaria;

import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Testes {
    public static void main(String[] args) {
        
        ArrayList <Pessoa> teste = new ArrayList<>();
         ArrayList <String> teste2 = new ArrayList<>();
        teste2.add("aaa");
        teste2.add("bbb");
        teste2.add("ccc");
        teste2.add("ddd");
        teste2.add("eee");
        
        System.out.println(teste2.indexOf("ddd"));
        
    }
}
