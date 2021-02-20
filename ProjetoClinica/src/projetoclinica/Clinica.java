
package projetoclinica;

import java.util.Scanner;
import java.util.Vector;

public class Clinica {
    public Vector<Paciente> pac = new Vector<>();
    public Vector<Medico> med = new Vector<>();
    public Vector<AtendimentoMedico> atend = new Vector<>();

    public Clinica() {
    }
    
    public void cadastraPaciente(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do paciente ");
        String nome = teclado.nextLine();
        System.out.println("Informe o CPF do paciente ");
        double CPF = teclado.nextDouble();
        System.out.println("Informe a data de nascomento do paciente ");
        String dataNasc = teclado.nextLine();
        System.out.println("Informe o plano de saúde do paciente ");
        String plano = teclado.nextLine();
        System.out.println("Informe o horario da consulta do paciente ");
        String horaConsulta = teclado.nextLine();
        System.out.println("Informe o email do paciente ");
        String email = teclado.nextLine();
        System.out.println("Informe o telefone do paciente ");
        double tel = teclado.nextDouble();
        this.pac.add(new Paciente(CPF,nome, dataNasc, plano, horaConsulta,email,tel));
        
    }   
    public void cadastraMedico(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome do medico ");
        String nome = teclado.nextLine();
        System.out.println("Informe o CPF do medico ");
        double CPF = teclado.nextDouble();
        System.out.println("Informe a data de nascomento do medico ");
        String dataNasc = teclado.nextLine();
        System.out.println("Informe a especializacao do medico ");
        String esp = teclado.nextLine();
        System.out.println("Informe o sala do medico ");
        String sala = teclado.nextLine();
        System.out.println("Informe o email do medico ");
        String email = teclado.nextLine();
        System.out.println("Informe o telefone do medico ");
        double tel = teclado.nextDouble();
        System.out.println("Informe o numero de registro no conselho regional de medicina do medico ");
        int nreg = teclado.nextInt();
        this.med.add(new Medico(CPF, nome, dataNasc, esp, sala, email, tel, nreg));
    }
    public void atendimento(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o horario da consulta ");
        double hora = teclado.nextDouble();
        System.out.println("Informe a data da consulta ");
        String data = teclado.nextLine();
        System.out.println("Informe a anamnese do paciente ");
        String anam = teclado.nextLine();
        System.out.println("Informe o sala do medico ");
        String sala = teclado.nextLine();
        System.out.println("Informe os exames do paciente ");
        String exames = teclado.nextLine();
        System.out.println("Informe o diagnostico ");
        String diag = teclado.nextLine();
        System.out.println("Informe o numero de registro no conselho regional de medicina do medico ");
        int nreg = teclado.nextInt();
        this.atend.add(new AtendimentoMedico(hora, data, exames, exames, diag, data));
    }
}
