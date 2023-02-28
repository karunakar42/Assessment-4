class Rulingpair { 
	static int RulingPair(int arr[], int n) { 
           int ans = -1;
	        if (n == 0 || n == 1)
	            return ans;
	        Map<Integer, Integer> hm = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            int d = sum(arr[i]);
	            if (hm.containsKey(d)) {
	                int s = hm.get(d) + arr[i];
	                ans = Math.max(ans, s);
	                hm.put(d, Math.max(arr[i], hm.get(d)));
	            } else
	                hm.put(d, arr[i]);
	        }
	        return ans;
	    }

	    static int sum(int n) {
	        int sum = 0;
	        while (n > 0) {
	            int k = n % 10;
	            sum += k;
	            n = n / 10;
	        }
	        return sum;
	    }
}