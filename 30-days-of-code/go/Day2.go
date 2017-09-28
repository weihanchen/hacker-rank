package main

import (
	"fmt"
	"math"
)

func round(f float64) uint64 {
	return uint64(math.Floor(f + .5))
}

func main() {
	var (
		mealCost   float64
		tipPercent float64
		taxPercent float64
	)

	fmt.Scan(&mealCost)
	fmt.Scan(&tipPercent)
	fmt.Scan(&taxPercent)

	tipCost := tipPercent / 100 * mealCost
	taxCost := taxPercent / 100 * mealCost
	totalCost := tipCost + taxCost + mealCost

	fmt.Printf("The total meal cost is %d dollars.", round(totalCost))

}
