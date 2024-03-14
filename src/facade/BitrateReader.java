package facade;

import facade.Codec;
import facade.VideoFile;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("facade.BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("facade.BitrateReader: writing file...");
        return buffer;
    }
}
