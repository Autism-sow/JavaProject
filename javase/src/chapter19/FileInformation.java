package chapter19;

import org.junit.Test;

import java.io.File;

/**
 * @author Mr.Xiao
 * @date 2022/07/07 19:12
 * @Contain
 **/
@SuppressWarnings("all")
public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    //获取文件的信息
    public void info() {
        File file = new File("C:\\Users\\Bing\\Desktop\\learn\\news1.txt");

        //调用对应的方法，得到对应的信息
        System.out.println("文件名字= " + file.getName());
        System.out.println("文件绝对路径= " + file.getAbsolutePath());
        System.out.println("文件父级目录= " + file.getParent());
        System.out.println("文件大小(字节)= " + file.length());
        System.out.println("文件是否存在= " + file.exists());
        System.out.println("是不是一个文件= " + file.isFile());
        System.out.println("是不是一个目录= " + file.isDirectory());
    }
}
