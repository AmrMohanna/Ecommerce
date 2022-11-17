@smoke
  Feature: Add product to wishlist
    Background:
      When user click on wish mark
    Scenario:Add product to wishlist

      Then get green message

    Scenario:wishlist number more than 1
      When user click on wish list page
      Then wish list count more than1