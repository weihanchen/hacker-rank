package main

import "fmt"

func factorial(n int) int {
	if n <= 1 {
		return n
	}
	return n * factorial(n-1)
}

func main() {
	var n int
	fmt.Scanf("%d", &n)
	result := factorial(n)

	fmt.Println(result)
}
