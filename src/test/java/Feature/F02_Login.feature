@smoke
  Feature:F02_Login | users could use login functionality to use their accounts
    Scenario:user could login with valid email and password
      Given user go to login page
      When  user login with valid data
      Then user click on login button
      And user login to the system successfully



    Scenario: user could login with invalid email and password
      Given user go to login page
      When  user login with Invalid data
      Then user click on login button
      And user can not login to the system successfully


