package ARRAYS;
public class HammingDistance {
    /*
    Ques::The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them
     */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    }
