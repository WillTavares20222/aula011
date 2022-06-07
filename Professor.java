package com.mycompany.aula011;
public final class Professor extends Aluno{
    //Atributos
    private String especialidade;
    private int salario;
    
    //Metodos
    public void Professor(){
        System.out.println("===================Professor============");
    }
    public void receberAumento(int aum){
         this.salario += am;
        System.out.println(" Meu aumento desse mês foi de " + this.salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
