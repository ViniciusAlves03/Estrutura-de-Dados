package atividade02;

/*
 * Interface para implementação da classe "Ordenacao".
 * O método booleano deve retornar 'false' se 'numeros' não estiver ordenado (crescente). 
 */

public interface Ordenacao_IF {
        boolean checaVetorOrdenado(int[] numeros);  //ok
	
	long selectionSort(int[] numeros);          //ok
	
	long insertionSort(int[] numeros);          //ok
	
	long mergeSort(int[] numeros);              //ok        -Funções auxiliares como privadas.
	
	long quickSort(int[] numeros);              //ok        -Funções auxiliares como privadas.
	
	long quickSort_shuffle(int[] numeros);      //falta
	
	long countingSort(int[] numeros);           //falta

}