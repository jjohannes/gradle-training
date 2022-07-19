package com.example.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Set;

// @CacheableTask
public abstract class CountJar extends DefaultTask {

    // DirectoryProperty
    @InputFiles
    public abstract ConfigurableFileCollection getAllJars();

    @OutputFile
    public abstract RegularFileProperty getCountFile();

    @TaskAction
    public void count() throws IOException {
        Set<File> jarFiles = getAllJars().getFiles();
        File countOut = getCountFile().get().getAsFile();

        Files.write(countOut.toPath(), Collections.singleton("" + jarFiles.size()));
    }

}
