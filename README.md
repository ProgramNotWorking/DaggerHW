## Задача: Создать многомодульный проект, в котором есть 3 модуля (app, core, feature). В core есть 2 объекта ретрофита, оба смотрят на разные сервера
`app`:
* [MainActivity](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/MainActivity.kt) - активность в которой выполняются `usecase`
* [App](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/app/App.kt) - `Application` класс
* [AppComponent](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/di/AppComponent.kt) - Dagger компонент
* [AppModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/di/AppModule.kt) - Dagger модуль
* [MainViewModel](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/presentation/viewmodel/MainViewModel.kt) - `ViewModel` для фрагмента
* [MainFragment](https://github.com/ProgramNotWorking/DaggerHW/blob/master/app/src/main/java/com/example/dagger/presentation/fragment/MainFragment.kt) - фрагмент, в котором инициализируется FeatureComponent и к которому привязана `ViewModel`

`core`:
* [ApiServices](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/api_service/ApiServices.kt) - интерфейсы под запросы
* [CoreComponent](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreComponent.kt) - Dagger компонент 
* [CoreDiConstants](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreDiConstants.kt) - константы под `Names` и базовые `Url`
* [CoreModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/core/src/main/java/com/example/core/di/CoreModule.kt) - Dagger модуль

`feature`:
* [FeatureComponent](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/di/FeatureComponent.kt) - Dagger компонент
* [FeatureModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/di/FeatureModule.kt) - Dagger модуль (пустой, выступает в роли root модуля)
* [UseCaseModule](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/di/UseCaseModule.kt) - Dagger модуль под UseCase
* [NetworkRepositoryImpl](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/repository/NetworkRepositoryImpl.kt) - репозиторий под `usecase`
* [GetDataFromServer1Interface](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/usecase_interfaces/GetDataFromServer1Interface.kt) - интерфейс под первый UseCase
* [GetDataFromServer2Interface](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/usecase_interfaces/GetDataFromServer2Interface.kt) - интерфейс под второй UseCase
* [GetDataFromServer1UseCase](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/GetDataFromServer1UseCase.kt) - `usecase` под первый запрос
* [GetDataFromServer1UseCase](https://github.com/ProgramNotWorking/DaggerHW/blob/master/feature/src/main/java/com/example/feature/usecases/GetDataFromServer2UseCase.kt) - `usecase` под второй запрос
