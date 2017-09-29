package main

import "fmt"

func main() {
	var n int
	fmt.Scanf("%d", &n)
	arr := make([]int, n)
	//read input
	for i := 0; i < n; i++ {
		var val int
		fmt.Scanf("%d", &val)
		arr[i] = val
	}
	numberOfSwaps := 0
	for i := 0; i < n; i++ {
		for j := 0; j < n-1; j++ {
			if arr[j] > arr[j+1] {
				//swap
				arr[j+1], arr[j] = arr[j], arr[j+1]
				numberOfSwaps++
			}
		}
		if numberOfSwaps == 0 {
			break
		}
	}
	fmt.Printf("Array is sorted in %d swaps.\n", numberOfSwaps)
	fmt.Printf("First Element: %d\n", arr[0])
	fmt.Printf("Last Element: %d\n", arr[len(arr)-1])
}
