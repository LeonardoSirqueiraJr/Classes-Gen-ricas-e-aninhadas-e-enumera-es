package Exercicio02;

public class Main {
    public static void main(String args[]){
        Par par1 = new Par<Integer,Double>(0,0.01);
        Par par2 = new Par<Integer,Double>(255,3.14);
        Par par3 = new Par<Integer,Double>(128,9.9999);

        Par[] arrayPar = new Par[3];
        arrayPar[0]=par1;
        arrayPar[1]=par2;
        arrayPar[2]=par3;
        printArray(arrayPar);
    }
    public static <T extends Par> void printArray(T[] array){
        for(int i=0;i<array.length; i++){
            System.out.println("Primeiro: "+array[i].getPrimeiro());
            System.out.println("Segundo: "+array[i].getSegundo());
        }
    }

}
