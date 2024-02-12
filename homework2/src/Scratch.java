import java.util.Arrays;

class Scratch {
    public static void main(String[] args) {
        double[] numbers = new double[]{0,100};
        one_hundred_sum(numbers);
    }
    public static boolean one_hundred_sum(double[] arr)
    {
        int left_index = 0;
        int right_index = arr.length -1;

        while (left_index < (arr.length /2))
        {
            if(arr[left_index] + arr[right_index] != 100)
            {
                return false;
            }
            left_index += 1;
            right_index -= 1;
        }
        return true;
    }

    public static boolean find_needle(String needle, String haystack)
    {
        int needle_index = 0;
        int haystack_index = 0;
        boolean found_needle;
        while (haystack_index < haystack.length()) {
            if (needle.charAt(needle_index) == haystack.charAt(haystack_index)) {
                found_needle = true;
                while (needle_index < needle.length()) {
                    if (needle.charAt(needle_index) != haystack.charAt(haystack_index + needle_index))
                        found_needle = false;
                    needle_index += 1;
                }
                if (found_needle)
                    return true;
                needle_index = 0;
            }
            haystack_index += 1;
        }
        return false;
    }

    public static double largest_product(double[] arr) {
        if (arr.length >= 3)
        {
            double largest_product_so_far = arr[0] * arr[1] * arr[2];
            int i = 0;
            while (i < arr.length) {
                int j = i + 1;
                while (j < arr.length) {
                    int k = j + 1;
                    while (k < arr.length) {
                        if (arr[i] * arr[j] * arr[k] > largest_product_so_far)
                            largest_product_so_far = arr[i] * arr[j] * arr[k];
                        k += 1;
                    }
                    j += 1;
                }
                i += 1;
            }
            return largest_product_so_far;
        }
        return 0;
    }

    public int total_prefix(int[] arr)
    {
        int n = arr.length;
        int prefix = 0;
        int total = 0;
        for (int j = 0; j< n; j++)
        {
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }

    public int pick_resume(int[] resumes)
    {
        String eliminate = "top";

        while (resumes.length > 1)
        {
            if ( eliminate == "top")
            {
                resumes = Arrays.copyOfRange(resumes,resumes.length /2, resumes.length -1);
                //Arrays.copyOfRange(original,from,to) returns a new array starting from 'from' index and ending at 'to' index
                eliminate = "bottom";
            }
            else {
                resumes = Arrays.copyOfRange(resumes, 0, resumes.length / 2);
                eliminate = "top";
            }
        }
        return resumes[0];

    }



}