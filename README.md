# Disclaimer
В домашках больше нельзя использовать мутабельные переменые, `throw`, касты или проверки на типы с помощью методов из Java вроде asInstanceOf и тд. Если не знаете, как вам проверить на типы, чем заменить `throw` или другое функционал из Java, то внимательно посмотрите прошлые лекции, там есть вся информация о данных практиках в Scala.

В домашних заданиях вы можете менять сигнатуры методов/интерфейс, если на написано обратного. Если в задании нужно реализовать определенную функцию, которая уже объявлена за вас, в таких случаях ее сигнатуру менять нельзя. То же касается и интерфейсов/адт: если задана четкая структура с полями трейтов/классов, то ее можно только дополнять для удобства вашего решения, но не менять кардинально.

# Траверс по дереву
Написать свое несбалансированное (то есть разница высот у веток не обязательно должна быть <=1) бинарное дерево для Int, у которого будет:
* добавление элемента `add`
* удаление элемента `delete`
* функции `foldLeft`, которая сможет проходиться по дереву и аккумулировать результат применения функции f к каждой ноде. Учтите, что дерево может быть любого размера, и функция не должна вызывать никаких переполнений при вызове.
* `breadthFirstSearch`, которая будет использовать foldLeft
* `depthFirstSearch` (inorder), которая будет использовать foldLeft
* `max`, которая будет принимать в себя любую из двух функций `breadthFirstSearch`, `depthFirstSearch` для прохода по дереву
* `min`, которая будет принимать в себя любую из двух функций `breadthFirstSearch`, `depthFirstSearch` для прохода по дереву
* функция подсчета кол-ва нод `size`
* `print` для удобного отображения дерева. Print должен печатать выводить каждый уровень дерева на новой строке, разделяя ветки через пробел
То есть для дерева вида `Node(4, Node(3, Node(1), Node(2)), Node(5, Node(6), Node(7)))` будет выведено 
```
4
3 5
1 2 6 7
```
* дерево не может быть пустым, обязательно должна быть хотя бы root нода со значением

Материалы для ознакомления с бинарными деревьями:
* https://www.geeksforgeeks.org/binary-tree-data-structure/?ref=lbp
* https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/

Написать тесты на эти функции, кроме `print`

# Коллекции
Реализуйте все функции в папке collections

Покройте функции тестами

# Проветривание

**Все имена вымышленные, совпадения случайны**

В Казани офис компании Тинькофф имеет очень продолговатую форму, так что программисты могут сидеть только в одном ряду.
К сожалению, в офисе недостаточно кондиционеров, а сидят в нем только скалисты в количестве **N** штук. Из-за жалоб на духоту,
HR менеджер по имени Ильзида приняла решение купить каждому скалисту вентилятор, но выяснилось, что в некоторых 
случаях одного вентилятора недостаточно, и нужно выдавать несколько. Тогда Ильзида решила определить степень духоты
каждого скалиста и выдать количество вентиляторов, зависящее от самого душного скалиста в окрестности размера **К**.
Для этого ей необходима функция, получающая на вход список степеней духоты (ограничимся Int) и длину окрестности и находящая уровень духоты самого душного скалиста для каждой последовательности скалистов размера **К**.

* Помогите Ильзиде найти два решения:
   1) Только при помощи методов, которые предоставляет `scala.collection.immutable.List[A]`.
   2) За O(N) по времени и O(k) по памяти - оказалось, что офис в Казани слишком длинный, а смету на закупку вентиляторов надо составить как можно быстрее. Запрещено использовать мутабельные структуры. Подумайте, какие практики из прошлых домашних заданий здесь можно применить.

## Пример

| аргументы функции                 | результат функции |
|-----------------------------------|-------------------|
| `degrees = List(1, 2, 3, 4), k = 2` | `List(2, 3, 4)`    |

Для нашего офиса существует 3 подлиста размером 2: [[1, 2], [2, 3], [3, 4]]. Возьмем максимальных душнил в каждом из этих листов и получим ответ: [2, 3, 4]

## Замечания
* 1<=K<=N
* N >=0. Возвращать пустой лист, если N=0
* Написать все нужные тесты
* Объяснить, какая сложность по памяти и времени у 1-го решения, и как были достигнуты необходимые лимиты по времени и памяти во втором - **отдельным  файлом complexity.md в корне папки проекта**
