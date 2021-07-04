package br.com.keeggo.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "br.com.keeggo.test.steps" }, tags =
		"@RealizarCadastro" )
public class Runner {

}
