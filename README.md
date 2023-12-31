
Расширенный алгоритм Евклида можно представить в виде следующих шагов.

1. Ввод числа a, для которого необходимо найти обратный элемент a-1.

2. Ввод модуля n, нормирующего результат.

3. Если a=0 или n=0 или n=1, то некорректные параметры, выход (пояснение: при a=0 не существует обратного элемента, при n=0 возникает ситуация деления на нуль; а при n=1 всегда будет получаться результат, равный нулю, так как во множестве результатов будет существовать только один элемент).

4. Задаются вектора U = {u1, u2, u3}, V = {v1, v2, v3}.

Производится начальная установка параметров.

Вектор U = {0; 1; n}; вектор V = {1, 0, a}.

5. Пока u3¹1 и u3¹0 и v3¹0 выполняются следующие действия (пояснение: при u3=1 результат будет получен в u1; при v3=0 будет деление на нуль в пункте 5.а; при u3=0 доказывается, что два числа – a и n – не являются взаимнопростыми).

а) найти результат целочисленного деления числа u3 на v3: q=]u3/v3[;

б) для каждого i от 1 до 3: 

- находится значение выражения t = ui-vi*q;

- ui присваивается значение vi :  ui = vi;

- vi присваивается значение t  : vi = t;

в) переход к пункту 5.

6. Если u3¹1, то обратный элемент не существует, выход.

7. Если u3=1, то в переменной u1 хранится значение обратного элемента a-1. Если u1<0, то осуществляется приведение результата к положительному числу: u1=n + u1. Далее осуществляем вывод значения u1. Выход.

