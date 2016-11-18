package com.sdklite.log.file;

import org.junit.Assert;
import org.junit.Test;

import com.sdklite.log.Logger;
import com.sdklite.log.LoggerFactory;

public class TestFileLogger {

    @Test
    public void obtain_file_logger() {
        final Logger logger = LoggerFactory.getLogger("File");
        Assert.assertNotNull(logger);
        Assert.assertEquals(FileLogger.class, logger.getClass());
    }

}
