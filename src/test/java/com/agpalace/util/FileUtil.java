package com.agpalace.util;

import java.io.*;

/**
 * Created by dengming on 16/9/5.
 */
public class FileUtil {

    public static StringBuilder read(String file){
        StringBuilder builder=new StringBuilder();
        try {
            FileReader reader = new FileReader(new File(file));
            BufferedReader bufferedReader=new BufferedReader(reader);

            while (true){
                String line=bufferedReader.readLine();
                if (line==null){
                    break;
                } else {
                    builder.append(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder;
    }
}
