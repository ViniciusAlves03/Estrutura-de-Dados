package atividade02;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF{
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public boolean  checaVetorOrdenado  (int [] numeros){
        int anterior = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (anterior > numeros[i]) { return false; }
            anterior = numeros[i];
        }
            return true;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     selectionSort       (int[] numeros){
        //lerVetor(numeros);
        
        int menor,indiceMenor;
        
        long antes = System.nanoTime();
        
        for (int i = 0; i < numeros.length - 1; i++) {
            menor = numeros[i];
            indiceMenor = i;
            
            for (int j = i + 1; j < numeros.length; j++){
                if (numeros[j] < menor){
                    menor = numeros[j];
                    indiceMenor = j;
                }
            }
            
            numeros[indiceMenor] = numeros[i];
            numeros[i] = menor;
        }
        
        long depois = System.nanoTime() - antes;
        
        //lerVetor(numeros);
        
        return depois;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     insertionSort       (int[] numeros){
        //lerVetor(numeros);
        
        long antes = System.nanoTime();
        int cont, key, cont2;

        for (cont = 1; cont < numeros.length; cont++) {
            key = numeros[cont];
            
            for (cont2 = cont - 1; (cont2 >= 0) && (numeros[cont2] > key); cont2--) {
                numeros[cont2 + 1] = numeros[cont2];
            }
           
            numeros[cont2 + 1] = key;
        }
        
        //lerVetor(numeros);
        
        long depois = System.nanoTime() - antes;
        return depois;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     mergeSort           (int[] numeros){
        long antes = System.nanoTime();
        
        int[] vAuxiliar = Arrays.copyOf(numeros, numeros.length);
 
        // classifica o array `arr` usando o array auxiliar `aux`
        merge_sort(numeros, vAuxiliar, 0, numeros.length - 1);
        
        long depois = System.nanoTime() - antes;
        return depois;
    }
    private void    merge               (int[] arr, int[] aux, int low, int mid, int high) {
        int k = low, i = low, j = mid + 1;
        
        while (i <= mid && j <= high){ //enquanto tiver elementos na esquerda e direita
            if (arr[i] <= arr[j]) { aux[k++] = arr[i++]; }
            else                  { aux[k++] = arr[j++]; }
        }
        
        while (i <= mid) { aux[k++] = arr[i++]; } //copia
        
        for (i = low; i <= high; i++) { arr[i] = aux[i]; } //copia de volta de forma ordenada
        
        //lerVetor(arr);
    } 
    private void    merge_sort          (int[] arr, int[] aux, int low, int high) {
        // Padrão
        if (high == low) { return; }            // se o tamanho da execução == 1
        
        // Ponto médio
        int mid = (low + ((high - low) >> 1));
 
        merge_sort(arr, aux, low, mid);         // divide/merge metade esquerda
        merge_sort(arr, aux, mid + 1, high);    // divide/merge metade direita
 
        merge(arr, aux, low, mid, high);        // mescla as duas meias corridas
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     quickSort           (int[] numeros){
        long antes = System.nanoTime();

        quick_sort(numeros,0,numeros.length-1);
        
        //lerVetor(numeros);
        
        long depois = System.nanoTime() - antes;
        return depois;
    }
    private void    quick_sort(int[] numeros, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo =cut(numeros, inicio, fim);
            
            quick_sort(numeros, inicio, posicaoPivo - 1);
            quick_sort(numeros, posicaoPivo + 1, fim);
        }
    }
    private int     cut(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        
        return f;
       } 
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     quickSort_shuffle   (int[] numeros){
        long antes = System.nanoTime();
        
		shuffleArray(numeros);

        quick_sort(numeros, 0, numeros.length - 1);             //Função quicksort conforme o slide
        
        long depois = System.nanoTime() - antes;
        return depois;
    }
    private static int[] shuffleArray(int[] array) {        //Função shuffle para embaralhar vetor
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            if (index != i) {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
        return array;
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
    public long     countingSort        (int[] numeros){
        long antes = System.nanoTime();

	int k = maiorNumero(numeros, numeros.length) + 1;

	int numerosB[] = new int[numeros.length];
	int numerosC[] = new int[k];
        
	for (int i = 1; i < k; i++)
            numerosC[i] = 0;
	for (int i = 1; i < numeros.length; i++)
            numerosC[numeros[i]]++;

	for (int i = 2; i < k; i++)
            numerosC[i] += numerosC[i - 1];

	for (int i = numeros.length - 1; i >= 0; i--) {
            numerosB[numerosC[numeros[i]]] = numeros[i];
            numerosC[numeros[i]]--;
	}

	for (int i = 0; i < numeros.length; ++i){
            numeros[i] = numerosB[i];
	}
        
        long depois = System.nanoTime() - antes;
        return depois;
    }
    private int maiorNumero(int[] a, int n) {           //Função para achar o maior número
        int max = a[0];  
        for(int i = 1; i<n; i++) {  
            if(a[i] > max)  
            max = a[i];  
        }  
        return max;  
    }
//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//=//
}