$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adminfunctions.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Book Services",
  "description": "",
  "id": "admin-book-services",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Admin is able to add the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Admin is adding book",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Admin enters  \u003cbookName\u003e,\u003cauthor\u003e,\u003ccategory\u003e,\u003cpublisher\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book should be added",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book;",
  "rows": [
    {
      "cells": [
        "bookName",
        "author",
        "category",
        "publisher"
      ],
      "line": 14,
      "id": "admin-book-services;admin-is-able-to-add-the-book;;1"
    },
    {
      "cells": [
        "\"maths\"",
        "\"ramanujan\"",
        "\"mathematics\"",
        "\"ganesh\""
      ],
      "line": 15,
      "id": "admin-book-services;admin-is-able-to-add-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"ajay@gmail.com\", \"Ak@1997\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 28412516100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajay@gmail.com",
      "offset": 13
    },
    {
      "val": "Ak@1997",
      "offset": 31
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 1853647200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 12311600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Admin is able to add the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Admin is adding book",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Admin enters  \"maths\",\"ramanujan\",\"mathematics\",\"ganesh\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_adding_book()"
});
formatter.result({
  "duration": 600200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maths",
      "offset": 15
    },
    {
      "val": "ramanujan",
      "offset": 23
    },
    {
      "val": "mathematics",
      "offset": 35
    },
    {
      "val": "ganesh",
      "offset": 49
    }
  ],
  "location": "AdminSteps.admin_enters(String,String,String,String)"
});
formatter.result({
  "duration": 603120900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_should_be_added()"
});
formatter.result({
  "duration": 1233600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Admin is able to update the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Admin is updating book",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Admin enters updated values \u003cbId\u003e, \u003cbookName\u003e,\u003cauthor\u003e,\u003ccategory\u003e,\u003cpublisher\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book will be updated",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "2",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book;2",
  "rows": [
    {
      "cells": [
        "bId",
        "bookName",
        "author",
        "category",
        "publisher"
      ],
      "line": 23,
      "id": "admin-book-services;admin-is-able-to-update-the-book;2;1"
    },
    {
      "cells": [
        "705",
        "\"Accelerated Predictive\"",
        "\"garry scriven\"",
        "\"Journals\"",
        "\"Pharmaceutical Industry\""
      ],
      "line": 24,
      "id": "admin-book-services;admin-is-able-to-update-the-book;2;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"ajay@gmail.com\", \"Ak@1997\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 1167408900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajay@gmail.com",
      "offset": 13
    },
    {
      "val": "Ak@1997",
      "offset": 31
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 39826500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 42500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Admin is able to update the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book;2;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Admin is updating book",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Admin enters updated values 705, \"Accelerated Predictive\",\"garry scriven\",\"Journals\",\"Pharmaceutical Industry\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book will be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_updating_book()"
});
formatter.result({
  "duration": 67000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "705",
      "offset": 28
    },
    {
      "val": "Accelerated Predictive",
      "offset": 34
    },
    {
      "val": "garry scriven",
      "offset": 59
    },
    {
      "val": "Journals",
      "offset": 75
    },
    {
      "val": "Pharmaceutical Industry",
      "offset": 86
    }
  ],
  "location": "AdminSteps.admin_enters_updated_values(int,String,String,String,String)"
});
formatter.result({
  "duration": 99401700,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_will_be_updated()"
});
formatter.result({
  "duration": 61200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Admin is able to remove the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "Admin is deleting book",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "BookId is given \u003cbId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Book is deleted",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book;",
  "rows": [
    {
      "cells": [
        "bId"
      ],
      "line": 32,
      "id": "admin-book-services;admin-is-able-to-remove-the-book;;1"
    },
    {
      "cells": [
        "802"
      ],
      "line": 33,
      "id": "admin-book-services;admin-is-able-to-remove-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"ajay@gmail.com\", \"Ak@1997\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 1049173300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajay@gmail.com",
      "offset": 13
    },
    {
      "val": "Ak@1997",
      "offset": 31
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 14096300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 60600,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Admin is able to remove the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "Admin is deleting book",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "BookId is given 802",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Book is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_deleting_book()"
});
formatter.result({
  "duration": 49300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "802",
      "offset": 16
    }
  ],
  "location": "AdminSteps.bookid_is_given(int)"
});
formatter.result({
  "duration": 9428300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_is_deleted()"
});
formatter.result({
  "duration": 9524800,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepsdefinition.AdminSteps.book_is_deleted(AdminSteps.java:93)\r\n\tat ✽.Then Book is deleted(adminfunctions.feature:29)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "Admin is able to issue the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "Admin is in issue page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Bid and Uid are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Book is issued successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 41,
      "id": "admin-book-services;admin-is-able-to-issue-the-book;;1"
    },
    {
      "cells": [
        "22",
        "702"
      ],
      "line": 42,
      "id": "admin-book-services;admin-is-able-to-issue-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"ajay@gmail.com\", \"Ak@1997\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 930590300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajay@gmail.com",
      "offset": 13
    },
    {
      "val": "Ak@1997",
      "offset": 31
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 17105600,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 49800,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Admin is able to issue the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "Admin is in issue page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Bid and Uid are given 22, 702",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Book is issued successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_in_issue_page()"
});
formatter.result({
  "duration": 114300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 22
    },
    {
      "val": "702",
      "offset": 26
    }
  ],
  "location": "AdminSteps.bid_and_Uid_are_given(int,int)"
});
formatter.result({
  "duration": 17409500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_is_issued_successfully()"
});
formatter.result({
  "duration": 627900,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepsdefinition.AdminSteps.book_is_issued_successfully(AdminSteps.java:108)\r\n\tat ✽.Then Book is issued successfully(adminfunctions.feature:38)\r\n",
  "status": "failed"
});
formatter.uri("adminlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Login",
  "description": "",
  "id": "admin-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User login with details",
  "description": "",
  "id": "admin-login;user-login-with-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "admin-login;user-login-with-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9,
      "id": "admin-login;user-login-with-details;;1"
    },
    {
      "cells": [
        "\"ajay@gmail.com\"",
        "\"Ak@1997\""
      ],
      "line": 10,
      "id": "admin-login;user-login-with-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User login with details",
  "description": "",
  "id": "admin-login;user-login-with-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"ajay@gmail.com\",\"Ak@1997\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Registration with respective given details",
  "description": "",
  "id": "user-registration;user-registration-with-respective-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \u003cfirstName\u003e,\u003clastName\u003e,\u003cemail\u003e,\u003cpassword\u003e,\u003cmobile\u003e,\u003crole\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration-with-respective-given-details;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "mobile",
        "role",
        "status"
      ],
      "line": 9,
      "id": "user-registration;user-registration-with-respective-given-details;;1"
    },
    {
      "cells": [
        "\"mahii\"",
        "\"H\"",
        "\"mahiii@gmail.com\"",
        "\"mahesh\"",
        "7878787878",
        "\"Admin\"",
        "\"Registered\""
      ],
      "line": 10,
      "id": "user-registration;user-registration-with-respective-given-details;;2"
    },
    {
      "cells": [
        "\"siri\"",
        "\"c\"",
        "\"sirii1@gmail.com\"",
        "\"sirishh\"",
        "8787878787",
        "\"Student\"",
        "\"Registered\""
      ],
      "line": 11,
      "id": "user-registration;user-registration-with-respective-given-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User Registration with respective given details",
  "description": "",
  "id": "user-registration;user-registration-with-respective-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"mahii\",\"H\",\"mahiii@gmail.com\",\"mahesh\",7878787878,\"Admin\"",
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
  "line": 6,
  "name": "User should be \"Registered\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "User Registration with respective given details",
  "description": "",
  "id": "user-registration;user-registration-with-respective-given-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"siri\",\"c\",\"sirii1@gmail.com\",\"sirishh\",8787878787,\"Student\"",
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
  "line": 6,
  "name": "User should be \"Registered\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("studentfunctions.feature");
formatter.feature({
  "line": 1,
  "name": "Student Book Services",
  "description": "",
  "id": "student-book-services",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User is able to request the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Student is on request page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "BookId and UserId are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book is Requested successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 14,
      "id": "student-book-services;user-is-able-to-request-the-book;;1"
    },
    {
      "cells": [
        "902",
        "100001"
      ],
      "line": 15,
      "id": "student-book-services;user-is-able-to-request-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Student is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Student gives \"ganesh@gmail.com\", \"ganesh\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Student is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_login_page()"
});
formatter.result({
  "duration": 681803600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ganesh@gmail.com",
      "offset": 15
    },
    {
      "val": "ganesh",
      "offset": 35
    }
  ],
  "location": "StudentSteps.student_gives(String,String)"
});
formatter.result({
  "duration": 14622000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_is_logged_in()"
});
formatter.result({
  "duration": 83900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User is able to request the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Student is on request page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "BookId and UserId are given 902, 100001",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book is Requested successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_request_page()"
});
formatter.result({
  "duration": 85800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "902",
      "offset": 28
    },
    {
      "val": "100001",
      "offset": 33
    }
  ],
  "location": "StudentSteps.bookid_and_UserId_are_given(int,int)"
});
formatter.result({
  "duration": 268259100,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_is_Requested_successfully()"
});
formatter.result({
  "duration": 84500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "User is able to return the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Student is on return page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "bookId and userId are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book is returned successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 23,
      "id": "student-book-services;user-is-able-to-return-the-book;;1"
    },
    {
      "cells": [
        "902",
        "100001"
      ],
      "line": 24,
      "id": "student-book-services;user-is-able-to-return-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Student is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Student gives \"ganesh@gmail.com\", \"ganesh\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Student is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_login_page()"
});
formatter.result({
  "duration": 619388300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ganesh@gmail.com",
      "offset": 15
    },
    {
      "val": "ganesh",
      "offset": 35
    }
  ],
  "location": "StudentSteps.student_gives(String,String)"
});
formatter.result({
  "duration": 36686000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_is_logged_in()"
});
formatter.result({
  "duration": 45100,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User is able to return the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Student is on return page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "bookId and userId are given 902, 100001",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book is returned successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_return_page()"
});
formatter.result({
  "duration": 97100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "902",
      "offset": 28
    },
    {
      "val": "100001",
      "offset": 33
    }
  ],
  "location": "StudentSteps.bookid_and_userId_are_given(int,int)"
});
formatter.result({
  "duration": 16966000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_is_returned_successfully()"
});
formatter.result({
  "duration": 670000,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepsdefinition.StudentSteps.book_is_returned_successfully(StudentSteps.java:71)\r\n\tat ✽.Then Book is returned successfully(studentfunctions.feature:20)\r\n",
  "status": "failed"
});
formatter.uri("studentlogin.feature");
formatter.feature({
  "line": 1,
  "name": "Student Login",
  "description": "",
  "id": "student-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User login with details",
  "description": "",
  "id": "student-login;user-login-with-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "student-login;user-login-with-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9,
      "id": "student-login;user-login-with-details;;1"
    },
    {
      "cells": [
        "\"ganesh@gmail.com\"",
        "\"ganesh\""
      ],
      "line": 10,
      "id": "student-login;user-login-with-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User login with details",
  "description": "",
  "id": "student-login;user-login-with-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"ganesh@gmail.com\",\"ganesh\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});