/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author Aluno
 */
public class HeuristicaEuclidiana implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        /*float posicaoxn = n.getPosition().x;
        float posicaoyn = n.getPosition().y;
        float posicaoxn1 = n1.getPosition().x;
        float posicaoyn1 = n1.getPosition().y;*/
        
        float distancia = n1.getPosition().dst(n.getPosition());
        return distancia/9;
        
    }
    
}
