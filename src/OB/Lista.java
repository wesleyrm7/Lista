package OB;

import javax.swing.JOptionPane;

public class Lista {
	
	private No inicio,fim;
	
	public Lista() {
		inicio=fim=null;
		
	}
	
	public void insertInicio() {
		String info=JOptionPane.showInputDialog("Inserindo no inicio ? ");
		this.insertInicio(info);
	}
	private void insertInicio(String info) {
		No novo=new No();
		novo.setInfo(info);
		if(inicio==null) {
			inicio=fim=novo;
		}else {
			inicio.setEsq(novo);
			novo.setDir(inicio);
			inicio=novo;
		}
	}
	public void imprimeI() {
		No aux=inicio;
		while(aux!=null) {
			System.out.println(aux.getInfo());
			aux=aux.getDir();
		}
	}
	public void excluiI() {
		if(inicio==fim) {
			inicio=fim=null;
		}else {
			inicio=inicio.getDir();
			inicio.getEsq().setDir(null);
			inicio.setEsq(null);
		}
	}
	public void insertFim() {
		String info=JOptionPane.showInputDialog("Inserindo no Fim ? ");
		this.insertFim(info);
	}
	private void insertFim(String info) {
		No novo=new No();
		novo.setInfo(info);
		if(inicio==null) {
			inicio=fim=novo;
		}else {
			novo.setEsq(fim);
			novo.getEsq().setDir(novo);
			fim=novo;
		}
	}
	public void imprimeF() {
		No aux=fim;
		while(aux!=null) {
			System.out.println(aux.getInfo());
			aux=aux.getEsq();
		}
	}
	public void excluiF() {
		if(inicio==fim) {
			inicio=fim=null;
		}else {
			fim=fim.getEsq();
			fim.getDir().setEsq(null);
			fim.setDir(null);
		}
	}
	public int Count() {
		No aux=inicio;
		int contador=0;
		while(aux!=null){
			contador++;
			aux=aux.getDir();
		}
	
		return contador;
	}
	
	public void excluiPosicao() {
		int posicao=Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao"));
		this.excluiPosicao(posicao);
	}
	
	private void excluiPosicao(int posicao) {
		if(inicio!=null) {
			if(posicao>0 && posicao<=this.Count()) {
				if(posicao==1)
					this.excluiI();
				else if(posicao==this.Count())
					this.excluiF();
				else {
					No aux=inicio;
					for(int i=1 ; i<posicao ; i++)
						aux=aux.getDir();
						aux.getDir().setEsq(aux.getEsq());
						aux.getEsq().setDir(aux.getDir());
						aux.setEsq(null);
						aux.setDir(null);
					}

			}else {
				System.out.println("Posicao Invalida");
			}
		}else {
			System.out.println("Lista esta vazai Nao excluo Nada");
		}
	}
	
	public void excluiInfo() {
		String info=JOptionPane.showInputDialog("Informe o valor Para I excluir");
		this.excluiInfo(info);
	}
	private void excluiInfo(String info) {
		No aux=inicio;
		int contador=0;
		while(aux!=null) {
			contador++;
			   
			   if(info.equals(aux.getInfo())) { 
				  this.excluiPosicao(contador);
			  }
			aux=aux.getDir();
		}	
	}
}






















