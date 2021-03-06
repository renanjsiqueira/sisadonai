/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eugeniosolucoes.view.model;

import br.com.eugeniosolucoes.util.MyStrings;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author eugenio
 */
public class DadosBoletoPagoModel {

    private String matricula;

    private String aluno;

    private String nossoNumero;

    private Double valor;

    private Date vencimento;
    
    private Date pagamento;

    private String numeroMensalidade;
    
    private boolean atualizado;
    
    private String formaPagamento;

    public DadosBoletoPagoModel() {
    }

    public DadosBoletoPagoModel( String matricula, String aluno, 
            String nossoNumero, Double valor, Date vencimento, Date pagamento,
            String numeroMensalidade, String formaPagamento ) {
        this.matricula = matricula;
        this.aluno = aluno;
        this.nossoNumero = nossoNumero;
        this.valor = valor;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
        this.numeroMensalidade = numeroMensalidade;
        this.formaPagamento = formaPagamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula( String matricula ) {
        this.matricula = matricula;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno( String aluno ) {
        this.aluno = aluno;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero( String nossoNumero ) {
        Integer numero = Integer.valueOf( nossoNumero );
        this.nossoNumero = MyStrings.padLeft( 10, numero );
    }

    public String getNumeroDocumento() {
        return String.format( "%s-%s", this.matricula, this.numeroMensalidade );
    }

    public Double getValor() {
        return valor;
    }

    public void setValor( Double valor ) {
        this.valor = valor;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento( Date pagamento ) {
        this.pagamento = pagamento;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento( Date vencimento ) {
        this.vencimento = vencimento;
    }
    
    public String getNumeroMensalidade() {
        return numeroMensalidade;
    }

    public void setNumeroMensalidade( String numeroMensalidade ) {
        this.numeroMensalidade = numeroMensalidade;
    }

    public boolean isAtualizado() {
        return atualizado;
    }

    public void setAtualizado( boolean atualizado ) {
        this.atualizado = atualizado;
    }

    public boolean isBoletoValido() {
        return Long.valueOf( this.nossoNumero ) != 0L;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento( String formaPagamento ) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode( this.matricula );
        hash = 29 * hash + Objects.hashCode( this.nossoNumero );
        return hash;
    }

    @Override
    public boolean equals( Object obj ) {
        if ( this == obj ) {
            return true;
        }
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final DadosBoletoPagoModel other = (DadosBoletoPagoModel) obj;
        if ( !Objects.equals( this.matricula, other.matricula ) ) {
            return false;
        }
        return Objects.equals( this.nossoNumero, other.nossoNumero );
    }

    @Override
    public String toString() {
        return "DadosBoletoPagoModel{" + "matricula=" + matricula + ", aluno=" + aluno + ", nossoNumero=" + nossoNumero + ", valor=" + valor + ", pagamento=" + pagamento + ", numeroMensalidade=" + numeroMensalidade + ", atualizado=" + atualizado + '}';
    }
}
