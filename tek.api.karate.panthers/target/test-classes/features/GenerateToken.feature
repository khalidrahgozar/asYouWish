Feature: Token Generator for Insurance API

@test
Scenario: Generate a token for CSR portal 
Given url "https://tek-insurance-api.azurewebsites.net"
* path "/api/token"
* request {"username":"supervisor" , "password" : "tek_supervisor"}
* method post 
* print response.token
* status 200

