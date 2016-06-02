package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.file;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{
    private List<File> fileList;

    public List<File> getFileList() {
        return fileList;
    }

    public Directory(String fileName){
        super(fileName);
        this.fileList = new ArrayList<File>();
    }

    public Directory(Directory directory){
        super(directory.getFileName());
        this.fileList = new ArrayList<>(directory.getFileList());
    }

}
