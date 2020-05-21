package atividade14;

public class BinaryTree {
	private Node raiz = null;
	public void posOrdem(Node no)
	{
		if(no != null)
		{	
			posOrdem(no.getEsquerda());
			posOrdem(no.getDireita());
			System.out.println(no.getValor()+ " ");
		}
	}
	
	public Node getRaiz()
	{
		return raiz;
	}
	public void inserir(int valor)
	{
		raiz = inserir(raiz,valor);
	}
	private Node inserir(Node no, int valor)
	{
		if(no != null)
		{
			if(valor <= no.getValor() )
			{
				if(no.getEsquerda() != null) 
				{
					inserir(no.getEsquerda(),valor);
				}
				else
				{
					System.out.println("Inserindo " + valor + " a esquerda de " + no.getValor());
					no.setEsquerda(new Node(valor));
				}
			}
			else if(valor> no.getValor())
			{
				if(no.getDireita() != null)
				{
					inserir(no.getDireita(), valor);
				}
				else
				{
					System.out.println("Inserindo "+ valor+" a direita de "+ no.getValor());
					no.setDireita(new Node(valor));
				}
			}
		} 
		else 
		{
			no = new Node(valor);
		}
		return no;
	}
	}

