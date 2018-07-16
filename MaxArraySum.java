static int maxSubsetSum(int[] arr) {
        
        int maxsum[] = new int[arr.length];
        maxsum[0] = arr[0];
        maxsum[1] = Math.max(arr[0],arr[1]);
        
        for(int i=2;i<arr.length;i++)
        {
            maxsum[i] = Math.max((maxsum[i-2]+arr[i]),maxsum[i-1]);
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<maxsum[i])
                max = maxsum[i];
        }
        return max;
        


    }