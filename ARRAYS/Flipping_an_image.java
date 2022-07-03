package ARRAYS;
/*
Ques:
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
Approach:: first swap elements of each row and then check if they are 0 or  1 : and then replace them accordingly.
 */
public class Flipping_an_image {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int p=0,j=image[i].length-1;
            while(p<j)// swaps the elements
            {
                int temp=image[i][p];
                image[i][p]=image[i][j];
                image[i][j]=temp;
                p++;j--;
            }
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }return image;
    }
}
