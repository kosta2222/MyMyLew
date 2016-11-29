package com.kosta.test;

/**
 * Created by papa on 29.11.2016.
 */

class Test{
    public Test(String batFolder,String batFile){
        String c1="cmd.exe";
        String c2="/C";
        String c3="cd "+batFolder;
        String c4="&& start "+batFile;
        Runtime r=Runtime.getRuntime();
        Process p=null;
        String cmd[]={c1,c2,c3,c4};
        try{
            p=r.exec(cmd);}
        catch (Exception e) {
            System.out.println("Oshibka zapuska progi["+e+"]");
        }
        System.out.println("MyMy" +
                "u-u-u");

    }
}

class Main{
    public static void main(String args[]){
        new com.kosta.test.Test("D:\\JAVA_CODE\\execMy","run.bat");
    }
}


