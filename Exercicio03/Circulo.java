/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author Aluno
 */
public class Circulo extends FormaGeometrica{
    
    private float raio;
    
    public void calculoArea(float raio){
        area = (float) (3.14 * raio);
    }
    
    public void calculoPerimetro(float raio){
        perimetro = (float) (2 * 3.14 * raio);
    }
}
