$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/test.feature");
formatter.feature({
  "name": "First  test Rest with cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "First test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "retreive all data about students",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsForFeatures.retreive_all_data_about_students()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "post data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
});