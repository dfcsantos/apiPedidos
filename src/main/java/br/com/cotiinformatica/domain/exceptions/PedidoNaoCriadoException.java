package br.com.cotiinformatica.domain.exceptions;

public class PedidoNaoCriadoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PedidoNaoCriadoException() {
		super();
	}

	@Override
	public String getMessage() {
		return "O pedido não foi criado";
	}
}

