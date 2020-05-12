import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestePilha {

	@Test
	void testIsEqualTo() {
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Conta c = new Conta(3,3,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		pilha.push(c);
		
		Pilha pilha2 = new Pilha();
		Conta e = new Conta(1,1,"daniel");
		Conta f = new Conta(2,2,"daniel");
		Conta g = new Conta(3,3,"daniel");
		pilha2.push(e);
		pilha2.push(f);
		pilha2.push(g);
		
		Assertions.assertTrue(pilha.isEqualTo(pilha2));
		
	}
	
	@Test
	void test2IsEqualTo() {
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);	
		
		Pilha pilha2 = new Pilha();
		Conta e = new Conta(1,1,"daniel");
		pilha2.push(e);
		
		Assertions.assertTrue(pilha.isEqualTo(pilha2));
		
	}

	@Test
	void testPop()
	{
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		
		Assertions.assertTrue(b==pilha.pop());
	}
	
	@Test
	void test2Pop()
	{
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		
		Assertions.assertTrue(a==pilha.pop());
	}
	

	@Test
	void testPeek()
	{
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		
		Assertions.assertTrue(b==pilha.peek());
	}
	
	@Test
	void test2Peek()
	{
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		
		Assertions.assertTrue(a==pilha.peek());
	}
	
	@Test
	void testPush()
	{
		Conta a = new Conta(1,1,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		Assertions.assertTrue(a==pilha.peek());
	}
	
	@Test
	void test2Push()
	{
		Conta a = new Conta(1,1,"daniel");
		Conta b = new Conta(2,2,"daniel");
		Pilha pilha = new Pilha();
		pilha.push(a);
		pilha.push(b);
		Assertions.assertTrue(b==pilha.peek());
	}
}
