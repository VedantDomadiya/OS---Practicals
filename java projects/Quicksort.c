
#include <stdio.h>

int Partition(int *A, int start, int end)
{
    int temp,temp1;
    int Pivot = A[start];
    int i = start;
    int j = end;

    while (i < j)
    {
        while (A[i] < Pivot)
        {
            i++;
        }
        while (A[j] > Pivot)
        {
            j--;
        }
        if (i < j)
        {
            // swapping A[i] and A[j]
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    //swapping A[j] and pivot
    temp1 = A[j];
    A[j] = Pivot;
    Pivot = temp1;

    return j;
}

QuickSort(int *A,int start,int end)
{
    if (start < end)
    {
        int location = Partition(A, start, end);
        QuickSort(A , start, location-1);
        QuickSort(A , location+1, end);
    }
}

void PrintArray(int *A, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", A[i]);
    }
    printf("\n");
}

int main()
{

    int A[] = {3, 5, 75, 78, 23, 43, 57, 32};
    int n = 8;
    int start, end;
    PrintArray(A, n);
    QuickSort(A, 0, n-1);
    PrintArray(A, n);

    return 0;
}