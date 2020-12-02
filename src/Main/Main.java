package Main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import OB.Lista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Lista lista=new Lista();
		
		int stop=0;
	
		do {
			stop=Integer.parseInt(JOptionPane.showInputDialog("Entre com a opcao"+
					"\n 1 - Insert Inicio"+
					"\n 2 - Imprime Inicio"+
					"\n 3 - Exclui Inicio"+
					"\n 4 - Count"+
					"\n 5 - Exclui Info"
					
					));
			switch(stop) {
			case 1:
				lista.insertInicio();break;
			case 2:
				System.out.println("---------------");
				lista.imprimeI();
				System.out.println("-----------------");break;
			case 3:
				lista.excluiI();break;
			case 4:
				
				lista.Count();break;
			case 5:
				lista.excluiInfo();break;
			}
			
		}while(stop!=6);
		System.out.println("Programa Finalizado ");
	
	}

}
