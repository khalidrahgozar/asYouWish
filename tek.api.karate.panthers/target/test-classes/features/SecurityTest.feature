@tokenValidition
Feature: Verify Tek Insurance Token
Background:
Given url "https://tek-insurance-api.azurewebsites.net"
* def token = call read("GenerateToken.feature")
* def tokenValue = token.response.token
* path "/api/token/verify"
* param token = tokenValue

Scenario: Verify Valid Token
Given url "https://tek-insurance-api.azurewebsites.net"
* def token = call read("GenerateToken.feature")
* def tokenValue = token.response.token
* path "/api/token/verify"
* param token = tokenValue
* param username = "supervisor"
* method get
* status 200
* print response
* match response == "true"





Scenario: Verify invalid username
* param username = "teacher"
* method get
* print response