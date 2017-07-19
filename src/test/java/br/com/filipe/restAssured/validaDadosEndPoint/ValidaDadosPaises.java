package br.com.filipe.restAssured.validaDadosEndPoint;

import junit.framework.TestCase;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import org.springframework.web.client.RestTemplate;

import org.junit.Test;

//import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

public class ValidaDadosPaises extends TestCase {
	
	public ValidaDadosPaises() {
		baseURI = "http://services.groupkt.com/country/get/all";
	}
	
	@Test
	public void testMostrarQuantidadeTotalPaises(){
		String total = "249";
		given()
		.when()
			.get("/")
		.then()
			.assertThat()
			//.body("Result",containsString(total))
		    .statusCode(200)
			.body("name", containsString("Afghanistan"));
		//.body("status", equalTo("success"));
	}
	@Test
	public void testVerificaExistenciaPais() {
		String total = "249";
		System.out.println(total);	
		given()
			.when()
			.get("/")
			.then().log()
				.body()
				.assertThat()
				.body("messages.1", containsString("Total [" + total + "] records found."));
		//.body("status", equalTo("success"));
	}
	
}
