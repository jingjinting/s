import java.io.File;

public class SHOW {
    public static void main(String[] args) {
        File file =new File("F:\\0109\\a");
        men(file);
    }
    public static void men(File file){
            if(file.isDirectory()){
                File files[]=file.listFiles();
                for(File f:files){
                    men(f);
                }
            }else{
                System.out.println(file.getName());
        }
    }
}
