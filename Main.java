class Main {
  public static void main(String[] args) 
  {
    System.out.println(" ");

    int result = fileNum(1);
    System.out.println("In a program you notice a /fileClass" + result);

    System.out.println(" ");
 
    int newResult = fileNume(2);
    System.out.println("Ater you access /fileClass" + result + ", You notice that there are " + newResult + " other files");

    System.out.println(" ");

    if(6>5)
    {
    int finalResult = fileNumber(3);
    System.out.println("You then access one of the " + newResult + " new files, and to your suprise you find " + finalResult + " new files.");
    }else{
      System.out.println("Don't give keep looking for /fileX4H3S");
    }

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

  public static int fileNumber(int newFile) 
  {
    if (newFile > 0) 
    {
      return newFile + fileNumber(newFile - 1);
    }else{
      return 0;
    }
  }
}
 