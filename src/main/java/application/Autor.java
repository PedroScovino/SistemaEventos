/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Pedro
 */
public class Autor implements Comparable<Autor> {

    int ordem;
    String email;
    String nomePrimeiro;
    String nomeMeio;
    String sobrenome;
    String afiliacao;
    String afiliacaoEn;
    String pais;
    String registro;

    public Autor(int ordem, String email, String nomePrimeiro, String nomeMeio, String sobrenome, String afiliacao, String afiliacaoEn, String pais, String registro) {
        this.ordem = ordem;
        this.email = email;
        this.nomePrimeiro = nomePrimeiro;
        this.nomeMeio = nomeMeio;
        this.sobrenome = sobrenome;
        this.afiliacao = afiliacao;
        this.afiliacaoEn = afiliacaoEn;
        this.pais = pais;
        this.registro = registro;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomePrimeiro() {
        return nomePrimeiro;
    }

    public void setNomePrimeiro(String nomePrimeiro) {
        this.nomePrimeiro = nomePrimeiro;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public String getAfiliacaoEn() {
        return afiliacaoEn;
    }

    public void setAfiliacaoEn(String afiliacaoEn) {
        this.afiliacaoEn = afiliacaoEn;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Override
    public int compareTo(Autor outroAutor) {
        if (this.ordem < outroAutor.getOrdem()) {
            return -1;
        } else if (this.ordem > outroAutor.getOrdem()) {
            return 1;
        }
        return 0;
    }
}
