package com.agpalace.leetcode.string;

import com.agpalace.util.FileUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dengming on 16/9/4.
 */
public class LongestAbsoluteFilePathTest {
    private LongestAbsoluteFilePath path=new LongestAbsoluteFilePath();
    @Test
    public void test(){
        String s="dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        t(20, s);
    }

    @Test
    public void test1(){
        String s="dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        Assert.assertTrue(path.lengthLongestPath(s)==32);
    }

    @Test
    public void test2(){
        String s="";
        Assert.assertTrue(path.lengthLongestPath(s)==0);
    }

    @Test
    public void test3(){
        String s="a";
        int res=path.lengthLongestPath(s);
        System.out.println("res:"+res);
        Assert.assertTrue(res==0);
    }

    @Test
    public void test4(){
        String s="a.b";
        int res=path.lengthLongestPath(s);
        System.out.println("res:"+res);
        Assert.assertTrue(res==3);
    }

    @Test
    public void test5(){
        String s="a\n\tb\n\t\tc.txt";
        t(9, s);
    }

    @Test
    public void test6(){
        t(12, "dir\n    file.txt");
    }

    @Test
    public void test7(){
        t(47, "rzzmf\nv\n\tix\n\t\tiklav\n\t\t\ttqse\n\t\t\t\ttppzf\n\t\t\t\t\tzav\n\t\t\t\t\t\tkktei\n\t\t\t\t\t\t\thhmav\n\t\t\t\t\t\t\t\tbzvwf.txt");
    }

    @Test
    public void test8(){
        t(528, "sladjf\n\tlkjlkv\n\t\tlkjlakjlert" +
                "\n\t\t\tlaskjglaksjf\n\t\t\t\tlakjgfljrtlj\n\t\t\t\t\tlskajflakjsvlj" +
                "\n\t\t\t\t\t\tlskgjflkjrtlrjt\n\t\t\t\t\t\t\tlkjglkjlvkjdlvkj\n\t\t\t\t\t\t\t\tlfjkglkjfljdlv" +
                "\n\t\t\t\t\t\t\t\t\tlkdfjglerjtkrjkljsd.lkvjlkajlfk" +
                "\n\t\t\t\t\t\t\tlskfjlksjljslvjxjlvkzjljajoiwjejlskjslfj.slkjflskjldfkjoietruioskljfkljf" +
                "\n\t\t\t\t\tlkasjfljsaljlxkcjzljvl.asljlksaj\n\t\t\t\tasldjflksajf\n\t\t\t\talskjflkasjlvkja" +
                "\n\t\t\t\twioeuoiwutrljsgfjlskfg\n\t\t\t\taslkjvlksjvlkjsflgj\n\t\t\t\t\tlkvnlksfgk.salfkjaslfjskljfv" +
                "\n\t\t\tlksdjflsajlkfj\n\t\t\tlasjflaskjlk\n\t\tlsakjflkasjfkljas\n\t\tlskjvljvlkjlsjfkgljfg" +
                "\n\tsaljkglksajvlkjvkljlkjvksdj\n\tlsakjglksajkvjlkjdklvj\n\tlskjflksjglkdjbkljdbkjslkj\n\t\tlkjglkfjkljsdflj" +
                "\n\t\t\tlskjfglkjdfgkljsdflj\n\t\t\t\tlkfjglksdjlkjbsdlkjbk\n\t\t\t\t\tlkfgjlejrtljkljsdflgjl" +
                "\n\t\t\t\t\tsalgkfjlksfjgkljsgfjl\n\t\t\t\t\tsalkflajwoieu\n\t\t\t\t\t\tlaskjfglsjfgljkkvjsdlkjbklds" +
                "\n\t\t\t\t\t\t\tlasjglriotuojgkjsldfgjsklfgjl\n\t\t\t\t\t\t\t\tlkajglkjskljsdljblkdfjblfjlbjs" +
                "\n\t\t\t\t\t\t\t\t\tlkajgljroituksfglkjslkjgoi\n\t\t\t\t\t\t\t\t\t\tlkjglkjkljkljdkbljsdfljgklfdj" +
                "\n\t\t\t\t\t\t\t\t\t\t\tlkjlgkjljgslkdkldjblkj\n\t\t\t\t\t\t\t\t\t\t\t\tlkjfglkjlkjbsdklj.slgfjalksjglkfjglf" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\tlkasjrlkjwlrjljsl\n\t\t\t\t\t\t\t\t\t\t\t\t\tlksjgflkjfklgjljbljls" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkjsglkjlkjfkljdklbjkldf\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkjglkjdlsfjdglsdjgjlxljjlrjsgjsjlk" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkjsgkllksjfgjljdslfkjlkasjdflkjxcljvlkjsgkljsfg" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlaskjlkjsakljglsdjfgksdjlkgjdlskjb" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkajsgfljfklgjlkdjgfklsdjklj" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkjfglkjlkgjlkjl.aslkjflasjlajglkjaf" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tlkjasflgjlskjglkfjgklgsdjflkbjsdklfjskldfjgklsfdjgklfdjgl" +
                "\n\tlskadjlkjsldwwwwwfj" +
                "\n\t\tlkjflkasjlfjlkjajslfkjlasjkdlfjlaskjalvwwwwwwwwwwwwwwwkjlsjfglkjalsjgflkjaljlkdsjslbjsljksldjlsjdlkjljvblkjlkajfljgasljfkajgfljfjgldjblkjsdljgsldjg.skljf");
    }

    @Test
    public void test9(){
        StringBuilder builder= FileUtil.read("src/test/resources/leetcode/LongestAbsoluteFilePath.input.txt");
        String s=builder.toString().replace("\\n", "\n").replace("\\t","\t");
        System.out.println(s);
        t(473, s);
    }

    private void t(int target, String input){
        int res=path.lengthLongestPath(input);
        System.out.println("res:"+res);
        Assert.assertTrue(res==target);
    }
}
