
public class Pilha {

	private int size;
	private Conta cabeca;
	private Conta cauda;
	
	/**
	 * Push - adciona uma nova conta na pilha
	 * @param novaConta - uma conta a ser inserida na pilha
	 */
	public void push(Conta novaConta) {
		Conta a = cabeca;
		
		if(cabeca == null)
		{
			cabeca = novaConta;
			cauda = cabeca;
		}
		else {
			while(a.proximo != null)
			{
				a = a.proximo;
			}
			a.proximo = novaConta;
			cauda = novaConta;
		}
		size++;
	}
	
	
	/**
	 * remove a ultima conta que foi inserida na pilha
	 * @return a conta a ser removida
	 */
	public Conta pop() {
		
		Conta a = cabeca;
		Conta retorno = cauda;
		while(a.proximo!=cauda)
		{
			a = a.proximo;
		}
		a.proximo = null;
		cauda = a;
		size--;
		return retorno;
		
	}
	
	/**
	 * o metodo retorna a ultima conta que foi inserida sem remove-la
	 * @return a ultima conta que foi inserida
	 */
	public Conta peek() {
		return cauda;
	}

	/**
	 * um metodo para comparar a sua pilha a outra
	 * @param outraPilha - uma pilha para ser comparada
	 * @return se a pilha for igual retorna true caso contrario falso
	 */
	public boolean isEqualTo(Pilha outraPilha) {
		
		Conta a = cabeca;
		Conta b = outraPilha.cabeca;
		if (size != outraPilha.getSize() || a.getNumeroConta()!=b.getNumeroConta()) {
			return false;
		}
		for (int i = 0; i < getSize()-1; i++) {
			if(a.proximo.getNumeroConta()!=b.proximo.getNumeroConta()) {
				return false;
			}
			a = a.proximo;
			b = b.proximo;
		}
		return true;
	}
	
	public Conta getCabeça()
	{
		return cabeca;
	}
	
	public Conta getCauda()
	{
		return cauda;
	}
	
	public int getSize()
	{
		return size;
	}
}
