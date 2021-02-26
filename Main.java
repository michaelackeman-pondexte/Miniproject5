class Main {
  public static void main(String[] args) 
  {
    System.out.println(" ");

    int result = fileNum(1);
    System.out.println("In a program you notice a /fileClass" + result);

    System.out.println(" ");

    int newResult = fileNume(2);
    System.out.println("Ater you access /fileClass" + result + ", You notce that there are " + newResult + " other files");
  }

  public static int fileNum(int file) 
  {
    if (file > 0) 
    {
      return file + fileNum(file - 1);
    }else{
      return 0;
    }
  }

public static int fileNume(int files) 
  {
    if (files > 0) 
    {
      return files + fileNume(files - 1);
    }else{
      return 0;
    }
  }
}
 