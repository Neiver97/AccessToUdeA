#Author: Neiver Tapia Escobar
#Email: neiver.tapia@udea.edu.co
#Fecha: 19/06/2022

Feature: As a user I need to enter to course Software Quality to UdeA page

  Background: Main page
    Given the student enter to main page

  @EnterHome
  Scenario Outline: The student enter the information for loggin
    Given The student enter to login page
    When The student enter username and password and ckick to access
      | userName   | password   | timeSeconds   |
      | <userName> | <password> | <timeSeconds> |
    And The student select the course Software Quality
    And The student click to enter to meeting
    Then The stundent will watch the alert and click to accept <message>
    Examples:
      | userName     | password | timeSeconds | message |
      | Neiver.tapia | 123      | 60          | Holaaaa |


  @ErrorAtLoggin
  Scenario Outline: The student enter fail information for loggin
    Given The student enter to login page
    When The student enter username and password and ckick to access
      | userName   | password   | timeSeconds   |
      | <userName> | <password> | <timeSeconds> |
    Then The stundent will watch the message <message>
    Examples:
      | userName     | password | timeSeconds | message                         |
      | Neiver.tapia | 12345    | 60          | Invalid login, please try again |
      | Never.tapia  | 456      | 60          | Invalid login, please try again |

