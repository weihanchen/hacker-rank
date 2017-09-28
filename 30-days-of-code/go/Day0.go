package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	for scanner.Scan() {
		s := scanner.Text()
		fmt.Printf("Hello, World.\n%s", s)
	}
	if err := scanner.Err(); err != nil {
		os.Exit(1)
	}
}
