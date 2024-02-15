            } else if (num > secondLargest) {
                secondLargest = num
            }

            if (num <= smallest) {
                secondSmallest = smallest
                smallest = num
            } else if (num < secondSmallest) {
                secondSmallest = num
            }
        }

        return (largest * secondLargest) - (smallest * secondSmallest)
    }
}
[5,6,2,7,4]
