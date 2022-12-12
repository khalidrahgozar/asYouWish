Feature: Post Request Tests
  Background: 
    Given url "https://tek-insurance-api.azurewebsites.net"
    * def token = call read("GenerateToken.feature")
    * def tokenValue = token.response.token
    * header Authorization = "Bearer " + tokenValue
    * path "api/accounts/add-primary-account"
    
     
  Scenario: Verify Post Request Method
    * request
      """
      {
      "email":"karate1234Call@tekschool.com",
      "firstName":"Panthers",
      "lastName":"TEK",
      "title":"MR",
      "gender":"MALE",
      "maritalStatus":"SINGLE",
      "employmentStatus":"Student",
      "dateOfBirth": "1990-01-20"
      }
      """
    * method post
    * status 201
    * print response

 @postCall
  Scenario: post Request with Faker data
    #first we need to define a variable to read the java class
    #second we need to define a variable to call each static method from that class
    * def generator = Java.type("api.test.DataGenerator")
    * def email = generator.getEmail()
    * def firstName = generator.getFirstName()
    * def lastName = generator.getLastName()
    * def dateOfBirth = generator.getDob()
    * def title = generator.getTitle()
    #* det middleName = generator.getFullName()
    * request
      """
      {
      "email":"#(email)",
      "firstName":"#(firstName)",
      "lastName":"#(lastName)",
      "title":"#(title)",
      "gender":"MALE",
      "maritalStatus":"SINGLE",
      "employmentStatus":"Student",
      "dateOfBirth": "#(dateOfBirth)"
      }
      """
    * method post
    * status 201
    * print response
    #* match response.email == email
    #* match response.firstName == "#(firstName)"
    #* match response.lastName != firstName
    * match response.email == email
    * match response.firstName =="#(firstName)"
    * match response.lastName == lastName
    * match response.title == "#(title)"
    
    
 
    
    
    
    
    
    
    
    
    