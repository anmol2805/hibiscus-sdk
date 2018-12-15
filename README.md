# hibiscus-sdk

###### *Easier and faster access to M-UMS features without directly accessing its APIs*

### Getting Started
1.Add this in your root build.gradle at the end of repositories:

 ``` gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 
 2.Add these dependencies in your module app build.gradle:
 
  ``` gradle
dependencies {
    implementation 'com.android.volley:volley:1.1.0'
    implementation 'com.github.anmol2805.hibiscus-sdk:mysingleton:0.1.0'
 }
 ```
 
 3.Add this dependency for hibiscus authentication:
 
  ``` gradle
dependencies {
    implementation 'com.github.anmol2805.hibiscus-sdk:hibiscusauth:0.1.0'
 }
 ```
 
 
 4.Add permissions in your manifest file:
 
  ```xml
<permission android:name="android.permission.INTERNET" />       
```

## Usage

 ```kotlin
val hib = HibiscusLogin()
        hib.logInWithUserCredentials(student_id,password,this, {response ->
            val result = response.getString("result")
            System.out.println("response:$result")
        }, {error ->
            System.out.println("response:$error")
        })
```
