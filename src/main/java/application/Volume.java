/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pedro
 */

public class Volume {
    
    String sigla;
    int numEdicao;
    String cidade;
    String dataInicio;
    String descricaoPt;
    String descricaoEn;
    ArrayList<Artigo> artigos = new ArrayList<>();
        
    public Volume(String sigla, int numEdicao, String cidade, String dataInicio, String descricaoPt, String descricaoEn) {
        this.sigla = sigla;
        this.numEdicao = numEdicao;
        this.cidade = cidade;
        this.dataInicio = dataInicio;
        this.descricaoPt = descricaoPt;
        this.descricaoEn = descricaoEn;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDescricaoPt() {
        return descricaoPt;
    }

    public void setDescricaoPt(String descricaoPt) {
        this.descricaoPt = descricaoPt;
    }

    public String getDescricaoEn() {
        return descricaoEn;
    }

    public void setDescricaoEn(String descricaoEn) {
        this.descricaoEn = descricaoEn;
    }
    
    public void ordenaArtigos(){
        Collections.sort(artigos);
    }
    
    /*public void testSort(){
        
        Artigo a1 = new Artigo(3,"PT","Desenvolvimento de Aplicações Corporativas","Business Aplication Development","Teste de Sistema","System Test","Desenvolvimento","Development",20);
        Artigo a2 = new Artigo(1,"EN","Gerenciamento de Projetos","Project Management","Teste de Sistema","System Test","Desenvolvimento","Development",8);
        Artigo a3 = new Artigo(2,"PT","TCC","TCC","Teste de Sistema","System Test","Desenvolvimento","Development",50);
        artigos.add(a1);
        artigos.add(a2);
        artigos.add(a3);
        
        System.out.println("Lista Desordenada:");
        for(Artigo a : artigos){
            System.out.println(a.toString());
        }
        System.out.println("---------------------------");
        Collections.sort(artigos);
        
        System.out.println("Lista Ordenada:");
        for(Artigo a : artigos){
            System.out.println(a.toString());
        }
    }*/
}