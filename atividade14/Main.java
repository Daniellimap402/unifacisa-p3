package atividade14;

public class Main {
	public static void main(String[] args) {
		BinaryTree binareTree = new BinaryTree();
		binareTree.inserir(4);
		binareTree.inserir(2);
		binareTree.inserir(1);
		binareTree.inserir(3);
		binareTree.inserir(6);
		binareTree.inserir(5);
		binareTree.inserir(7);
		
		binareTree.posOrdem(binareTree.getRaiz());
	}
}
