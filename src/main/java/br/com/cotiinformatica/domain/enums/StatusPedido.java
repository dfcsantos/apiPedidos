package br.com.cotiinformatica.domain.enums;

public enum StatusPedido {
	NOVO,PROCESSANDO,ENVIADO,ENTREGUE,CANCELADO;

	public static StatusPedido fromInt(Integer source) {
		if (source == null) {
			return null;
		}
		
		switch (source) {
			case 0: return NOVO;
			case 1: return PROCESSANDO;
			case 2: return ENVIADO;
			case 3: return ENTREGUE;
			case 4: return CANCELADO;
			default: throw new IllegalArgumentException("StatusPedido inválido: " + source);
		}
	}
	
	
}
