import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testGetPessoa() {
		Pessoa pessoa = new PessoaFisica("João", "Rua aracaju", "joao@site.com");
		Cliente cliente = new Cliente(pessoa);
		assertEquals(pessoa, cliente.getPessoa());
	}

}
