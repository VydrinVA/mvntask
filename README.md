# Mvntask

Realization of Maven task

## Description

1. Создать новый проект GeometryLibrary - 81cefcd
2. Создать проект GeometryApp - 288fbc9
3. Изменение версии GeometryLibrary, решение изменения версии - 77e1d3a, 0188cce, eb8a57, 484e4fc
4. (4.1.) Перевод проекта GeometryLibrary в формат набора модулей, добавление модуля GeometryUtil - e8b5d60
607bd28 - простое исправление в опечатке расчёта прямоугольника
6fcdb96 - измененил версию geometryutils, чтобы соответствовало начальному состоянию задания
40dc51f - добавил номер версии в сгенерированный для модуля twodimensional pom.xml
5. (4.2.) 3a233c8 - изменил в geometryapp зависимость со всей библиотеки geometrylibrary на модуль twodimensional. Добавил использование geometryutils.
6. (4.3.) 1a6a84d - добавил функционал geometryutils, изменил версию
7. (4.4.) e17f58c - изменил версию, получил конфликт:

[INFO] --- dependency:3.7.0:tree (default-cli) @ geometryapp ---
[INFO] ru.vydrin.work:geometryapp:jar:1.0-SNAPSHOT
[INFO] +- ru.vydrin.work:twodimensional:jar:1.2-SNAPSHOT:compile
[INFO] \- ru.vydrin.work:geometryutils:jar:1.1.0-SNAPSHOT:compile
[INFO]    \- (ru.vydrin.work:twodimensional:jar:1.1-SNAPSHOT:compile - omitted for conflict with 1.2-SNAPSHOT)

А также поудалял автоматически добавленные зависимости junit в проектах

8. (4.5.) edd50c0 - поправил конфликт, использовав `<dependencyManagement>`
9. (4.6.) b655af9 - добавил модуль threedimensional, добавил его использование
8410c3 - увидел, что сделал не соответствующием имена методам, поправил
10. (4.7) 9f2086e - добавил в threedimensional класс Cylinder, изменил версию. b36e998 - добавил использование цилиндра, новых конфликтов не появилось, так как у threedimensional не добавлял зависимостей

