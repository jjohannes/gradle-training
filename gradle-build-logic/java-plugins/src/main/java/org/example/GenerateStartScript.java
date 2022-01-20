package org.example;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@CacheableTask
abstract public class GenerateStartScript extends DefaultTask {

    @Input
    abstract public Property<String> getMainClass();

    @InputFiles
    @PathSensitive(PathSensitivity.NAME_ONLY)
    abstract public ConfigurableFileCollection getClasspath();

    @OutputFile
    abstract public RegularFileProperty getScriptFile();

    @TaskAction
    public void generate() throws IOException {
        String main = getMainClass().get();
        File scriptOut = getScriptFile().get().getAsFile();

        Files.writeString(scriptOut.toPath(), "java -cp 'libs/*' " + main);
        // Files.setPosixFilePermissions(scriptOut.toPath(), new HashSet<>(Arrays.asList(
        //         OWNER_READ, OWNER_WRITE, OWNER_EXECUTE,
        //         GROUP_READ, GROUP_EXECUTE,
        //         OTHERS_EXECUTE, OTHERS_READ
        // )));
    }


}
