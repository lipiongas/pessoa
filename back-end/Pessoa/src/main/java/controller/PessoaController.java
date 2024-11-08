package controller;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.MediaType;
import model.bo.PessoaBO;

public class PessoaController {
	
	@POST
	@PATH("/cadastrar")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@produces(MediaType.APPLICATION_JSON)
	public PessoaVO cadastrarPessoaController(@FormDataParam("file") inputStream fileInputStream,
			@FormDataParam("file") FormDataContentDisposition fileMetaData,
			@FormDataParam("PessoaVO") InputStream pessoaInputStream) throws exception {
		PessoaBO pessoaBO = new PessoaBO();
	}
	

}
