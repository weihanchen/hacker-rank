package main

import "fmt"

func getMaxContinusCount(num int, continusCount int, maxCount int) int {
	digital := num % 2
	if digital == 1 {
		continusCount++
	} else {
		continusCount = 0
	}
	if continusCount > maxCount {
		maxCount = continusCount
	}
	if num > 0 {
		return getMaxContinusCount(num/2, continusCount, maxCount)
	}
	return maxCount
}

func main() {
	var n int
	fmt.Scanf("%d", &n)
	result := getMaxContinusCount(n, 0, -1)
	fmt.Println(result)
}
