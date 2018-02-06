package de.gwdg.metadataqa.openaire;

import com.jayway.jsonpath.InvalidJsonException;
import de.gwdg.metadataqa.api.calculator.CalculatorFacade;
import de.gwdg.metadataqa.api.calculator.CompletenessCalculator;
import de.gwdg.metadataqa.api.calculator.TfIdfCalculator;
import de.gwdg.metadataqa.api.model.EdmFieldInstance;
import de.gwdg.metadataqa.api.schema.Schema;

import java.util.ArrayList;

public class OpenAirCalculatorFacade extends CalculatorFacade {

	@Override
	public void configure() {
		Schema schema = new OpenAireSchema();

		calculators = new ArrayList<>();
		// fieldExtractor = new EdmFieldExtractor(schema);
		// fieldExtractor.abbreviate(abbreviate);
		// calculators.add(fieldExtractor);

		completenessCalculator = new CompletenessCalculator(schema);
		completenessCalculator.setCompleteness(completenessMeasurementEnabled);
		completenessCalculator.setExistence(fieldExistenceMeasurementEnabled);
		completenessCalculator.setCardinality(fieldCardinalityMeasurementEnabled);
		completenessCalculator.collectFields(completenessCollectFields);
		calculators.add(completenessCalculator);

		if (tfIdfMeasurementEnabled) {
			tfidfCalculator = new TfIdfCalculator(schema);
			tfidfCalculator.setDoCollectTerms(collectTfIdfTerms);
			calculators.add(tfidfCalculator);
		}
	}

	@Override
	public String measure(String jsonRecord) throws InvalidJsonException {
		return this.<EdmFieldInstance>measureWithGenerics(jsonRecord);
	}


}
