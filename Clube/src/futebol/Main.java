/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package futebol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 *
 * @author faelb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clube XVpiracicaba = new Clube();
        
        XVpiracicaba.contratar(new Jogador("Cristiano Ronaldo",7));
        XVpiracicaba.contratar(new Jogador("Messi",10));
        XVpiracicaba.contratar(new Jogador("Neymar",11));
        XVpiracicaba.contratar(new Jogador("Lewandowski",9));
        
        assertEquals(XVpiracicaba.getJogadores().size(),2);

         Jogador jogador = XVpiracicaba.buscarJogador("Messi");
         
         assertEquals(jogador.getNome(),"Messi");
         
         System.out.println(jogador);        
    }
    
}
