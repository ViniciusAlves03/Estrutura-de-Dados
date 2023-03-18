package Projeto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Testes {
    //aqui vão todos os codigos referentes a tabela Json.
    private static ArvoreProjeto a;
        
        @Before
        public void instanciaArvore() throws Exception{
            a = new ArvoreProjeto();
            a.insertIn(1);
            a.insertIn(10);
            a.insertIn(12);
            a.insertIn(17);
            a.insertIn(13);

        }

        @Test
        public void testBuscar() throws Exception{
            a.insertIn(0);
            assertTrue(a.achou(0));
        }

        @Test
        public void testBuscar2() throws Exception{
            assertFalse(a.achou(0));
        }

        @Test
        public void TestDelete() {
            a.deleteThis(1);
            assertFalse(a.achou(1));
        }

        @Test
        public void raiz() {
            assertEquals(10, a.rootPessoa.idCell );
        }

        @Test
        public void testMenorValor() throws Exception{
            assertNotNull(a.mostLeftChild(a.rootPessoa));
        }

        @Test
        public void testAltura() throws Exception{

            int altura = 2;
            assertEquals(altura, a.height(a.rootPessoa));

        }

        @Test
        public void testMenorValor2() throws Exception{
            Pessoa no = a.mostLeftChild(a.rootPessoa);
            assertEquals(1, no.idCell);
        }
   
}
