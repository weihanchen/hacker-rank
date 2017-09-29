package main

import "fmt"

func make2DArray(x int, y int) [][]int {
	arr := make([][]int, y)
	for i := range arr {
		arr[i] = make([]int, x)
	}
	return arr
}

func main() {
	const (
		MAXUNIT = ^uint(0)
		MINUNIT = 0
		MAXINT  = int(MAXUNIT >> 1)
		MININT  = -MAXINT - 1
	)

	arr := make2DArray(6, 6)
	hourGlassRowCol := 3
	hourGlassSize := len(arr) - hourGlassRowCol + 1
	maximum := MININT
	for i := 0; i < 6; i++ {
		for j := 0; j < 6; j++ {
			var n int
			fmt.Scanf("%d", &n)
			arr[i][j] = n
		}
	}
	for i := 0; i < hourGlassSize; i++ {
		for j := 0; j < hourGlassSize; j++ {
			sum := arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]

			if sum > maximum {
				maximum = sum
			}
		}
	}
	fmt.Println(maximum)
}
