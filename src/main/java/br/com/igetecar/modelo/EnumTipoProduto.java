package br.com.igetecar.modelo;

public enum EnumTipoProduto {
	PRODUTO_DESTAQUE(1),
	PRODUTO_LANCAMENTO(2);
	
	private final Integer tipo;
	
	EnumTipoProduto(Integer t) {
		tipo = t;
	}

	public Integer getTipo() {
		return tipo;
	}
	
}
