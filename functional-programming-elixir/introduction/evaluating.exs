# Hackerrank - Evaluating e^x
defmodule Solution do
    @max_terms 10

    defp read_integer, do: IO.gets("") |> String.strip |> String.to_integer
    defp read_float, do: IO.gets("") |> String.strip |> String.to_float

    defp factorial(n) when n <= 1, do: n

    defp factorial(n), do: n * factorial(n - 1)

    # recursive start
    defp calculate(value), do: calculate(value, 1, 1.0)

    # recursive end
    defp calculate(_, n, result) when n >= @max_terms, do: result

     # recursive content
    defp calculate(value, n, result) do
        dividend = factorial(n)
        divisor = :math.pow(value, n)
        total = result + divisor / dividend
        calculate(value, n + 1, total)
    end

    defp result do
        read_float()
            |> calculate
            |> Float.to_string(decimals: 4)
            |> IO.puts
    end

    def main() do
        n = read_integer()
        Enum.each(0..n, fn _ -> result() end)
    end
end

Solution.main()