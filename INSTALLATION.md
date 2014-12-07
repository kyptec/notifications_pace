Installation Guide
===
Sideloading the .apk file

1. To install the .apk, open Android Settings.
2. Under the security tab, ensure that the “Unknown Sources” box is checked. This box will allow installation of non-market applications. 
3. Some specific roms or skins have hidden the ability to access developer options. 
4. Load the .apk file onto your phone and run the installation. Using a third party file manager will allow more freedom when browsing your android file system. 
5. After installing, you will be prompted to open the application.

Running the emulator

1. Ensure you have Intel HAXM installed. Intel HAXM stands for Hardware Accelerated Execution Manager. Android Studios uses HAXM to run the Android emulator. 
2. Create a virtual device under the Android AVD Manager. This will allow you to later choose a device to emulate the application. For our application, we will be using an Android phone. Choose any version of Android above 4.0.2 (Ice Cream Sandwich). Our application is verified to run on a Nexus 5 with Android 5.0 (Lollipop). 
3. After building the app, run it and select your device previously created. 
4. The Android Emulator will boot and launch your version of Android. Upon unlocking the login screen, the application should launch itself.
5. If it does not start itself, you can manually open the application.
