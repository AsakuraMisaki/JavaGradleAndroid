# java develop in sublime

## require

* jdk

>path: absolute path like d:\java\bin\; or set java_home(unlimit) at frist then set path: `set java_home=d:\java\bin\``set path=somepath;%java_home%` (windows), do not forget the lase \ because of the *explanation facility解释机制* for path of sublime
>classpath: when you try importing(like import org.junit.Test) other classes besides java original classes, you must add them in your classpath: `set CLASSPATH=.;d:\junit\junit.jar;` .; is neccessary if you want to use the classes in current file location; see https://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html for total info;
>classpath extends: when compiling a java file, java will find the classes you imported in java original classes and current file location, import success if find the imported classes: so classpath is always contains the path of classes you imported, for .class file, its package path should be added to classpath, for .jar file(which is actually the package of classes), itself should be added to classpath;

* sublime text 3

**(!) after setting path&classpath, restart your sublime because the config for java will not refresh automatically until restart sublime**

## some notes about environment variable

* software predefined variables

>like %SystemRoot%(path) INTEL_DEV_REDIST(variable name) %INTEL_DEV_REDIST%(path), these variables are added by the *particular特定的* software, like windows or autodesk, you should not change their name or value to make sure the softwares can *naturally正常地* run 

* user-defined variables

>like java_home(variable name) %java_home%(path), these variables are just for convenience, you can use any legal name instead, but remember make sure that the path/value is right

* %name%

>Define an environment variable named name, then you can *quote引用* it in other variables by using two %