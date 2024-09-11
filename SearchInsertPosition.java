public class SearchInsertPosition 
{
    public int searchInsert(int[] array, int target) 
    {
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] == target)
            {
                return i;
            }
            else if(array[i] > target)
            {
                return i;
            }
        }
        return array.length;
    }
}
