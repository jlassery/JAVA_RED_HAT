package com.redhat.main;

import java.util.Arrays;

public class Gerente extends Funcionario implements CadastroFuncionario{
	
	
	public void aumentarSalario(){

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
		
	}
}
