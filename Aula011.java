package com.mycompany.aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Classe Principal
        Visitante v1 = new Visitante();
        v1.Visitante();
        v1.setNome("Jonathan");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        Professor p1 = new Professor();
        p1.setNome("Tania");
        p1.setIdade(70);
        p1.setMatricula(20223155);
        p1.setSexo("F");
        p1.setCurso("Informatica");
        p1.Professor();
        p1.receberAumento(1500);
        System.out.println(p1.toString());
        
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Aluno a1 = new Aluno();
        a1.setNome("Willian");
        a1.setMatricula(20223021);
        a1.setCurso("Informatica");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.Aluno();
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(20223022);
        b1.setNome("Tainara");
        b1.setIdade(22);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.Bolsista();
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        tecnico t1 = new tecnico();
        t1.Tecnico();
        t1.setCurso("POO");
        t1.setMatricula(20223023);
        t1.setNome("Juca");
        t1.setSexo("M");
        t1.praticar();
        t1.setIdade(23);
        System.out.println(t1.toString());
    }
}
