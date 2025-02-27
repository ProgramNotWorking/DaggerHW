## Задача: Создать многомодульный проект, в котором есть 3 модуля (app, core, feature). В core есть 2 объекта ретрофита, оба смотрят на разные сервера
`app`:
* [MainActivity](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/MainActivity.kt) - активность в которой выполняются `usecase`
* [App](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/app/App.kt) - `Application` класс

`core`:
* [ApiServices](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/api_service/ApiServices.kt) - интерфейсы под запросы
* [CoreComponent](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreComponent.kt) - Dagger компонент 
* [CoreDiConstants](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreDiConstants.kt) - константы под `Names` и базовые `Url`
* [CoreModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreModule.kt) - Dagger модуль

`feature`:
* [FeatureComponent](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/di/FeatureComponent.kt) - Dagger компонент
* [FeatureModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/di/FeatureModule.kt) - Dagger модуль
* [NetworkRepositoryImpl](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/repository/NetworkRepositoryImpl.kt) - репозиторий под `usecase`
* [GetDataFromServer1UseCase](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/GetDataFromServer1UseCase.kt) - `usecase` под первый запрос
* [GetDataFromServer1UseCase](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/GetDataFromServer2UseCase.kt) - `usecase` под второй запрос
