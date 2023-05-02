#include <stdio.h>

void Merge(int A[], int l, int mid, int r)
{
    int i = l;
    int j = mid + 1;
    int k = l;
    int B[r];

    while (i <= mid && j <= r)
    {
        if (A[i] <= A[j])
        {
            B[k] = A[i];
            i++;
        }
        else
        {
            B[k] = A[j];
            j++;
        }
        k++;
    }

    if (i > mid)
    {
        // Copying the remaining elements of the array A[j]
        while (j <= r)
        {
            B[k] = A[j];
            j++;
            k++;
        }
    }
    else
    {
        // Copying the remaining elements of the array A[i]
        while (i <= mid)
        {
            B[k] = A[i];
            i++;
            k++;
        }
    }

    for (k = l; k <= r; k++)
    {
        A[k] = B[k];
    }
}

/* l is for left index and r is right index of the
sub-array of arr to be sorted */
void MergeSort(int A[], int l, int r)
{
    if (l < r)
    {
        // Same as (l+r)/2, but avoids overflow for
        // large l and h
        //int mid = l + (r - l) / 2;

        int mid = (l + r)/2;

        // Sort first and second halves
        MergeSort(A, l, mid);
        MergeSort(A, mid + 1, r);

        Merge(A, l, mid, r);
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

    int A[] = {12, 11, 13, 5, 6, 7};
    int n = 6;
    PrintArray(A, n);
    MergeSort(A, 0, 6);
    PrintArray(A, n);

    return 0;
}