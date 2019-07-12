package com.redhat.main;

import java.util.Arrays;

public class DevJunior extends Funcionario implements CadastroFuncionario{
	private String setor;
	private String equipe;
	private String[] linguagem;
	
	public void pedirAjuda(DevPleno dev) {
	
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String[] getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String[] linguagem) {
		this.linguagem = linguagem;
	}

	public void checarCadastro(){
		if(!"".equalsIgnoreCase(this.getNome())) {
			System.out.println("Nome:"+ this.getNome());
		}
		if(!"".equalsIgnoreCase(this.getSobrenome())) {
			System.out.println("Sobrenome:"+ this.getSobrenome());
		}
		if(!"".equalsIgnoreCase(this.getEndereco())) {
			System.out.println("Endereço:"+ this.getEndereco());
		}
		if(!"".equalsIgnoreCase(this.getTelefone())) {
			System.out.println("Telefone:"+ this.getTelefone());
		}
		if(!"".equalsIgnoreCase(this.getCelular())) {
			System.out.println("Celular:"+ this.getCelular());
		}
		if(this.getDependentes()!= null) {
			System.out.println("Dependentes:"+ Arrays.toString(this.getDependentes()));
		}
		if(this.getSalario()!= 0){
			System.out.println("Salario:"+ this.getSalario());
		}
		if(!"".equalsIgnoreCase(this.getSetor())) {
			System.out.println("Setor: " + this.getSetor());
		}
		if(!"".equalsIgnoreCase(this.getEquipe())) {
			System.out.println("Equipe: " + this.getEquipe());
		}
		if(this.getLinguagem()!= null) {
			System.out.println("Linguagens: " + Arrays.toString(this.getLinguagem()));
		}
	}
}
