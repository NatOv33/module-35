#Feature: Find restaurant
  #Позитивный сценарий: выбираем город краснодар и получем меню для краснодара
  #Scenario: chose restaurant city
    #Given url of restaurant 'https://dodopizza.ru/'
    #Then  chose city 'Краснодар'
    #And assert that chosen city is 'Краснодар'
    #Негатинвый сценарий: выбираем несушествующий город, получаем соответствуещее уведомление
  #Scenario: chose absent city
    #Given url of restaurant 'https://dodopizza.ru/'
    #Then  chose city 'Лапландия'
    #And assert that user got message 'Пиццерия в этом городе еще не открылась'

Feature: Find a gift
  #Негатинвый сценарий: выбираем несушествующий раздел, получаем соответствуещее уведомление
  Scenario: chose absent section
    Given url of shop 'https://www.yves-rocher.ru'
    Then  chose section 'Обувь'
    And assert that user got message 'Поиск не дал результата'
    #Позитивный сценарий: выбираем раздел парфюмерия и получем список товаров из раздела парфюмерия
    Scenario: chose an existing section
    Given url of shop 'https://www.yves-rocher.ru'
    Then  chose section 'Парфюмерия'
    And assert that chosen section is 'Парфюмерия'