public class BrincandoComOrdenacao {
    public static void main(String[] args) {

        //int vetor1[] = new int[5000];
        //int vetor1[] = new int[10000];
        //int vetor1[] = new int[15000];
         
        
        /*CRESCENTE: 
        
        for (int i = 0; i < vetor.length; i++){
            vetor1[i] = i;
        }
        
        */
        
        /*DECRESCENTE: 
        
        for (int i = 1; i < vetor.length; i++){
            vetor1[i-1] = vetor.length - i;
        }
        
        */

        /*ALEATÓRIO:*/
        int vetor1[] = {47,5000,23,6,27,42,30,40,10,12,32,27,42,29,31,1,47,9,48,16,27,40,31,42,46,18,33,14,49,3,23,0,10,0,3,9,40,20,16,28,14,21,8,49,0,12,49,33,40,13,0,7,31,19,30,19,6,31,2,3,33,45,45,41,29,42,22,33,9,16,38,29,25,3,8,9,13,0,3,17,19,26,4,12,25,8,29,18,27,41,34,7,33,44,41,32,14,15,45,32,23,35,38,35,28,2,36,26,34,49,33,18,0,1,8,19,40,6,40,3,17,42,0,40,11,8,13,22,25,42,45,0,14,49,45,16,45,1,41,28,26,19,40,17,21,18,26,43,48,25,26,32,29,40,5,34,7,15,5,13,0,30,33,1,28,18,23,14,16,33,12,12,25,29,30,28,27,13,27,42,34,47,15,21,41,42,43,5,11,21,40,1,1,34,33,7,2,27,3,26,43,26,21,28,43,11,34,12,18,2,12,44,28,6,4,36,8,38,39,5,16,12,14,5,23,24,25,0,21,29,13,11,8,19,34,3,12,39,10,15,41,43,26,46,49,8,34,32,32,23,2,5,1,49,1,43,29,41,13,18,38,18,17,16,19,46,9,32,14,24,39,19,13,9,48,43,15,26,36,23,28,29,45,2,6,19,14,43,32,30,31,26,12,32,18,8,29,46,19,34,37,4,36,14,9,12,7,14,7,16,7,13,5,4,3,25,10,32,21,29,17,1,22,46,1,38,27,9,26,23,5,45,49,2,29,11,44,47,48,30,6,35,33,29,16,8,39,5,5,46,25,15,48,46,38,38,28,47,29,19,9,29,16,2,28,30,4,49,0,39,3,11,30,26,8,1,12,17,36,7,49,22,39,34,32,49,26,20,44,17,35,6,25,9,10,21,4,7,3,27,39,12,22,20,14,30,2,42,27,45,32,34,38,19,11,7,24,42,10,29,7,18,27,36,43,3,27,34,40,7,32,22,27,25,18,8,16,47,6,42,36,24,16,0,39,8,40,14,49,23,33,33,46,40,47,19,8,47,22,30,22,48,30,17,33,37,4,25,37,12,6,34,39,34,12,29,40,38,41,41,17,6,6,25,34,0,22,46,20,29,20,4,12,8,30,16,24,12,32,43,38,32,4,2,30,14,20,33,4,33,49,1,29,10,9,24,35,15,6,17,32,45,13,22,27,30,9,28,11,26,2,2,9,32,3,26,37,32,28,31,35,34,22,5,4,37,28,35,47,15,44,46,38,22,7,29,9,38,3,44,0,14,39,24,46,39,19,36,46,44,18,10,30,40,36,27,23,36,34,48,11,10,27,2,24,13,25,18,25,17,3,12,37,15,5,3,16,31,45,49,12,43,30,45,24,17,32,23,15,17,13,43,20,22,29,43,41,30,44,42,6,35,43,13,45,45,21,20,39,24,16,46,5,42,39,26,15,24,48,43,34,4,1,33,21,26,6,46,48,37,30,1,27,23,47,18,8,12,13,25,26,1,22,33,44,35,29,7,30,42,31,39,10,42,24,16,37,26,31,31,13,25,37,3,27,3,35,0,42,46,16,45,30,36,41,27,41,39,45,31,47,45,37,14,46,21,18,48,43,49,13,40,17,2,6,26,46,6,23,12,22,20,47,28,28,32,16,24,20,31,35,5,49,48,48,35,36,29,13,16,1,37,16,39,21,28,0,49,43,0,48,31,34,30,20,32,2,32,46,30,3,25,25,7,19,2,35,39,29,39,39,43,29,25,34,3,9,31,20,36,43,5,3,3,48,13,10,8,22,27,2,35,32,6,8,49,7,47,0,6,37,43,38,29,44,48,11,36,48,23,47,22,18,3,1,20,33,7,5,47,0,30,24,40,20,18,35,47,18,41,49,14,39,43,36,33,37,31,47,47,33,28,48,34,12,19,41,5,32,34,30,19,42,4,29,44,30,20,43,41,4,13,48,21,33,15,21,18,6,14,37,26,46,36,4,31,20,39,29,35,49,18,20,35,37,49,39,42,36,15,7,45,2,39,14,49,6,16,3,27,18,32,24,49,14,43,20,42,46,36,14,13,39,33,9,12,24,32,41,48,29,18,14,5,47,5,6,26,1,0,30,9,33,20,31,24,43,23,12,15,22,4,47,1,27,15,46,49,36,38,38,18,36,14,35,33,11,10,38,1,32,31,46,34,6,27,36,14,35,44,39,48,4,24,41,43,5,39,41,16,10,36,3,32,22,35,19,49,35,45,9,7,38,44,42,47,37,16,24,42,33,0,8,26,49,16,36,46,14,19,18,14,16,17,9,11,20,39,36,9,37,48,28,10,28,28,27,18,5,34,31,32,40,19,27,46,31,22,26,6,17,16,0,38,36,12,5,26,40,14,43,14,36,33,34,18,3,19,32,42,47,35,33,3,3,5,30,18,36,38,32,31,30,29,16,19,20,17,48,30,30,36,21,16,36,20,35,33,32,39,47,37,5,28,12,43,47,49,1,47,27,46,15,33,45,3,25,16,3,45,12,3,34,26,1,32,27,26,39,24,29,14,1,22,32,17,48,39,44,43,42,30,19,20,0,42,46,21,38,13,23,46,19,44,28,17,27,15,33,9,35,48,49,47,46,30,44,29,46,29,12,34,0,3,36,1,27,10,21,47,1,15,15,8,10,42,8,12,14,20,23,13,13,26,8,45,12,6,10,38,24,14,30,41,0,35,33,12,4,27,23,8,1,39,37,34,5,1,0,14,0,3,40,2,8,0,39,26,26,33,18,41,25,46,20,2,20,1,33,14,27,2,9,9,12,32,14,44,46,32,35,19,5,23,37,17,38,27,19,16,47,24,32,4,27,7,0,33,16,22,31,26,10,11,42,10,28,3,24,3,5,40,15,25,48,14,28,20,20,9,32,48,11,46,30,49,1,0,23,5,43,22,29,34,4,24,28,5,28,36,41,42,29,27,27,1,19,1,49,1,0,13,22,25,23,6,46,24,28,27,39,45,9,2,48,10,4,49,30,42,2,47,18,6,18,18,35,14,41,47,46,39,46,15,15,40,2,11,17,0,7,41,8,31,1,8,3,41,19,43,4,27,8,13,40,49,26,31,22,37,5,44,29,40,19,37,32,23,42,39,30,11,11,14,18,19,34,38,19,24,24,43,40,35,37,35,24,2,42,43,14,30,48,44,5,42,24,13,30,11,34,48,22,43,22,42,19,10,25,4,34,15,8,10,8,35,37,5,41,28,11,8,27,4,48,13,13,15,17,49,21,28,37,24,39,10,15,11,29,38,43,38,37,32,35,10,38,8,19,5,3,18,44,37,6,40,38,11,11,5,4,19,12,48,3,42,15,14,9,12,28,22,35,15,29,24,26,40,26,32,28,18,36,27,0,28,5,20,24,10,41,22,43,2,25,34,36,34,2,5,46,30,32,47,43,7,35,43,37,17,16,16,41,49,24,1,11,16,36,19,28,4,47,6,34,35,41,0,43,38,31,33,47,8,21,41,10,6,24,11,47,14,41,45,43,4,26,48,32,7,22,33,36,26,19,1,39,24,18,6,48,27,8,36,23,39,15,37,30,38,15,3,43,13,24,6,38,40,0,41,18,12,8,37,18,13,31,42,32,31,12,31,48,25,39,30,43,8,2,26,20,48,39,43,7,15,23,20,38,46,34,4,2,21,13,42,41,16,31,49,49,17,34,27,37,1,10,30,38,2,10,43,1,34,46,19,3,11,1,7,3,29,32,34,24,1,12,10,17,21,44,24,32,0,29,34,46,43,13,42,3,30,39,10,26,41,44,20,20,37,7,45,16,48,32,20,45,12,7,24,30,30,18,37,1,9,4,28,29,34,0,21,15,32,43,6,48,30,31,12,33,42,19,13,8,32,29,8,6,20,43,5,24,28,39,21,15,46,48,17,34,38,13,1,48,47,23,23,44,36,28,21,40,1,36,28,9,8,37,42,27,49,37,7,12,0,38,45,46,26,37,46,49,16,35,39,39,3,0,15,27,3,24,26,49,18,47,19,47,42,15,19,46,45,16,45,5,26,35,38,44,35,45,28,11,6,33,5,29,47,30,18,28,16,39,47,0,33,2,21,42,11,6,6,34,7,24,32,21,13,8,38,42,8,10,21,18,13,0,46,44,39,8,46,6,4,15,11,13,15,12,10,26,29,49,1,19,12,35,34,27,22,3,27,28,0,5,28,46,14,22,14,28,35,16,19,9,5,41,17,10,0,18,16,25,40,20,43,31,2,8,37,25,17,7,40,5,39,29,41,2,1,22,19,44,27,22,1,7,37,3,27,6,13,33,5,9,20,24,1,0,49,2,40,31,10,42,33,28,46,38,20,33,5,16,48,47,45,44,30,38,39,49,33,16,39,0,0,2,5,11,13,39,2,39,23,6,36,40,4,39,24,43,18,46,43,1,44,41,36,10,16,20,9,3,21,32,14,2,45,4,23,10,27,33,1,19,33,28,22,17,2,48,14,49,21,6,24,29,32,36,25,14,29,2,34,2,10,47,21,33,6,21,25,10,30,36,49,34,19,8,4,6,44,1,43,11,0,48,1,12,15,20,24,0,47,26,38,17,9,19,11,39,10,31,43,15,36,17,17,46,7,24,39,38,28,8,16,12,37,6,14,30,6,3,28,4,21,9,1,14,17,10,23,15,32,23,3,27,30,16,35,18,15,7,48,40,39,20,9,12,37,30,48,23,23,0,1,24,2,49,0,33,38,16,11,3,27,36,20,14,3,5,29,7,4,25,14,17,42,35,44,9,37,37,0,10,29,23,20,21,18,46,41,25,37,40,26,1,16,45,16,7,46,29,44,10,18,49,38,7,11,16,44,42,33,47,37,5,12,35,12,27,28,14,49,21,43,41,32,13,39,41,40,43,31,44,42,20,30,17,32,46,28,18,4,14,47,9,48,13,19,3,45,19,22,23,33,20,32,32,24,41,48,2,33,12,5,26,9,37,14,4,34,43,34,15,18,40,15,35,23,1,36,8,5,0,42,13,42,16,49,1,31,46,31,22,13,48,20,9,22,29,32,37,21,9,9,34,41,2,30,37,21,43,44,6,22,23,3,4,3,35,21,1,27,34,18,18,48,28,26,47,30,11,23,0,43,34,32,19,43,14,12,15,40,24,23,11,40,23,5,21,0,47,5,16,26,1,11,8,3,8,25,0,10,11,29,47,38,14,21,11,3,1,43,3,32,11,14,1,26,30,0,2,37,42,35,20,9,4,11,23,37,13,25,8,47,23,0,14,45,35,34,49,18,47,17,43,38,24,36,25,27,5,38,6,35,16,27,24,10,24,10,0,21,23,42,7,31,44,41,39,22,19,5,48,45,44,39,0,14,37,13,41,1,48,10,49,46,6,34,27,27,17,11,16,48,40,35,37,13,27,16,24,27,35,13,23,1,35,26,16,19,16,23,9,31,12,10,0,26,4,40,32,27,31,39,28,24,27,36,34,18,34,42,42,35,26,32,27,1,31,12,24,0,7,48,15,25,17,8,34,1,44,43,35,42,10,24,0,19,18,28,39,22,4,23,32,23,47,17,35,9,18,38,44,3,29,20,46,5,32,13,2,27,31,31,13,49,17,39,4,8,31,49,48,48,27,28,3,5,49,27,31,38,21,30,12,35,20,42,29,49,12,34,4,11,30,38,47,22,39,39,2,3,27,16,29,10,40,35,31,29,3,23,21,41,26,3,38,41,8,39,3,17,24,6,6,29,49,0,0,34,27,41,30,9,12,8,44,49,45,10,24,18,12,42,10,47,16,38,39,12,11,18,48,35,1,18,40,23,13,22,34,40,12,2,45,2,10,9,22,25,21,40,15,27,18,37,48,25,35,23,39,46,14,25,22,24,40,49,37,1,1,17,11,42,11,20,26,37,30,40,37,12,37,30,26,4,33,30,21,9,2,32,17,15,24,42,46,20,25,16,33,28,34,4,33,38,34,37,23,6,40,7,23,31,30,34,7,47,4,37,25,45,42,45,8,32,30,0,45,17,29,13,26,46,39,49,19,14,21,36,47,42,10,21,31,29,19,19,1,33,32,13,30,28,14,21,34,10,34,6,37,23,0,4,27,5,33,7,45,45,41,47,40,40,9,10,18,34,37,0,12,46,33,43,36,13,24,45,46,7,24,32,32,10,37,37,47,40,15,10,24,28,16,39,9,20,6,33,15,46,1,21,38,34,15,3,39,3,37,48,35,35,16,49,17,22,49,26,43,41,17,22,26,33,11,29,39,32,42,4,29,42,23,37,31,4,31,47,16,37,11,18,48,2,31,12,13,4,43,40,48,39,33,19,30,46,22,36,3,48,47,44,10,31,40,17,19,3,10,3,10,47,44,4,17,29,12,26,21,38,41,8,12,36,28,28,48,22,20,48,9,6,22,14,28,22,2,15,30,14,8,20,44,30,9,25,38,0,24,16,25,12,3,49,2,19,12,26,10,40,3,31,6,12,10,3,20,13,25,2,18,47,2,14,17,1,11,48,28,8,12,5,4,25,21,31,10,33,21,43,26,3,4,24,18,19,23,30,49,49,30,39,48,14,35,42,31,1,47,37,5,31,17,11,24,37,40,9,36,40,31,7,48,28,37,36,45,37,36,42,41,21,0,27,27,44,43,45,21,14,37,38,19,37,20,13,31,22,39,4,34,9,28,36,13,7,23,25,16,29,16,25,15,10,20,34,41,18,7,10,14,30,5,40,1,17,13,16,45,36,32,21,6,22,41,3,3,48,7,37,11,8,18,8,1,18,18,25,7,9,14,48,41,49,23,13,7,9,22,44,37,14,47,24,31,27,11,47,17,47,6,33,27,28,14,2,49,20,5,3,14,35,16,21,21,42,17,3,10,13,5,43,29,2,28,31,29,5,12,49,29,21,49,12,49,13,12,46,8,45,4,42,37,26,11,25,11,13,28,36,43,32,49,12,34,1,3,48,14,6,18,13,35,42,42,15,39,36,23,25,39,44,36,28,37,38,32,27,28,7,42,7,33,11,3,38,19,33,17,34,21,29,39,6,45,38,32,11,38,35,15,3,45,30,20,42,21,11,39,41,3,25,0,33,16,36,13,33,31,37,46,33,27,45,37,19,11,28,48,2,10,1,26,17,12,14,7,13,43,5,4,22,27,16,44,31,37,35,23,22,12,44,35,6,19,32,24,24,0,18,10,0,5,47,25,1,45,31,3,49,41,35,37,7,19,26,29,4,23,35,39,34,49,1,30,45,49,29,47,46,45,1,25,46,3,3,9,36,19,18,23,9,20,32,10,33,26,31,15,17,12,24,31,38,12,30,21,40,38,37,8,43,46,27,49,24,9,11,24,15,6,23,35,18,12,11,36,13,10,8,43,49,26,3,12,38,6,9,27,12,36,22,12,43,6,10,44,33,23,14,8,49,10,47,44,17,31,15,26,23,14,23,21,0,29,30,47,17,47,4,40,49,4,26,44,26,16,38,14,48,16,25,31,3,7,8,30,1,42,32,35,16,46,28,0,29,29,12,27,6,26,1,21,38,33,27,30,31,48,40,29,3,17,18,4,2,1,46,9,27,45,20,3,24,3,14,43,5,35,30,7,37,18,2,47,19,21,18,9,40,28,21,46,3,29,32,27,4,31,4,44,21,11,47,8,20,15,6,14,30,47,15,10,29,35,38,33,8,8,6,23,35,11,16,37,3,0,0,49,37,25,15,29,19,23,24,19,35,30,49,41,38,2,30,27,32,11,32,36,34,39,43,24,30,8,5,6,4,7,33,9,17,42,17,29,27,5,19,26,42,37,36,20,5,9,25,7,29,21,20,25,39,35,29,48,49,8,33,2,30,8,40,18,3,19,46,6,10,9,41,28,38,15,47,23,7,18,25,8,33,24,43,33,44,12,39,45,17,25,4,9,22,18,14,42,6,1,45,7,29,40,34,8,33,3,4,26,19,40,3,20,33,7,12,6,16,3,27,14,25,20,46,27,19,39,33,2,44,28,41,43,46,35,6,25,25,28,25,40,36,39,30,1,48,31,15,25,10,6,34,32,22,40,41,4,40,7,42,43,44,7,45,33,34,30,36,34,16,29,20,40,6,35,3,44,36,40,26,41,0,46,44,24,40,20,21,32,2,23,32,36,36,17,42,26,21,1,17,13,41,18,33,2,11,36,13,10,34,36,17,8,17,47,48,40,49,37,20,35,20,19,29,0,3,48,31,40,13,26,38,5,22,0,48,18,30,49,12,25,26,46,40,28,17,13,31,4,28,43,3,38,27,1,28,42,35,4,2,6,44,10,10,31,23,44,49,20,3,17,31,45,36,1,19,17,35,39,32,38,37,18,35,21,14,11,21,38,7,47,41,7,44,49,10,45,16,18,17,33,25,12,1,13,16,3,18,10,41,10,45,14,27,24,29,22,14,12,15,38,25,1,25,37,36,45,2,49,15,10,10,0,42,25,22,17,41,44,44,43,41,36,37,27,30,13,33,28,36,37,17,18,9,22,14,35,3,34,33,32,2,2,21,7,12,20,44,14,13,28,48,22,26,47,33,43,41,18,2,17,19,12,4,31,46,46,43,12,25,25,43,29,24,7,48,38,28,17,42,2,28,27,24,24,34,38,43,49,36,38,16,18,39,5,18,16,46,26,43,30,29,32,29,19,33,44,23,28,27,12,44,42,47,23,32,30,40,32,41,9,1,44,31,44,48,42,4,10,5,39,28,30,7,16,26,29,15,40,24,24,1,12,46,20,17,13,18,36,45,14,47,37,19,41,39,24,5,11,28,15,0,18,22,14,11,37,30,30,35,3,19,44,19,1,34,48,32,26,16,11,15,9,40,27,44,25,2,26,37,30,38,26,18,40,45,42,37,4,7,33,32,29,3,17,0,5,33,22,6,15,28,7,27,33,35,34,18,15,20,22,12,21,34,34,30,27,4,10,49,16,3,21,14,47,8,36,7,32,21,19,13,35,41,49,45,10,49,5,45,34,15,45,48,3,30,44,23,19,26,27,34,36,12,29,10,14,37,13,48,39,1,15,16,6,28,45,37,46,0,30,36,5,37,1,12,37,3,31,35,44,20,6,39,49,22,44,33,0,14,44,8,10,49,1,16,27,43,36,14,14,37,5,20,46,4,49,48,37,1,27,36,37,44,49,46,46,22,7,2,26,20,19,5,2,38,32,19,21,40,49,17,13,10,24,3,1,23,34,1,11,26,44,44,5,9,10,10,6,36,25,31,30,1,44,2,11,23,38,32,3,49,14,31,10,44,48,30,48,26,27,8,38,2,33,13,10,17,24,37,18,11,35,14,45,36,23,45,37,1,7,11,44,11,14,35,24,48,45,18,25,40,42,30,20,28,34,14,5,15,2,47,30,28,29,10,40,35,20,17,10,12,3,13,16,8,31,41,19,40,28,34,13,34,23,27,30,7,32,24,13,25,6,36,3,15,1,47,19,38,41,32,15,25,22,7,48,47,24,48,38,38,29,3,39,45,37,31,38,16,48,36,19,18,15,0,7,14,1,6,47,13,23,1,41,48,43,37,43,8,29,46,23,14,9,14,11,37,13,15,30,46,48,19,1,45,29,17,19,27,0,45,33,14,17,27,32,37,3,28,29,24,47,7,35,14,4,26,26,42,22,38,5,6,28,20,3,41,11,47,45,29,40,3,44,18,18,34,1,42,29,41,42,14,8,26,38,24,6,18,19,2,40,15,45,48,9,46,16,3,4,46,24,26,20,49,17,35,33,11,46,33,36,49,34,25,29,37,11,25,48,8,22,46,37,32,19,17,16,37,41,30,44,22,11,40,6,37,39,15,44,7,38,22,48,25,20,12,15,28,31,7,22,7,35,34,22,34,31,14,34,17,10,11,14,1,8,8,28,23,26,29,18,36,0,47,22,13,24,20,4,21,10,44,4,45,38,20,13,12,43,35,32,10,16,12,3,34,0,26,9,36,10,12,40,20,39,5,5,38,1,15,46,42,17,0,38,27,17,34,9,13,12,35,32,8,27,28,5,24,49,25,42,25,10,31,20,13,27,7,40,21,19,7,37,13,22,31,26,23,19,31,49,47,3,45,3,45,14,47,46,22,15,49,32,24,33,5,34,47,27,45,39,25,1,44,32,18,20,38,23,25,33,40,9,11,3,48,39,15,15,28,33,33,43,21,46,37,34,28,41,20,6,48,45,34,27,20,7,42,45,14,24,6,6,9,34,37,35,11,41,35,31,49,38,0,26,23,48,46,43,17,40,35,7,45,39,28,47,21,40,32,49,0,31,36,35,39,49,9,9,37,43,34,25,37,25,43,18,32,39,28,43,40,30,0,8,45,29,12,16,42,7,29,13,24,19,21,9,20,9,42,39,5,34,43,31,14,30,28,25,29,2,37,21,19,45,21,30,19,39,8,1,19,4,9,39,24,23,27,5,23,29,7,49,22,36,43,14,33,43,8,30,30,1,4,42,45,40,27,44,4,23,39,16,35,10,5,7,24,24,32,12,4,20,12,12,34,27,43,43,39,36,37,33,8,25,44,7,2,42,48,12,33,13,46,22,4,26,13,31,3,3,45,30,29,7,48,31,25,15,13,23,24,3,9,10,10,29,19,1,37,6,18,28,45,0,33,9,0,17,47,41,8,29,20,20,37,2,25,18,18,15,25,5,41,27,25,35,27,41,25,0,25,1,6,16,1,0,43,41,8,43,8,15,2,18,24,27,0,14,11,23,4,11,26,36,9,15,5,25,14,10,45,47,38,25,40,27,27,16,17,12,2,46,10,44,28,18,37,38,28,24,20,1,3,8,7,19,0,22,17,35,38,44,14,9,2,43,39,31,11,29,0,4,32,28,20,18,27,33,46,5,26,42,5,2,28,34,24,45,2,31,27,28,3,32,33,3,1,47,12,5,34,3,22,45,24,18,47,36,2,26,26,3,35,40,47,20,27,4,33,2,30,41,16,41,14,46,7,36,30,32,7,44,45,37,15,42,27,2,19,6,21,14,33,39,9,2,20,2,39,19,0,10,36,41,9,46,15,19,15,15,27,39,3,30,49,28,15,33,34,24,15,1,4,12,43,4,22,38,0,44,7,9,44,16,2,25,43,42,2,21,40,0,16,43,11,41,32,24,36,26,34,41,43,23,4,37,23,30,26,47,14,1,42,7,17,38,37,9,12,21,26,0,31,31,13,17,32,2,0,12,9,12,9,21,36,11,26,5,16,38,46,21,22,15,22,15,40,2,1,29,40,10,0,10,38,6,27,32,31,46,33,47,32,42,15};
        int vetor2[] = vetor1.clone();
        int vetor3[] = vetor1.clone();
        int vetor4[] = vetor1.clone();
        int vetor5[] = vetor1.clone();
        int vetor6[] = vetor1.clone();
        
        Ordenacao_IF o = new Ordenacao();
        
        long tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.selectionSort (vetor1); } System.out.println(tempo/50);
        
        tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.insertionSort (vetor2); } System.out.println(tempo/50);
        
        tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.mergeSort (vetor3); } System.out.println(tempo/50);
        
        tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.quickSort (vetor4); } System.out.println(tempo/50);
        
        tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.quickSort_shuffle (vetor5); } System.out.println(tempo/50);
        
        tempo = 0;
        for (int i = 0; i < 50; i++){ tempo += o.countingSort (vetor6); } System.out.println(tempo/50);
        
        //System.out.println("Selection Sort:     " + o.selectionSort     (vetor1) + " nanossegundos");
        //System.out.println("Insertion Sort:     " + o.insertionSort     (vetor2) + " nanossegundos");
        //System.out.println("Merge Sort:         " + o.mergeSort         (vetor3) + " nanossegundos");
        //System.out.println("Quick Sort:         " + o.quickSort         (vetor4) + " nanossegundos");
        //System.out.println("Quick Sort Shuffle: " + o.quickSort_shuffle (vetor5) + " nanossegundos");
        //System.out.println("Counting Sort:      " + o.countingSort      (vetor6) + " nanossegundos");
    }
}
