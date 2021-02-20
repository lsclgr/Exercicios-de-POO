
package projetoclinica;

public class AtendimentoMedico {
    //atributos
    //sinais e sintomas do paciente, exames, diagnostico, prescrição medica(receita), horario, data
    private double horarioConsulta;
    private String dataConsulta;
    private String anamnese;
    private String exames;
    private String diagnostico;
    private String receita;
    
    
    public AtendimentoMedico() {
    }
    
    public AtendimentoMedico(double horarioConsulta, String dataConsulta, String anamnese, String exames, String diagnostico, String receita) {
        this.horarioConsulta = horarioConsulta;
        this.dataConsulta = dataConsulta;
        this.anamnese = anamnese;
        this.exames = exames;
        this.diagnostico = diagnostico;
        this.receita = receita;
    }
    
    public double getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(double horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

}