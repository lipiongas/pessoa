package model.dto;

import java.time.LocalDate;

public class PessoaDTO {
	
	private int idPessoa;
	private String nome;
	private String cpf;
	private int idade;
	private byte[] imagem;
	
	public PessoaDTO(int idPessoa, String nome, String cpf, LocalDate dataNascimento, byte[] imagem) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.imagem = imagem;
	}

	public PessoaDTO() {
		super();
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getidade() {
		return idade;
	}

	public int setidade(int idade) {
		return this.idade = idade;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	

}
