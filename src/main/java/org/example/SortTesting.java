package org.example;

import java.net.Inet4Address;

public class SortTesting {
    public int[] data = new int[1000];
    public int arraySize = 1000;
    public void generateRandomArray()
    {
        for (int i = 0; i < data.length; i++)
        {
            data[i] = (int) (Math.random()*10000);
        }
    }

    public void printArray() {
        System.out.println("---------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | " + data[i] + " |\n");
            System.out.println("----------");
        }
    }

    public void swapValues(int first, int second)
    {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public void bubbleSort()
    {
        for (int i = arraySize - 1; i > 0 ; i--)
        {
            for (int j = 0; j < i ; j++)
            {
                if(data[j] > data[j + 1])
                {
                    swapValues(j, j + 1);
                }
            }
            printArray();
        }
    }

    public void selectionSort()
    {
        for(int i = 0; i < arraySize; i++)
        {
            int min = i;
            for (int j = i; j < arraySize; j++)
            {
                if(data[min] > data[j])
                {
                    min = j;
                }
            }
            swapValues(i, min);
            printArray();
        }
    }
}
