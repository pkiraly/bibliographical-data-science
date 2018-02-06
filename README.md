# bibliographical-data-science

# Build the project

```
mvn clean install
```

It will create `target/metadata-qa-openaire-0.1-SNAPSHOT-jar-with-dependencies.jar`. The file contains all the Java libraries which necessary for running the code.

# Run the project

1. Prerequisite

Install Apache Spark

2. Run calculation

```
spark-submit \
  --class de.gwdg.metadataqa.openaire.CompletenessCount \
  --master local[*] \
  target/metadata-qa-openaire-0.1-SNAPSHOT-jar-with-dependencies.jar \
  /path/to/openaire/files/\*-meta-\* \
  results
```

3. Collect results

```
cat results/part-* > results.csv
```
