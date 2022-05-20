package Exercicio02;

public class Par <F, S> {
    private F primeiro;
    private S segundo;

    public Par(F a, S b){
        primeiro = a;
        segundo = b;
    }
    public void setPrimeiro(F a){
        primeiro = a;
    }
    public void setSegundo(S b){
        segundo = b;
    }
    public F getPrimeiro(){
        return primeiro;
    }
    public S getSegundo(){
        return segundo;
    }

    /*
    Escreva uma classe genérica Par que tem dois parâmetros de tipo - F e S - cada um representando o tipo do primeiro e segundo elemento do par,
    respectivamente. Adicione os métodos get e set ao primeiro e ao segundo elemento do par (Dica: o cabeçalho da classe deve ser public class Par<F, S >).
    Crie uma classe Main que instancie dois objetos da Classe Par. Os valores dos dois objetos devem ser de tipos diferentes
     */


}
