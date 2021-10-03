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