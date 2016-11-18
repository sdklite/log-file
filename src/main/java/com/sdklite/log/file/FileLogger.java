package com.sdklite.log.file;

import com.sdklite.log.AbstractLogger;
import com.sdklite.log.Level;
import com.sdklite.log.Logger;

public class FileLogger extends AbstractLogger {

    private final String name;

    public FileLogger(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Logger println(final Level level, final String msg, final Object... args) {
        // TODO append to file
        return this;
    }

}
