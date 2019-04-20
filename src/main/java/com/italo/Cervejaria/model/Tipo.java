package com.italo.Cervejaria.model;

public enum Tipo {
	NACIONAL("Nacional"),
	IMPORTADO("Importado");
	
	private String descricao;
	
	Tipo(String descricao) {
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
