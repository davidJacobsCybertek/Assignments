package Homeworks.Assignment_14;

public class Phone {
}



class ImagePhone extends Phone{
    int imageSize, memorySize;

    public ImagePhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }
    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}