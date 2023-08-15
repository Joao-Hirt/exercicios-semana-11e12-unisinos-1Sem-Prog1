import java.util.Scanner;

public class Exercicios {
    Scanner scanner = new Scanner(System.in);

    //1
    //a) 10 9 8 7 6 5 4 3 2 1
    public void exercicio1a(){
        int[] array = new int[10];
        int cont = 1;
        for(int i = array.length-1; i>=0; i--){
            array[i] = cont++;
        }
    }

    //b) 0 1 4 9 16 25 36 49 64 81 100
    public void exercicio1b(){
        int[] array = new int[11];
        for(int i=0; i<array.length; i++){
            array[i] = i*i;
        }
    }

    //c) 1 2 3 4 5 10 20 30 40 50
    public void exercicio1c(){
        int[] array = new int[10];
        int aux = 10;
        for(int i=0; i<array.length; i++){
            if(i<5) array[i] = i+1;
            else{
                array[i] = aux;
                aux +=10;
            }
        }
    }

    //d) 3 4 7 12 19 28 39 52 67 84
    public void exercicio1d(){
        int[] array = new int[10];
        for(int i = 0; i<array.length; i++){
            array[i] = (i*i)+3;
        }
    }

    //2
    public void exercicio2(double[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }

    //3
    public void exercicio3(){
        double[] array = new double[10];
        for(int i=0; i<array.length; i++){
            System.out.println("Digite o valor da posição "+i+" do array: ");
            array[i] = scanner.nextDouble();
        }
    }

    //4
    public int exercicio4(int[] array){
        if(array == null) return -1;
        int quantNegativos = 0;
        for (int i=0; i<array.length; i++){
            if(array[i]<0) quantNegativos++;
        }return quantNegativos;
    }

    //5
    public int exercicio5(int[] a, int x){
        if(a == null) return -1;
        int quantVezes = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == x) quantVezes++;
        }return quantVezes;
    }

    //6
    public boolean[] exercicio6(int[] a){
        if(a == null) return null;
        boolean[] retorno = new boolean[a.length];
        for(int i=0; i<a.length; i++){
            retorno[i] = a[i]>0;
        }return retorno;
    }

    //7
    public int exercicio7(double[] array){
        int posicaoMaiorValor = 0;
        for(int i=1; i<array.length; i++){
            if(array[i] > array[posicaoMaiorValor]){
                posicaoMaiorValor = i;
            }
        }return posicaoMaiorValor;
    }

    //8
    public int[] exercicio8(){
        System.out.println("Digite a quantidade de elementos do array: ");
        int[] array = new int[scanner.nextInt()];
        for(int i=0; i<array.length; i++){
            System.out.println("Digite o valor da posição "+i+" do array: ");
            array[i] = scanner.nextInt();
        }return array;
    }

    //9
    public void exercicio9(int[] array){
        if(array != null){
            for(int i=0; i<array.length; i++){
                if(array[i]%2 == 0){
                    array[i] = 1;
                }else array[i] = -1;
            }
        }
    }

    //Exercicio parte 7 Lab
    public int procuraNome(String[] nomes, String nome){
        for(int i=0; i<nomes.length; i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                return i;
            }
        }return -1;
    }

    //Exercicio parte 8 Lab
    public double calculaMedia(double[] valores){
        double somaValores = 0;
        for(int i=0; i< valores.length; i++){
            valores[i] += somaValores;
        }return somaValores/valores.length;
    }
}
