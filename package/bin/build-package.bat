set MODULE_PATH=%1
set INPUT=%2
set OUTPUT=%3
set JAR=%4
set VERSION=%5
set APP_ICON=%6

call "C:\Users\RubbaBoy\Downloads\openjdk-13-jpackage+49_windows-x64_bin\jdk-13\bin\jpackage.exe" ^
    --verbose ^
    --echo-mode ^
    --add-modules "java.base,javafx.controls,javafx.fxml" ^
    --input "%INPUT%" ^
    --output "%OUTPUT%" ^
    --name "MSPaintIDE" ^
    --main-jar "%JAR%" ^
    --jvm-args "--add-opens javafx.base/com.sun.javafx.reflect=ALL-UNNAMED --add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens java.base/jdk.internal.loader=ALL-UNNAMED --add-opens javafx.graphics/com.sun.javafx.scene=ALL-UNNAMED --add-opens javafx.base/com.sun.javafx.collections=ALL-UNNAMED --illegal-access=deny" ^
    --icon "%APP_ICON%" ^
    --class "com.uddernetworks.mspaint.main.JFXWorkaround" ^
    --copyright "Copyright © 2019 Adam Yarris" ^
    --description "MS Paint IDE" ^
    --vendor "Adam Yarris" ^