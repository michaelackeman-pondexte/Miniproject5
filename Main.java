class Main {
  public static void main(String[] args) 
  {
    int result = fileNum(8);
    System.out.println("/fileClass" + result);
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
}