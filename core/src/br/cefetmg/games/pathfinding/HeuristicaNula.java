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
public class HeuristicaNula implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        return 0;    
   
    } 

    
}
