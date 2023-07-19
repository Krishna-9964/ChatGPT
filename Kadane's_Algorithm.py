def max_subarray_sum(arr):
    max_sum = arr[0]  # Initialize the maximum sum with the first element of the array
    current_sum = arr[0]  # Initialize the current sum with the first element

    for num in arr[1:]:  # Start from the second element of the array
        # Check if adding the current element to the current sum is greater than the current element alone
        current_sum = max(num, current_sum + num)
        # Update the maximum sum if the current sum is greater
        max_sum = max(max_sum, current_sum)

    return max_sum

# Test the function
arr = [1, -3, 4, -2, -1, 6]
print(max_subarray_sum(arr))  # Output: 7 (The subarray [4, -2, -1, 6] has the maximum sum)
