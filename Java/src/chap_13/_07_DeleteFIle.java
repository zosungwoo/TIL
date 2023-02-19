package chap_13;

import java.io.File;

public class _07_DeleteFIle {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공: " + file.getName());
            } else {
                System.out.println("파일 삭제 실패: " + file.getName());
            }
        }

        File folder = new File("A");
        if (folder.exists()){
            if (folder.delete()) {   // 폴더가 비어있는 경우에만 삭제 가능
                System.out.println("폴더 삭제 성공: " + folder.getAbsolutePath());
            } else{
                System.out.println("폴더 삭제 실퍠: " + folder.getAbsolutePath());
            }
        }

        deleteFolder(folder);  // 폴더 안에 있는 내용까지 삭제
    }

    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){
            for (File file : folder.listFiles()) {
                    deleteFolder(file);
            }
        }
        return folder.delete();
    }
}
