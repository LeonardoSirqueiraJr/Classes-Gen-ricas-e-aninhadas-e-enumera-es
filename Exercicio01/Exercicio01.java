package Exercicio01;

public class Exercicio01 {

    public enum DiaDaSemana{
        DOMINGO,
        SEGUNDA,
        TERÇA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;
    }

    private DiaDaSemana diaDaSemana;

    public DiaDaSemana getDia(){
        return this.diaDaSemana;
    }

    public boolean ehDiaTuil(){
        if ((this.getDia() == DiaDaSemana.DOMINGO) || (this.getDia() == DiaDaSemana.SABADO){
            return false;
        }
        return true;
    }


}
