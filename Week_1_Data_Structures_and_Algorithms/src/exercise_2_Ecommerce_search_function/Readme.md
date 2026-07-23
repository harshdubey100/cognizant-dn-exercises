Exercise 2: E-commerce Platform Search Function Scenario: You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance. Steps:

Understand Asymptotic Notation: o Explain Big O notation and how it helps in analyzing algorithms.

Answer: Asymptotic notatin is a mathematical notation by which we can analyze how the space and time requirement grows when we increase the size of input.

Big O notation represents the asymptotic upper bound on the growth rate of an algorithm's time or space complexity.

Describe the best, average, and worst-case scenarios for search operations.

Answer: best case: in linear search if the elemnt found at the very first position of the array. - means minimum number of iterations required. average case: if the element found somewhere in middle. meansneither the minimum time nor the best. worst case: means if the element found at very last index of an array. the maximum time used to find that value.

Setup: o Create a class Product with attributes for searching, such as productId, productName, and category.

Implementation: o Implement linear search and binary search algorithms. o Store products in an array for linear search and a sorted array for binary search.

Analysis: o Compare the time complexity of linear and binary search algorithms.

Answer: the binary search is faster in worst case with O(log n). while in worst case linear search takes O(n) time. while the best case of linear search can find in just constant time.

o Discuss which algorithm is more suitable for your platform and why. Answer: