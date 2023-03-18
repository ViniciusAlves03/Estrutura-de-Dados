package Projeto;

import java.util.Scanner;

public class Semana {
    public static Scanner Sc = new Scanner(System.in);
    
    private String nome;
    private String segunda;
    private String terca;
    private String quarta;
    private String quinta;
    private String sexta;
    private String sabado;
    private String domingo;
    
    public String getSegunda() {
        return segunda;
    }
    public void setSegunda(String segunda) {
        this.segunda = segunda;
    }
    public String getTerca() {
        return terca;
    }
    public void setTerca(String terca) {
        this.terca = terca;
    }
    public String getQuarta() {
        return quarta;
    }
    public void setQuarta(String quarta) {
        this.quarta = quarta;
    }
    public String getQuinta() {
        return quinta;
    }
    public void setQuinta(String quinta) {
        this.quinta = quinta;
    }
    public String getSexta() {
        return sexta;
    }
    public void setSexta(String sexta) {
        this.sexta = sexta;
    }
    public String getSabado() {
        return sabado;
    }
    public void setSabado(String sabado) {
        this.sabado = sabado;
    }
    public String getDomingo() {
        return domingo;
    }
    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }
    
    @Override
    public String toString() {
        return "semana [segunda=" + segunda + ", terca=" + terca + ", quarta=" + quarta + ", quinta=" + quinta
                + ", sexta=" + sexta + ", sabado=" + sabado + ", domingo=" + domingo + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Semana criarRotina(){

        String treino, nome;
        Rotina rotina = new Rotina();
        Semana semana = new Semana();

        System.out.print("Nome: ");
        nome = Sc.nextLine();
        System.out.println("");
        semana.setNome(nome);

        for (int i = 1; i < 8; i++) {

            if(i == 1){
                System.out.println("Segunda");
            }else if(i == 2){
                System.out.println("Terça");
            }else if(i == 3){
                System.out.println("Quarta");
            }else if(i == 4){
                System.out.println("Quinta");
            }else if(i == 5){
                System.out.println("Sexta");
            }else if(i == 6){
                System.out.println("Sábado");
            }else{
                System.out.println("Domingo");
            }
        
            System.out.print("Exercício: ");
            treino = Sc.nextLine();
            rotina.setExercicio1(treino);
            System.out.print("Exercício: ");
            treino = Sc.nextLine();
            rotina.setExercicio2(treino);
            System.out.print("Exercício: ");
            treino = Sc.nextLine();
            rotina.setExercicio3(treino);
            System.out.print("Exercício: ");
            treino = Sc.nextLine();
            rotina.setExercicio4(treino);
            System.out.print("Exercício: ");
            treino = Sc.nextLine();
            rotina.setExercicio5(treino);
            System.out.println("");

            if(i == 1){
                semana.setSegunda(rotina.toString());
            }else if(i == 2){
                semana.setTerca(rotina.toString());
            }else if(i == 3){
                semana.setQuarta(rotina.toString());
            }else if(i == 4){
                semana.setQuinta(rotina.toString());
            }else if(i == 5){
                semana.setSexta(rotina.toString());
            }else if(i == 6){
                semana.setSabado(rotina.toString());
            }else{
                semana.setDomingo(rotina.toString());
            }
        }
        return semana;
    }
    
}
