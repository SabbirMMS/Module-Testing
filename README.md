```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

```gradle
dependencies {
	        implementation 'com.github.SabbirMMS:Module-Testing:2.1.0'
	}
```
