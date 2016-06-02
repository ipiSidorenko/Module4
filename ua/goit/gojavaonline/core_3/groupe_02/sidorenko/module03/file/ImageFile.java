package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.file;

public class ImageFile extends File{

    ImageFile(String fileName){
        super(fileName);
    }

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


}
