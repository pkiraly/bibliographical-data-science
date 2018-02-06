package de.gwdg.metadataqa.openaire;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import de.gwdg.metadataqa.api.json.FieldGroup;
import de.gwdg.metadataqa.api.json.JsonBranch;
import de.gwdg.metadataqa.api.schema.Schema;

public class OpenAireSchema implements Schema, Serializable {

	private final static List<JsonBranch> paths = new ArrayList<>();
	private final static Map<String, JsonBranch> collectionPaths = new LinkedHashMap<>();

	static {

		paths.add(new JsonBranch("id",
			"$.['id']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("journal",
			"$.['journal']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("pages/end",
			"$.['pages']['end']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("pages/start",
			"$.['pages']['start']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("affiliations/address",
			"$.['affiliations'][0]['address']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("affiliations/countrycode",
			"$.['affiliations'][0]['countrycode']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("affiliations/countryname",
			"$.['affiliations'][0]['countryname']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("affiliations/organization",
			"$.['affiliations'][0]['organization']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("affiliations/rawtext",
			"$.['affiliations'][0]['rawtext']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("authors/affiliationpositions",
			"$.['authors'][0]['affiliationpositions'][0]",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("authors/authorfullname",
			"$.['authors'][0]['authorfullname']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("externalidentifiers/accession",
			"$.['externalidentifiers']['accession']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/art-access-id",
			"$.['externalidentifiers']['art-access-id']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/coden",
			"$.['externalidentifiers']['coden']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/doi",
			"$.['externalidentifiers']['doi']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/knolid",
			"$.['externalidentifiers']['knolid']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/manuscript",
			"$.['externalidentifiers']['manuscript']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/medline",
			"$.['externalidentifiers']['medline']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/other",
			"$.['externalidentifiers']['other']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/pii",
			"$.['externalidentifiers']['pii']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/pmc-scan",
			"$.['externalidentifiers']['pmc-scan']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/pmcid",
			"$.['externalidentifiers']['pmcid']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/pmid",
			"$.['externalidentifiers']['pmid']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/publisher-id",
			"$.['externalidentifiers']['publisher-id']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/publisher-manuscript",
			"$.['externalidentifiers']['publisher-manuscript']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("externalidentifiers/sici",
			"$.['externalidentifiers']['sici']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("references/basicmetadata/authors",
			"$.['references'][0]['basicmetadata']['authors'][0]",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/accession",
			"$.['references'][0]['basicmetadata']['externalids']['accession']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/arxiv",
			"$.['references'][0]['basicmetadata']['externalids']['arxiv']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/coden",
			"$.['references'][0]['basicmetadata']['externalids']['coden']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/doi",
			"$.['references'][0]['basicmetadata']['externalids']['doi']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/isbn",
			"$.['references'][0]['basicmetadata']['externalids']['isbn']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/medline",
			"$.['references'][0]['basicmetadata']['externalids']['medline']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/other",
			"$.['references'][0]['basicmetadata']['externalids']['other']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/pii",
			"$.['references'][0]['basicmetadata']['externalids']['pii']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/pmcid",
			"$.['references'][0]['basicmetadata']['externalids']['pmcid']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/pmid",
			"$.['references'][0]['basicmetadata']['externalids']['pmid']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/externalids/publisher-id",
			"$.['references'][0]['basicmetadata']['externalids']['publisher-id']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("references/basicmetadata/issue",
			"$.['references'][0]['basicmetadata']['issue']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/pages/end",
			"$.['references'][0]['basicmetadata']['pages']['end']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/pages/start",
			"$.['references'][0]['basicmetadata']['pages']['start']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/source",
			"$.['references'][0]['basicmetadata']['source']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/title",
			"$.['references'][0]['basicmetadata']['title']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/volume",
			"$.['references'][0]['basicmetadata']['volume']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/basicmetadata/year",
			"$.['references'][0]['basicmetadata']['year']",
			JsonBranch.Category.MANDATORY));

		paths.add(new JsonBranch("references/position",
			"$.['references'][0]['position']",
			JsonBranch.Category.MANDATORY));
		paths.add(new JsonBranch("references/text",
			"$.['references'][0]['text']",
			JsonBranch.Category.MANDATORY));
	}

	public List<JsonBranch> getCollectionPaths() {
		return new ArrayList();
	}

	public List<JsonBranch> getRootChildrenPaths() {
		return null;
	}

	public List<JsonBranch> getPaths() {
		return paths;
	}

	public JsonBranch getPathByLabel(String label) {
		return null;
	}

	public List<FieldGroup> getFieldGroups() {
		return new ArrayList();
	}

	public List<String> getNoLanguageFields() {
		return null;
	}

	public Map<String, String> getSolrFields() {
		return null;
	}

	public Map<String, String> getExtractableFields() {
		return null;
	}

	public void setExtractableFields(Map<String, String> extractableFields) {

	}
}
