#  Проект по автоматизации тестирования сайта    ![image](https://user-images.githubusercontent.com/113972226/210757618-58a84b30-8d96-485b-8ebe-adca1936d30c.png)


##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованные проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)




## :rocket: Технологии и инструменты:
<p  align="center">

![image](https://user-images.githubusercontent.com/113972226/210761495-0b5d89c5-da3e-45e1-a569-593bc09b3082.png)
<code>![image](https://user-images.githubusercontent.com/113972226/210761573-4016f054-b45f-4752-9aba-a55abac9296c.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761638-96ddb0e2-994c-40d2-be59-beb7dd9234c5.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761701-29f4baf5-77ca-49c0-975a-3f5d723c226e.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761805-d55ea3a4-bd5a-4af9-919f-2ad0454dc63a.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761863-05b6128a-a10b-4f0c-a135-d2c2af657ea5.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761915-e024ea13-83fe-44be-8e26-4fa03a1f3c63.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210761969-8a20dec9-6c59-4600-b304-706cc158c335.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210762029-2dab402b-9faa-49fc-9ad9-d0dd2981bfb2.png)</code>
<code>![image](https://user-images.githubusercontent.com/113972226/210762070-f6e56032-bdea-4bd7-8708-e5a0fd597051.png)</code>
</p>

## :heavy_check_mark: Реализованные проверки:
### UI Tests

- Проверка отображения главной страницы 
- Проверка перехода на страницу 'Государственные структуры'
- Проверка перехода на Страницу 'Контакты'
- Проверка формы обратной связи(телефон, ввод букв), негативный
- Проверка ошибок в консоли



## :computer: Запуск тестов из терминала: 


### Локальный запуск тестов:

```bash
gradle clean test
```


### Удаленный запуск тестов:
```bash
gradle clean test
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-DremoteUrl=${remoteUrl}
```
## Параметры сборки:

 <strong>*browser*</strong> – браузер, в котором будут выполняться тесты (_по умолчанию - <strong>*chrome*</strong>_).

 <strong>*browserVersion*</strong> – версия браузера (_по умолчанию - <strong>*99*</strong>_).

 <strong>*browserSize*</strong> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <strong>*1920x1080*</strong>_).

 <strong>*remoteUrl*</strong> – логин, пароль и адрес удаленного сервера Selenoid (_по умолчанию указаны в сборке Jenkins_).

## <img width="4%" title="Jenkins" src="images/Jenkins_logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/hw_project_15/):

Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src=![image](https://user-images.githubusercontent.com/113972226/210760198-3aadcfe6-ecc5-44bd-99d3-41c171e27679.png) width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

<p align="center">
  <img ![image](https://user-images.githubusercontent.com/113972226/210760421-6e3ba7ab-05e1-40f6-b392-79928e6ae151.png) alt="allure" width="800">
</p>
## <img width="4%" title="Allure Report" ![Скриншот 04-01-2023 121715](https://user-images.githubusercontent.com/113972226/210760596-8a6ad40d-9bdc-4dae-b900-961762ba1705.jpg)> Отчет о результатах тестирования в Allure Report
(https://jenkins.autotests.cloud/job/CrSS/allure/#suites/dbf0a6a9a89f101e0c65c76f407b621b/32c1abb4521b40b7/)):

<p align="center">
  <img ![Скриншот 04-01-2023 121754](https://user-images.githubusercontent.com/113972226/210760678-0cf00bef-3b82-40b8-ad22-a807049dc432.jpg) alt="jenk" width="900">
</p>


## <img width="4%" title="Telegram" ![Скриншот 05-01-2023 123016](https://user-images.githubusercontent.com/113972226/210760761-02a41508-6327-426f-8d6f-2b3cd8d2ccf7.jpg)> Уведомления в Telegram с использованием бота:
После завершения сборки специальный бот, созданный в <strong>Telegram</strong>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img ![Скриншот 04-01-2023 122002](https://user-images.githubusercontent.com/113972226/210760946-0b48b713-cdea-47d1-a24f-a29b15170f1b.jpg) alt="400" width="400">
</p>



