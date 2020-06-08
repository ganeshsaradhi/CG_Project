$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/capgemini/lmscucumber/features/registration.feature");
formatter.feature({
  "line": 2,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Registration"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \u003cfirstName\u003e, \u003clastName\u003e, \u003cemail\u003e, \u003cpassword\u003e, \u003cmobile\u003e, \u003crole\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "mobile",
        "role"
      ],
      "line": 10,
      "id": "user-registration;user-registration-with-given-details;;1"
    },
    {
      "cells": [
        "\"ganesh\"",
        "\"saradhi\"",
        "\"ganeshch@gmail.com\"",
        "\"Gane@123\"",
        "8181818181",
        "\"Student\""
      ],
      "line": 11,
      "id": "user-registration;user-registration-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 35133309600,
  "status": "passed"
});
formatter.before({
  "duration": 7882443000,
  "status": "passed"
});
formatter.before({
  "duration": 26049327400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"ganesh\", \"saradhi\", \"ganeshch@gmail.com\", \"Gane@123\", 8181818181, \"Student\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be registered",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_is_on_registration_page()"
});
formatter.result({
  "duration": 15476848700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ganesh",
      "offset": 13
    },
    {
      "val": "saradhi",
      "offset": 23
    },
    {
      "val": "ganeshch@gmail.com",
      "offset": 34
    },
    {
      "val": "Gane@123",
      "offset": 56
    },
    {
      "val": "8181818181",
      "offset": 67
    },
    {
      "val": "Student",
      "offset": 80
    }
  ],
  "location": "RegistrationSteps.user_enters(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7663490900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_should_be_registered()"
});
formatter.result({
  "duration": 1057579300,
  "status": "passed"
});
formatter.after({
  "duration": 5055130400,
  "status": "passed"
});
formatter.after({
  "duration": 4669925300,
  "status": "passed"
});
});