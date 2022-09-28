package my.company;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.CacheableTask;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Set;

@CacheableTask
abstract public class JarCount extends DefaultTask {

    // RegularFileProperty <-- @InputFile / @OutputFile
    // DirectoryProperty <-- @InputDirectory / @OutputDirectory
    // ConfigurableFileCollection <-- @InputFiles / @OutputFiles

    // @Input
    // abstract Property<String> getVersion();

    @InputFiles
    @PathSensitive(PathSensitivity.NAME_ONLY)
    public abstract ConfigurableFileCollection getAllJars();

    @OutputFile
    public abstract RegularFileProperty getCountFile();

    @TaskAction
    public void count() throws IOException {
        Set<File> files = getAllJars().getFiles();
        File countFile = getCountFile().get().getAsFile();
        Files.write(countFile.toPath(), Collections.singleton("" + files.size()));
    }
}
