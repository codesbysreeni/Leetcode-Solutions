class RelativeRanks 
{
    public String[] findRelativeRanks(int[] score)
    {
        int n = score.length;
        String[] result = new String[n];

        int[] sortedScore = Arrays.copyOf(score, n);
        Arrays.sort(sortedScore);

        Map<Integer, String> rankMap = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) 
        {
            if (i == n - 1) 
            {
                rankMap.put(sortedScore[i], "Gold Medal");
            }
            else if (i == n - 2) 
            {
                rankMap.put(sortedScore[i], "Silver Medal");
            }
            else if (i == n - 3) 
            {
                rankMap.put(sortedScore[i], "Bronze Medal");
            }
            else 
            {
                rankMap.put(sortedScore[i], String.valueOf(n - i));
            }
        }

        for (int i = 0; i < n; i++) 
        {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }
}
