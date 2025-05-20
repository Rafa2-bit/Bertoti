/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clube;

import com.mycompany.futebol.Jogador;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author faelb
 */
public class Clube {
    private List<Jogador> jogadores = new LinkedList<Jogador>();
    
    public void contratar(Jogador jogador){
        jogadores.add(jogador);
    }
    
    
    public Jogador buscarNumeroJogador(int numero){
         for(Jogador jogador:jogadores){
          if(jogador.equals(numero)){ return jogador;}
            }
         return null;
}
    
    public Jogador buscarJogador(String nome){
      for(Jogador jogador:jogadores){
          if(jogador.equals(nome)){ return jogador;}
      }
      return null;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
}
