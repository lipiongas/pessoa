package model.vo;

import java.time.LocalDate;

public class PessoaVO {
	
	private int idPessoa;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private byte[] imagem;
	
	public PessoaVO(int idPessoa, String nome, String cpf, LocalDate dataNascimento, byte[] imagem) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.imagem = imagem;
	}

	public PessoaVO() {
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	

}
