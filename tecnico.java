package com.mycompany.aula011;
public final class tecnico extends Aluno {
    //Atributos
    private int resgProfissonal;
    
    
    //Metodos
    public void Tecnico(){
        System.out.println("=====================Tecnico=================");
    }
    public void praticar(){
        System.out.println(" Estou Praticando " + this.getNome());
    }

    public int getResgProfissonal() {
        return resgProfissonal;
    }

    public void setResgProfissonal(int resgProfissonal) {
        this.resgProfissonal = resgProfissonal;
    }
    
}
