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
public class Triangulo extends FormaGeometrica{
    
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    private float lado3;
        
    public void calculoArea(float base,float altura){
        area = (float) (base*altura)/2;
    }
    
    public void calculoPerimetro(float base,float altura){
        perimetro = (float) (lado1+lado2+lado3);
    }
    
}
