package br.com.filipe.restAssured.restAssured;

import static com.jayway.restassured.RestAssured.baseURI;

import org.junit.Test;

import br.com.filipe.restAssured.validaDadosEndPoint.ValidaDadosPaises;

public class App 
{
	ValidaDadosPaises paises = new ValidaDadosPaises();
	public App() {
		baseURI = "http://services.groupkt.com/";
	}
	
	@Test
    public void verificarSeExistePais(){
		String country = "ALA";
		paises.hasCountry(country);
    }
	
	@Test 
	public void validarTotalDePaises(){
		int total = 249;
		paises.verificarQuantidadeTotal(total);
	}
	
	@Test 
	public void pesquisarItemDentroDoCountryCode(){ //busca conteúdo dentro do country e tipo de parâmetro informado 
		String countryCode = "IND";
		String item = "AP";
		String tipoitem = "abbr";
		paises.pesquisarItem(countryCode, item, tipoitem);
	}
}
