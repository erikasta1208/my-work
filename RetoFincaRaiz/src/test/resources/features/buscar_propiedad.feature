#Author: erjcasta@bancolombia.com.co
Feature: Search a property in Fincaraiz
  As a user buyer
  Erika wants to use Finca Raiz page
  to make search of a properties

  @SearchProperty
  Scenario Outline: Erika search a property in Fincaraiz
    Given that Erika navigate in the Fincaraiz page
    When she selects the department "<department>"
    And she select the city "<city>"
    And she select any property from the list
    Then she should see the detail of the property

    Examples: 
      | department | city     |
      | Antioquia  | Envigado |
      | Meta  | Villavicencio |
