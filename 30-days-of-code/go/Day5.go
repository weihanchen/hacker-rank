package main

import "fmt"

func main() {
	const MULTIPLES int = 10
	var n int
	fmt.Scanf("%d", &n)
	for i := 1; i <= MULTIPLES; i++ {
		fmt.Printf("%d x %d = %d\n", n, i, n*i)
	}
}
