# Avatar Tinder View
Avatar Tinder View is a library that allows you to create a view for change avatar like app tinder.


  ![demo](ScreenShots/demo.gif)
---

# Table of Contents

1. [Gradle Dependency](https://github.com/ATHBK/AvatarTinderView#gradle-dependency)
   1. [Repository](https://github.com/ATHBK/AvatarTinderView#repository)
   2. [Dependency](https://github.com/ATHBK/AvatarTinderView#dependency)
2. [Basic Usage](https://github.com/ATHBK/AvatarTinderView#basic-usage)
   1. [IndicatorView XML](https://github.com/ATHBK/AvatarTinderView#indicatorview-xml)
   2. [Attributes](https://github.com/ATHBK/AvatarTinderView#indicator-attr )
3. [Init Java](https://github.com/ATHBK/AvatarTinderView#init-from-java)
4. [License](https://github.com/ATHBK/AvatarTinderView#license)

   
---

# Gradle Dependency


#### Repository

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

#### Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
	compile 'com.github.ATHBK:AvatarTinderView:v1.3'
}
```

---

# Basic Usage

#### XML

To use this AvatarTinderView in your layout simply copy and paste the xml below. This provides the default AvatarTinderView. 

```xml
<com.athbk.avatarview.TinderRecyclerView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/recyclerView">
```
#### AvatarTinderView Attr 

```xml
 	....
	app:spanCount="2"
	app:aspectRatio="1f"
  	app:numberColoum="3"
```
---

# Init from Java

#### Java

How to use in . 
1. Class Adapter must extends TinderRVAdapter
2. Declare TinderRecyclerView in framgent or activiy:

```java	
	AvatarAdapter adapter = new AvatarAdapter(this, listString);
  	recyclerView.initRecyclerView(this, adapter);
```

---
# License

    Copyright 2017 ATHBK

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
