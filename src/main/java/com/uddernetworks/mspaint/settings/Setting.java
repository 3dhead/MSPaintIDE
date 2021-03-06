package com.uddernetworks.mspaint.settings;

import com.uddernetworks.mspaint.main.MainGUI;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

import static com.uddernetworks.mspaint.settings.SettingType.*;

public enum Setting {
    OPEN_PROJECT("openProject", "", STRING),
    DARK_THEME("darkTheme", true, BOOLEAN),
    DATABASE_USE_INTERNAL("databaseUseInternal", true, BOOLEAN),
    DATABASE_INTERNAL_LOCATION("databaseInternalLocation", MainGUI.APP_DATA + File.separator + "database", STRING),
    DATABASE_URL("databaseURL", "", STRING),
    DATABASE_USER("databaseUser", "", STRING),
    DATABASE_PASS("databasePass", "", STRING),
    HEADLESS_FONT("headlessFontName", "Comic Sans MS", STRING),
    HEADLESS_FONT_CONFIG("headlessFontPath","fonts/ComicSans", STRING),
    TRAIN_IMAGE("trainImage", "/train.png", STRING),
    OCR_DEBUG("ocrDebug", false, BOOLEAN),
    EDIT_FILE_SIZE("editFileFontSize", 48, INT), // The font size that files are generated in
    TRAIN_LOWER_BOUND("trainGenLowerBound", 30, INT),
    TRAIN_UPPER_BOUND("trainGenUpperBound", 90, INT),
    TASKBAR_ICON("taskbarIcon", "Colored", STRING),
    ACTIVE_THEME_NAME("activeTheme", "Default", STRING),
    THEMES("themes", Map.of("Default", "themes/default.css", "Extra Dark", "themes/extra-dark.css"), STRING_STRING_MAP),
    INJECT_AUTO_NEW("injectAutoNew", true, BOOLEAN),
    INJECT_AUTO_OPEN("injectAutoOpen", true, BOOLEAN),
    INJECT_AUTO_CONTEXT("injectAutoContext", true, BOOLEAN),
    INCOMPATIBLE_LANGUAGE_ERRORS("incompatibleLanguageErrors", true, BOOLEAN);

    private final String name;
    private Object def;
    private final SettingType settingType;

    Setting(String name, Object def, SettingType settingType) {
        this.name = name;
        this.def = def;
        this.settingType = settingType;
    }

    public String getName() {
        return name;
    }

    public Object getDefault() {
        return this.def;
    }

    public SettingType getSettingType() {
        return settingType;
    }

    public static Setting fromName(String name) {
        return Arrays.stream(values()).filter(setting -> setting.name.equals(name)).findFirst().orElse(null);
    }
}
