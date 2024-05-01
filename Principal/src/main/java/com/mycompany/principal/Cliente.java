/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Cliente {
    ArrayList<Cliente> ListaCliente;
    
     private String nome;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
   
    
    public Cliente(){
        ListaCliente = new ArrayList();
    }
     public Cliente(String nome, Long cpf,Long tel,String end,Integer numero,String cidade,String estado){
         this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end;
        this.numero = numero;
        this.cidade = cidade;
        
        ListaCliente = new ArrayList();
         
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

 

    public ArrayList<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

   
   
    
    
}
