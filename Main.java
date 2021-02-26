class Main {
  public static void main(String[] args) 
  {
    Systemout.println(" ");

    System.out.println("You notice that you need turn in assignment soon, but to find it you must search through the download file and find /fileX4H3S ");//This starts of the quest for looking for files

    System.out.println(" ");

    int result = fileNum(1);
    System.out.println("On your laptop you find the " + result + "st download file");//A recursive method can be used for searchin files, so I wrote this quick narrative to show how, one file leads into another and keeps branching

    System.out.println(" ");
 
    int newResult = fileNume(2);
    System.out.println("Ater you access the " + result + "st download file, You notice that there are " + newResult + " other download files. Sadly none of them are /fileX4H3S");//after accesing one file the character finds 3 subfiles

    System.out.println(" ");

    if(6>5)
    {
    int finalResult = fileNumber(3);
    System.out.println("You then access one of the " + newResult + " other download files, and to your suprise you find /fileX4H3S, amongst " + finalResult + " new files.");
    }else{
      System.out.println("Don't give keep looking for /fileX4H3S");
    }
    //By choosing one of the three subfiles the charater finds 6 othe files, and this could go on forever. After accessing one of the 6 files he could find 12 new files and so on

  }

  public static int fileNum(int file) 
  {
    if (file > 0) 
    {
      return file + fileNum(file - 1);
    }else{
      return 0;
    }
  }//This is a simple addition recursive method, just like all the other ones below. 

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
 