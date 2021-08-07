$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FlightBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Flight booking",
  "description": "",
  "id": "flight-booking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book the cheapest flight",
  "description": "",
  "id": "flight-booking;book-the-cheapest-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SDETCucumberAssignments"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User launch the goibibo \"https://www.goibibo.com\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select the \"oneway\" option",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User select from \"Bengaluru\" and to \"Mumbai\" cities",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User select departure date",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User select class details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User search button and review the details",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.goibibo.com",
      "offset": 25
    }
  ],
  "location": "FlightBookingStepDefinition.User_launch_the_goibibo_website(String)"
});
formatter.result({
  "duration": 10278614047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "oneway",
      "offset": 17
    }
  ],
  "location": "FlightBookingStepDefinition.User_select_the_travel_type_option(String)"
});
formatter.result({
  "duration": 28744609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 18
    },
    {
      "val": "Mumbai",
      "offset": 37
    }
  ],
  "location": "FlightBookingStepDefinition.User_select_from_and_destination_places(String,String)"
});
formatter.result({
  "duration": 4413202306,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingStepDefinition.User_select_departure_date()"
});
formatter.result({
  "duration": 300397485,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingStepDefinition.User_select_clas_details()"
});
formatter.result({
  "duration": 128865607,
  "status": "passed"
});
formatter.match({
  "location": "FlightBookingStepDefinition.User_search_button_and_review_the_details()"
});
formatter.result({
  "duration": 1658108972,
  "error_message": "java.lang.AssertionError: To place\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat pageObjects.FlightBookingPage.clickSearch(FlightBookingPage.java:193)\n\tat com.krishna.run.FlightBookingStepDefinition.User_search_button_and_review_the_details(FlightBookingStepDefinition.java:104)\n\tat ✽.Then User search button and review the details(FlightBooking.feature:9)\n",
  "status": "failed"
});
});