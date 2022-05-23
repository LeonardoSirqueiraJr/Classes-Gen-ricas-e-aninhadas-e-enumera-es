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
public class Retangulo extends FormaGeometrica {
    private float lado1;
    private float lado2;
    
    public void calculoArea(float lado1, float lado2){
        area = (float) (lado1 * lado2);
    }
    
    public void calculoPerimetro(float lado1, float lado2){
        perimetro = (float) (lado1 + lado2);
    }
}
