package com.mycompany.aula011;
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Metodos
    public void Aluno(){
        System.out.println("==================Aluno==============");
    }
    
    public void pagarMensalidade(){
        
        System.out.println(" Pagando Mensalidade do Aluno " + this.getNome());
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
