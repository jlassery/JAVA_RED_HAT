package com.redhat.main;

import java.util.Scanner;
import java.util.ArrayList;
import com.redhat.main.Menu;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Gerente> listaGerente = new ArrayList<Gerente>();
		ArrayList<Supervisor> listaSupervisor= new ArrayList<Supervisor>();
		ArrayList<DevPleno> listaDevPleno= new ArrayList<DevPleno>();
		ArrayList<DevJunior> listaDevJunior = new ArrayList<DevJunior>();
		Menu menu = new Menu();
		menu.iniciaMenu(listaGerente, listaSupervisor, listaDevJunior, listaDevPleno);
	}
}
