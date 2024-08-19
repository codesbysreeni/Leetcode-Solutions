class AddBinary {
    public String addBinary(String a, String b) {        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String final_sum = "";

        while (i > j) 
        {
            b = "0" + b;
            j++;
        }
        while (j > i) 
        {
            a = "0" + a;
            i++;
        }

        for(int k=i; k>=0 ; k--)
         {
            int x1 = a.charAt(k) - '0'; 
			int x2 = b.charAt(k) - '0'; 
		
			int sum = x1 + x2 + carry;

			if(sum == 0) 
			{
                final_sum = "0" + final_sum;
                carry = 0;
			}
            else if(sum == 1)
			{
				final_sum = "1" + final_sum;
                carry = 0;
            }
			else if(sum == 2)
			{
                final_sum = "0" + final_sum;
                carry = 1;
            }
			else
			{
				final_sum = "1" + final_sum;
                carry = 1;
            }
        }

		if (carry > 0) 
		{
            final_sum = "1" + final_sum;
        }
		return final_sum;
    }
    public static void main(String[] args) 
    {
        String a = "1101";
        String b = "111";
        AddBinary ab=new AddBinary();
        System.out.println(ab.addBinary(a, b));
    }
}
