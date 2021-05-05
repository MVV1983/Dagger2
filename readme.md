# Домашнее задание по Dagger 2

Необходимо заменить явное создание объектов на dependency injection.

### Список классов
Можно пользоваться TODO в студии.

1. `SampleStringRepository` - провайдить интерфейс, а не имплементацию. Должен провайдиться только один инстанс, а не пересоздаваться для каждой зависимости.
2. `SampleStringDataSource` - провайдить интерфейс, а не имплементации.
2. `GetSampleStringFromLocalUseCase`
3. `GetSampleStringFromRemoteUseCase`
4. `MainViewModel`