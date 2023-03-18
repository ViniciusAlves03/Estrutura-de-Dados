package Projeto;

public class Pessoa  extends Testes{
    protected int idCell;
    protected int height;
    protected Semana treinos;
    protected Pessoa left; 
    protected Pessoa right;
    protected Pessoa parent;


    Pessoa(int id, Semana semana){
        this.treinos = semana;
        this.idCell = id;
        right = null;
        left = null;

    }
    
}
