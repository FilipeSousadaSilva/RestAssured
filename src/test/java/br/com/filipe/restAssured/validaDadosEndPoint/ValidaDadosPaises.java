package br.com.filipe.restAssured.validaDadosEndPoint;

import org.hamcrest.Matchers;
import com.jayway.restassured.RestAssured;

public class ValidaDadosPaises {
	public void verificarQuantidadeTotal(int total) {
		RestAssured.given().when().get("/country/get/all").then().body("RestResponse.result.alpha3_code",
		Matchers.hasSize(total));	
	}
	
	public void hasCountry(String country) {
		RestAssured.given().when().get("/country/get/all").then().body("RestResponse.result.alpha3_code",
		Matchers.hasItem(country));
	}	
	
	public void pesquisarItem(String countryCode, String item, String tipoitem){
		RestAssured.given().when().get("/state/get/"+countryCode+"/all").then().body("RestResponse.result." + tipoitem,
		Matchers.hasItem(item));
	}
}
