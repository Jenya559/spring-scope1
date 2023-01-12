# SPRING-SCOPE

1. Склонировать заготовку с репозитория
2. Создать класс Cat с полем name
3. В классе java конфигурации определить prototype bean типа Cat
4. В методе main достать из контекста 2 бина типа HelloWorld
и 2 бина типа Cat и сравнить их ссылки.

Алгоритм работы программы:
- в методе main достаем 2 бина типа HelloWorld и выводим на консоль сравнение их ссылок
(т.к scope singletone на консоле выведится true - ссылки ведут на один объект)
bean helloworld уже настроен

- в методе main достаем 2 бина типа Cat и выводим на консоль сравнение их ссылок
(т.к scope prototype на консоле выведится false - ссылки ведут на разные объекты)

Проверить работоспособность логики можно с помощью запуска автотестов.