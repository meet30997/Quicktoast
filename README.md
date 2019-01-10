# Quicktoast
Quickest way to show a toast in android!

# Installation
<b>Add it in your root build.gradle :</b>
``` 
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
<b>Add the dependency:</b>

```
dependencies {
	        implementation 'com.github.meet30997:Quicktoast:1.0.0'
	}
  ```
# Usage
<b>Create a object of library class</b>
```
private Quicktoast toast = new Quicktoast(this);
```
<b> There are three types of toast that you can use.</b>
# Simple Toast
<img src="https://drive.google.com/uc?id=11rv-MeXDTlhPM0c1OtN2ik2OOyEGP1-y" height="40" width="200"></img>
1. ```toast.ltoast("Simple");``` // For Simple Long Toast <br><br>
2. ```toast.stoast("Simple");``` // For Simple Short Toast

# Warning Toast
<img src="https://drive.google.com/uc?id=1xQFKIY0jKdfGM_r0_lkgKZ0OOvhKAO-T" height="40" width="200"></img>
1. ```toast.lwarn("Warning");``` // For Warning Long Toast <br><br>
2. ```toast.swarn("Warning");``` // For Warning Short Toast

# Info Toast
<img src="https://drive.google.com/uc?id=1Pd_AStiX5GiYbd36ssOFvbf_sfxG9fnK" height="45" width="200"></img>
1. ```toast.linfo("Info");``` // For Info Long Toast <br><br>
2. ```toast.sinfo("info");``` // For Info Short Toast

# How to contribute?

1. Fork the project. ❤️
2. Make required changes and commit.
3. Generate pull request. Mention all the required description regarding changes you made.
Happy coding.:-)

# License
<b>This Project</b> is licensed under `MIT license`. View [license](LICENSE).
