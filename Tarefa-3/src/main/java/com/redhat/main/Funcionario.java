package com.redhat.main;


public class Funcionario{
	
	private String nome;
	private String sobrenome;
	private String endereco;
	private String telefone;
	private String celular;
	private String[] dependentes;
	private float salario;
	
	//GETTERS
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCelular() {
		return celular;
	}
	public String[] getDependentes() {
		return dependentes;
	}
	public float getSalario() {
		return salario;
	}
	//SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setDependentes(String[] dependentes) {
		this.dependentes = dependentes;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	

}