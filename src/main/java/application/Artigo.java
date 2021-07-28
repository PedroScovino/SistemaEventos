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
public class Artigo implements Comparable<Artigo>{

    int ordem;
    String idioma;
    String titulo;
    String tituloEn;
    String resumo;
    String resumoEn;
    String palavraChave;
    String palavraChaveEn;
    int numPaginas;
    ArrayList<Autor> autores = new ArrayList<>();
    
    public Artigo(int ordem, String idioma, String titulo, String tituloEn, String resumo, String resumoEn, String palavraChave, String palavraChaveEn, int numPaginas) {
        this.ordem = ordem;
        this.idioma = idioma;
        this.titulo = titulo;
        this.tituloEn = tituloEn;
        this.resumo = resumo;
        this.resumoEn = resumoEn;
        this.palavraChave = palavraChave;
        this.palavraChaveEn = palavraChaveEn;
        this.numPaginas = numPaginas;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloEn() {
        return tituloEn;
    }

    public void setTituloEn(String tituloEn) {
        this.tituloEn = tituloEn;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumoEn() {
        return resumoEn;
    }

    public void setResumoEn(String resumoEn) {
        this.resumoEn = resumoEn;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChaveEn() {
        return palavraChaveEn;
    }

    public void setPalavraChaveEn(String palavraChaveEn) {
        this.palavraChaveEn = palavraChaveEn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public void ordenaAutor(){
        Collections.sort(autores);
    }

    @Override
    public int compareTo(Artigo outroArtigo) {
        if(this.ordem < outroArtigo.getOrdem()){
            return -1;
        }else if (this.ordem > outroArtigo.getOrdem()){
            return 1;
        }
        return 0;
    }
}