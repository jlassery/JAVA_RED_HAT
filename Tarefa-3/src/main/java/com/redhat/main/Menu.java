package com.redhat.main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Menu {

	public void iniciaMenu(ArrayList<Gerente> listaGerente,ArrayList<Supervisor> listaSupervisor,ArrayList<DevJunior> listaDevJunior,ArrayList<DevPleno> listaDevPleno){
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Selecione a opção desejada abaixo:");
		System.out.println("1. Criar");
		System.out.println("2. Ler");
		System.out.println("3. Alterar");
		System.out.println("4. Buscar");
		System.out.println("5. Deletar");
		System.out.println("6. Sair");
		
		int selecao= scanner.nextInt();
		scanner.nextLine();
		int cargo=0;
		String nome=null;
		
		//SELEÇÃO DE UMA DAS OPÇÕES DO MENU
		switch(selecao) {
		case 1: // INSERÇÃO DO NOVO FUNCIONÁRIO
			System.out.println("Insira o tipo do novo funcionário:");
			System.out.println("1.Gerente - 2.Supervisor - 3.DevPleno - 4.DevJunior - 0.Voltar");
			int tipo=scanner.nextInt();
			scanner.nextLine();
			switch(tipo) {
			case 1:
				this.criaGerente(listaGerente);
				break;
			case 2:
				this.criaSupervisor(listaSupervisor);
				break;
			case 3:
				this.criaDevPleno(listaDevPleno);
				break;
			case 4:
				this.criaDevJunior(listaDevJunior);
				break;
			case 0:
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
			
			default:
				System.out.println("Opção inválida");
				this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
			}
			System.out.println("Funcionário criado com sucesso!\n");
			System.out.println("------------------------------------------------------------------\n");
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno); //PARA VOLTAR SEMPRE AO MENU INICIAL 
			break;
		case 2: //LISTAGEM DE TODOS OS FUNCIONÁRIOS
			System.out.println("============================");
			System.out.println("Gerentes:");
			this.lerListaGerentes(listaGerente);
			System.out.println("============================");
			System.out.println("Supervisores:");
			this.lerListaSupervisor(listaSupervisor);
			System.out.println("============================");
			System.out.println("Desenvolvedores Pleno:");
			this.lerListaDevPleno(listaDevPleno);
			System.out.println("============================");
			System.out.println("Desenvolvedores Júnior:");
			this.lerListaDevJunior(listaDevJunior);
			System.out.println("-----------------------------------------------------------------\n");
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
			break;
		case 3: //EDITAR O FUNCIONÁRIO
			System.out.println("Selecione o cargo:");
			System.out.println("1.Gerente - 2.Supervisor - 3.DevPleno - 4.DevJunior - 0.Voltar");
			cargo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println("Insira o nome do funcionário:");
			nome = scanner.nextLine();
			System.out.println("Escolha o atributo:");
			int atributo=0;
			switch(cargo) { //EDIÇÃO DO ATRIBUTO DE ACORDO COM O TIPO DE FUNCIONÁRIO
			case 1:
				System.out.println("1.Nome\n2.Sobrenome\n3.Endereço\n4.Telefone\n5.Celular\n6.Dependente\n7.Salário ");
				atributo=scanner.nextInt();
				scanner.nextLine();
				this.editaGerente(listaGerente,nome, atributo);
				System.out.println("Dado alterado com sucesso!");
				break;
			case 2:
				System.out.println("1.Nome\n2.Sobrenome\n3.Endereço\n4.Telefone\n5.Celular\n6.Dependente\n7.Salário\n8.Equipe\n9.Setor");
				atributo=scanner.nextInt();
				scanner.nextLine();
				this.editaSupervisor(listaSupervisor,nome, atributo);
				System.out.println("Dado alterado com sucesso!");
				break;
			case 3:
				System.out.println("1.Nome\n2.Sobrenome\n3.Endereço\n4.Telefone\n5.Celular\n6.Dependente\n7.Salário\n8.Equipe\n9.Setor\n10.Linguagem");
				atributo=scanner.nextInt();
				scanner.nextLine();
				this.editaDevPleno(listaDevPleno,nome, atributo);
				System.out.println("Dado alterado com sucesso!");
				break;
			case 4:
				System.out.println("1.Nome\n2.Sobrenome\n3.Endereço\n4.Telefone\n5.Celular\n6.Dependente\n7.Salário\n8.Equipe\n9.Setor\n10.Linguagem");
				atributo=scanner.nextInt();
				scanner.nextLine();
				this.editaDevJunior(listaDevJunior,nome, atributo);
				System.out.println("Dado alterado com sucesso!");
				break;
			case 0:
				this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
				
			default:
				System.out.println("Opção inválida");
			}
			System.out.println("");
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
			break;
		case 4: // BUSCA FUNCIONÁRIO ESPECÍFICO POR NOME
			System.out.println("Selecione o cargo:");
			System.out.println("1.Gerente - 2.Supervisor - 3.DevPleno - 4.DevJunior - 0.Voltar");
			cargo= scanner.nextInt();
			scanner.nextLine();
			System.out.println("Insira o nome do funcionário:\n");
			nome = scanner.nextLine();
			switch(cargo) {
			case 1:
				this.buscaGerente(listaGerente, nome);
				break;
			case 2:
				this.buscaSupervisor(listaSupervisor, nome);
				break;
			case 3:
				this.buscaDevPleno(listaDevPleno, nome);
				break;
			case 4:
				this.buscaDevJunior(listaDevJunior, nome);
				break;
			case 0 :
				this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);

			default:
				System.out.println("Opção inválida");
			}
			System.out.println("-----------------------------------------------------------------\n");
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
			break;
		case 5: //DELETA O FUNCIONÁRIO 
			System.out.println("O que deseja deletar?\n1.Funcionário\n2.Grupo\n3.Todos\n0.Voltar");
			int opcao= scanner.nextInt();
			if(opcao==1) { // DELETA SÓ 1 FUNCIONÁRIO
				System.out.println("Insira o cargo:");
				System.out.println("1.Gerente - 2.Supervisor - 3.DevPleno - 4.DevJunior");
				cargo= scanner.nextInt();
				scanner.nextLine();
				System.out.println("Insira o nome do funcionário:");
				nome = scanner.nextLine();
				switch(cargo) {
				case 1:
					this.deleteGerente(listaGerente, nome);
					break;
				case 2:
					this.deleteSupervisor(listaSupervisor, nome);
					break;
				case 3:
					this.deleteDevPleno(listaDevPleno, nome);
					break;
				case 4:
					this.deleteDevJunior(listaDevJunior, nome);
					break;
				default:
					System.out.println("Opção inválida");
				}
				
			}
			else if(opcao==2) { // DELETE POR GRUPO
				System.out.println("Selecione o grupo:");
				System.out.println("1.Gerente - 2.Supervisor - 3.DevPleno - 4.DevJunior");
				cargo= scanner.nextInt();
				scanner.nextLine();
				switch(cargo) {
				case 1:
					listaGerente.clear();
					break;
				case 2:
					listaSupervisor.clear();
					break;
				case 3:
					listaDevPleno.clear();
					break;
				case 4:
					listaDevJunior.clear();
					break;
				default:
					System.out.println("Opção inválida");
				}
			}
			else if(opcao==3) { // DELETA TODOS 
				listaGerente.clear();
				listaSupervisor.clear();
				listaDevPleno.clear();
				listaDevJunior.clear();
				
			}
			else if(opcao==0) {
				this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno); 
				
			}
			else {
				System.out.println("Opção inválida");
			}
			
			System.out.println("-----------------------------------------------------------------\n");
			this.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno); 
			break;
		case 6: //FINALIZA O PROGRAMA
			System.out.println("Saindo...");
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida");
		}
		
	}
	
	
	
	//INSERINDO NOVO USUÁRIO
	private void criaGerente(ArrayList<Gerente> listaGerente) {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("TODOS OS ATRIBUTOS SÃO OBRIGATÓRIOS!");
		Gerente gerente = new Gerente();
		System.out.println("Insira o nome:");
		gerente.setNome(scanner.nextLine());
		System.out.println("Insira o sobrenome:");
		gerente.setSobrenome(scanner.nextLine());
		System.out.println("Insira o endereço:");
		gerente.setEndereco(scanner.nextLine());
		System.out.println("Insira o celular:");
		gerente.setCelular(scanner.nextLine());
		System.out.println("Insira os dependentes separados por vírgula:");
		gerente.setDependentes(scanner.nextLine().split(","));
		System.out.println("Insira o salario:");
		gerente.setSalario(scanner.nextFloat());
		listaGerente.add(gerente);
	}
			
	private void criaSupervisor(ArrayList<Supervisor> listaSupervisor){
		Scanner scanner = new Scanner(System.in);
		Supervisor supervisor = new Supervisor();
		System.out.println("Insira o nome:");
		supervisor.setNome(scanner.nextLine());
		System.out.println("Insira o sobrenome:");
		supervisor.setSobrenome(scanner.nextLine());
		System.out.println("Insira o endereço:");
		supervisor.setEndereco(scanner.nextLine());
		System.out.println("Insira o celular:");
		supervisor.setCelular(scanner.nextLine());
		System.out.println("Insira os dependentes separados por vírgula:");
		supervisor.setDependentes(scanner.nextLine().split(","));
		System.out.println("Insira o salario:");
		supervisor.setSalario(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Insira o setor:");
		supervisor.setSetor(scanner.nextLine());
		System.out.println("Insira o equipe:");
		supervisor.setEquipe(scanner.nextLine());
		listaSupervisor.add(supervisor);
		}
	private void criaDevPleno(ArrayList<DevPleno> listaDevPleno){
		DevPleno devPleno = new DevPleno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o nome:");
		devPleno.setNome(scanner.nextLine());
		System.out.println("Insira o sobrenome:");
		devPleno.setSobrenome(scanner.nextLine());
		System.out.println("Insira o endereço:");
		devPleno.setEndereco(scanner.nextLine());
		System.out.println("Insira o celular ");
		devPleno.setCelular(scanner.nextLine());
		System.out.println("Insira os dependentes separados por vírgula:");
		devPleno.setDependentes(scanner.nextLine().split(","));
		System.out.println("Insira o salario :");
		devPleno.setSalario(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Insira o setor :");
		devPleno.setSetor(scanner.nextLine());
		System.out.println("Insira o equipe ");
		devPleno.setEquipe(scanner.nextLine());
		System.out.println("Insira as linguagens separadas por vírgula:");
		devPleno.setLinguagem(scanner.nextLine().split(","));
		listaDevPleno.add(devPleno);
	}
			
	private void criaDevJunior(ArrayList<DevJunior> listaDevJunior){
		DevJunior devJunior = new DevJunior();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o nome:");
		devJunior.setNome(scanner.nextLine());
		System.out.println("Insira o sobrenome:");
		devJunior.setSobrenome(scanner.nextLine());
		System.out.println("Insira o endereço:");
		devJunior.setEndereco(scanner.nextLine());
		System.out.println("Insira o celular ");
		devJunior.setCelular(scanner.nextLine());
		System.out.println("Insira os dependentes separados por vírgula:");
		devJunior.setDependentes(scanner.nextLine().split(","));
		System.out.println("Insira o salario :");
		devJunior.setSalario(scanner.nextFloat());
		scanner.nextLine();
		System.out.println("Insira o setor :");
		devJunior.setSetor(scanner.nextLine());
		System.out.println("Insira o equipe ");
		devJunior.setEquipe(scanner.nextLine());
		System.out.println("Insira as linguagens separadas por vírgula:");
		devJunior.setLinguagem(scanner.nextLine().split(","));
		listaDevJunior.add(devJunior);
	}
	//LENDO USUÁRIOS
	private void lerListaGerentes(ArrayList<Gerente> listaGerente) {
		for (Gerente gerente: listaGerente) {
			System.out.println("----------------------");
			gerente.checarCadastro();
		}
	}
	private void lerListaSupervisor(ArrayList<Supervisor> listaSupervisor) {
		for (Supervisor supervisor: listaSupervisor) {
			System.out.println("----------------------");
			supervisor.checarCadastro();
			

		}
	}
	private void lerListaDevPleno(ArrayList<DevPleno> listaDevPleno) {
		for (DevPleno devPleno: listaDevPleno) {
			System.out.println("----------------------");
			devPleno.checarCadastro();
			

		}
	}
	private void lerListaDevJunior(ArrayList<DevJunior> listaDevJunior) {
		for (DevJunior devJunior: listaDevJunior) {
			System.out.println("----------------------");
			devJunior.checarCadastro();
		}
	}
	
	//EDITANDO USUÁRIO:

	private void editaGerente(ArrayList<Gerente> listaGerente,String nome, int atr) {
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		for(int i=0;i<listaGerente.size();i++) {	
			if(nome.equalsIgnoreCase(listaGerente.get(i).getNome())) {
				cont++;
				switch(atr) {
				case 1:
					System.out.println("Insira o novo nome:");
					listaGerente.get(i).setNome(scanner.nextLine());
					break;
				case 2:
					System.out.println("Insira o novo sobrenome:");
					listaGerente.get(i).setSobrenome(scanner.nextLine());
					break;
				case 3:
					System.out.println("Insira o novo endereço:");
					listaGerente.get(i).setEndereco(scanner.nextLine());
					break;
				case 4:
					System.out.println("Insira o novo telefone:");
					listaGerente.get(i).setTelefone(scanner.nextLine());
					break;
				case 5:
					System.out.println("Insira o novo celular:");
					listaGerente.get(i).setCelular(scanner.nextLine());
					break;
				case 6:
					System.out.println("Insira o novo dependente:");
					listaGerente.get(i).setDependentes(scanner.nextLine().split(","));
					break;
				case 7:
					System.out.println("Insira o novo salário:");
					listaGerente.get(i).setSalario(scanner.nextFloat());
					break;
				default:
					System.out.println("Opção inválida");
				}
			}

		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void editaSupervisor(ArrayList<Supervisor> listaSupervisor,String nome, int atr) {
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		for(int i=0;i<listaSupervisor.size();i++) {	
			if(nome.equalsIgnoreCase(listaSupervisor.get(i).getNome())) {
				cont++;
				switch(atr) {
				case 1:
					System.out.println("Insira o novo nome:");
					listaSupervisor.get(i).setNome(scanner.nextLine());
					break;
				case 2:
					System.out.println("Insira o novo sobrenome:");
					listaSupervisor.get(i).setSobrenome(scanner.nextLine());
					break;
				case 3:
					System.out.println("Insira o novo endereço:");
					listaSupervisor.get(i).setEndereco(scanner.nextLine());
					break;
				case 4:
					System.out.println("Insira o novo telefone:");
					listaSupervisor.get(i).setTelefone(scanner.nextLine());
					break;
				case 5:
					System.out.println("Insira o novo celular:");
					listaSupervisor.get(i).setCelular(scanner.nextLine());
					break;
				case 6:
					System.out.println("Insira o novo dependente:");
					listaSupervisor.get(i).setDependentes(scanner.nextLine().split(","));
					break;
				case 7:
					System.out.println("Insira o novo salário:");
					listaSupervisor.get(i).setSalario(scanner.nextFloat());
					break;
					
				case 8:
					System.out.println("Insira a nova equipe:");
					listaSupervisor.get(i).setEquipe(scanner.nextLine());
					break;
				case 9:
					System.out.println("Insira o novo setor:");
					listaSupervisor.get(i).setSetor(scanner.nextLine());
					break;
				default:
					System.out.println("Opção inválida");
				}
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void editaDevPleno(ArrayList<DevPleno> listaDevPleno,String nome, int atr) {
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		for(int i=0;i<listaDevPleno.size();i++) {
			if(nome.equalsIgnoreCase(listaDevPleno.get(i).getNome())) { //COMPARAÇÃO DE STRING
				cont++;
				switch(atr) {
				case 1:
					System.out.println("Insira o novo nome:");
					listaDevPleno.get(i).setNome(scanner.nextLine());
					break;
				case 2:
					System.out.println("Insira o novo sobrenome:");
					listaDevPleno.get(i).setSobrenome(scanner.nextLine());
					break;
				case 3:
					System.out.println("Insira o novo endereço:");
					listaDevPleno.get(i).setEndereco(scanner.nextLine());
					break;
				case 4:
					System.out.println("Insira o novo telefone:");
					listaDevPleno.get(i).setTelefone(scanner.nextLine());
					break;
				case 5:
					System.out.println("Insira o novo celular:");
					listaDevPleno.get(i).setCelular(scanner.nextLine());
					break;
				case 6:
					System.out.println("Insira o novo dependente:");
					listaDevPleno.get(i).setDependentes(scanner.nextLine().split(","));
					break;
				case 7:
					System.out.println("Insira o novo salário:");
					listaDevPleno.get(i).setSalario(scanner.nextFloat());
					break;
				case 8:
					System.out.println("Insira a nova equipe:");
					listaDevPleno.get(i).setEquipe(scanner.nextLine());
					break;
				case 9:
					System.out.println("Insira o novo setor:");
					listaDevPleno.get(i).setSetor(scanner.nextLine());
					break;
				case 10:
					System.out.println("Insira as novas linguagens:");
					listaDevPleno.get(i).setLinguagem(scanner.nextLine().split(","));
					break;
				default:
					System.out.println("Opção inválida");
				}
			}
		}
		if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void editaDevJunior(ArrayList<DevJunior> listaDevJunior,String nome, int atr) {
		Scanner scanner = new Scanner(System.in);
		int cont = 0;
		for(int i=0;i<listaDevJunior.size();i++) {	
			if(nome.equalsIgnoreCase(listaDevJunior.get(i).getNome())) {
				cont++;
				switch(atr) {
				case 1:
					System.out.println("Insira o novo nome:");
					listaDevJunior.get(i).setNome(scanner.nextLine());
					break;
				case 2:
					System.out.println("Insira o novo sobrenome:");
					listaDevJunior.get(i).setSobrenome(scanner.nextLine());
					break;
				case 3:
					System.out.println("Insira o novo endereço:");
					listaDevJunior.get(i).setEndereco(scanner.nextLine());
					break;
				case 4:
					System.out.println("Insira o novo telefone:");
					listaDevJunior.get(i).setTelefone(scanner.nextLine());
					break;
				case 5:
					System.out.println("Insira o novo celular:");
					listaDevJunior.get(i).setCelular(scanner.nextLine());
					break;
				case 6:
					System.out.println("Insira o novo dependente:");
					listaDevJunior.get(i).setDependentes(scanner.nextLine().split(","));
					break;
				case 7:
					System.out.println("Insira o novo salário:");
					listaDevJunior.get(i).setSalario(scanner.nextFloat());
					break;
				case 8:
					System.out.println("Insira a nova equipe:");
					listaDevJunior.get(i).setEquipe(scanner.nextLine());
					break;
				case 9:
					System.out.println("Insira o novo setor:");
					listaDevJunior.get(i).setSetor(scanner.nextLine());
					break;
				case 10:
					System.out.println("Insira as novas linguagens:");
					listaDevJunior.get(i).setLinguagem(scanner.nextLine().split(","));
					break;
				default:
					System.out.println("Opção inválida");
				}
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	
// FAZENDO A BUSCA
	
	private void buscaGerente(ArrayList<Gerente> listaGerente,String nome) {
		int cont = 0;
		for(int i=0;i<listaGerente.size();i++) {	
			if(nome.equalsIgnoreCase(listaGerente.get(i).getNome())) {
				cont++;
				listaGerente.get(i).checarCadastro();
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void buscaSupervisor(ArrayList<Supervisor> listaSupervisor,String nome) {
		int cont = 0;
		for(int i=0;i<listaSupervisor.size();i++) {	
			if(nome.equalsIgnoreCase(listaSupervisor.get(i).getNome())) {
				cont++;
				listaSupervisor.get(i).checarCadastro();
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void buscaDevPleno(ArrayList<DevPleno> listaDevPleno,String nome) {
		int cont = 0;
		for(int i=0;i<listaDevPleno.size();i++) {	
			if(nome.equalsIgnoreCase(listaDevPleno.get(i).getNome())) {
				cont++;
				listaDevPleno.get(i).checarCadastro();
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void buscaDevJunior(ArrayList<DevJunior> listaDevJunior,String nome) {
		int cont = 0;
		for(int i=0;i<listaDevJunior.size();i++) {	
			if(nome.equalsIgnoreCase(listaDevJunior.get(i).getNome())) {
				cont++;
				listaDevJunior.get(i).checarCadastro();
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	
	//DELETANDO 
	
	private void deleteGerente(ArrayList<Gerente> listaGerente,String nome) {
		int cont = 0;
		for(int i=0;i<listaGerente.size();i++) {	
			if(nome.equalsIgnoreCase(listaGerente.get(i).getNome())) {
				cont++;
				listaGerente.get(i).checarCadastro();
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void deleteSupervisor(ArrayList<Supervisor> listaSupervisor,String nome) {
		int cont = 0;
		for(int i=0;i<listaSupervisor.size();i++) {	
			if(nome.equalsIgnoreCase(listaSupervisor.get(i).getNome())) {
				cont++;
				listaSupervisor.remove(i);
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void deleteDevPleno(ArrayList<DevPleno> listaDevPleno,String nome) {
		int cont = 0;
		for(int i=0;i<listaDevPleno.size();i++) {	
			if(nome.equalsIgnoreCase(listaDevPleno.get(i).getNome())) {
				cont++;
				listaDevPleno.remove(i);
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}
	private void deleteDevJunior(ArrayList<DevJunior> listaDevJunior,String nome) {
		int cont = 0;
		for(int i=0;i<listaDevJunior.size();i++) {	
			if(nome.equalsIgnoreCase(listaDevJunior.get(i).getNome())) {
				cont++;
				listaDevJunior.remove(i);
			}
		}if (cont==0) {
			System.out.println("Funcionário não existe!");
		}
	}

	
}



