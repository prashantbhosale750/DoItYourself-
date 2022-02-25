//array madhil sarv "0" array chya end la push karne bro
class Move0end
{
   
    static void MoveZerosToEnd(int arr[], int n)
    {
        int count = 0; 
     
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
 
        while (count < n)
            arr[count++] = 0;
    }
 
    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        MoveZerosToEnd(arr, n);
        System.out.println("Array after moveing zeros to the end: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}