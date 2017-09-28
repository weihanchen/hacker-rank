package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var i uint64 = 4
	var d float64 = 4.0
	var s string = "HackerRank "
	scanner := bufio.NewScanner(os.Stdin)
	// Declare second integer, double, and string variables
	var (
		inputInt    uint64
		inputDouble float64
		inputString string
		tmpStr      string
	)

	// Read and save an integer, double, and String to your variables.
	fmt.Scanf("%d", &inputInt)
	fmt.Scan(&tmpStr)
	inputDouble, _ = strconv.ParseFloat(tmpStr, 64)
	for scanner.Scan() {
		inputString = scanner.Text()
		break
	}
	fmt.Println(i + inputInt)
	fmt.Printf("%.1f\n", d+inputDouble)
	fmt.Printf("%s%s", s, inputString)

	if err := scanner.Err(); err != nil {
		os.Exit(1)
	}
}
