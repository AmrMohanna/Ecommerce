@smoke
  Feature:usre search with name ans sku
    Scenario:  1 -user can search with product name and get relevant data
      When user search enter product name and click search
      And search with book
      Then user get relevant data
      And url contains

    Scenario:  1 -user can search with product SKU and get relevant data
      When user search enter SKU and click search
      And search with book
      Then user get relevant data to SKU
