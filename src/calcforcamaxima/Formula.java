/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcforcamaxima;

import static java.sql.DriverManager.println;

/**
 *
 * @author Felipe
 */
public class Formula {
    private double cargaLevantada;
    private double repeticoesRealizadas;
    private double rmEstimado;
    
    public Formula(){
        cargaLevantada = 0;
        repeticoesRealizadas = 0;
        rmEstimado = 0;
    }
    
    public double rmEstimado(double carga, double repet){
        cargaLevantada = carga;
        if(repet>=0&repet<=10){repeticoesRealizadas = repet;}
        else{ ExcessaoNumero pop = new ExcessaoNumero();
        pop.setVisible(true);}
        
        rmEstimado = Math.round(100*cargaLevantada/(102.78 - (2.78*repeticoesRealizadas)));
        
        return rmEstimado;
    }
    
    
}
