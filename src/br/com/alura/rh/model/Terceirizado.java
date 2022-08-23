package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Terceirizado extends Funcionario{

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizado(DadosPessoais dadosPessoais, LocalDate dataUltimoReajuste) {
        super(dadosPessoais, dataUltimoReajuste);
    }


    @Override
    public void promover(Cargo novoCargo) {
        super.promover(novoCargo);
    }

    @Override
    public void atualizarSalario(BigDecimal novoSalario) {
        super.atualizarSalario(novoSalario);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
