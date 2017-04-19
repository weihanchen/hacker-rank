# Hackerrank - Pascal Triangle
defmodule Solution do
    defp read_integer, do: IO.gets("") |> String.strip |> String.to_integer

    defp triangle(n), do: triangle(n - 1, [1], [[1]])

    defp triangle(0, _, results), do: results

    defp triangle(n, last_row, results) do
        next_row = Enum.zip([[0] ++ last_row, last_row ++ [0]])
                        |> Enum.map(fn {a, b} -> a + b end)
        triangle(n - 1, next_row, results ++ [next_row])
    end

    defp print(results) do
        Enum.map(results, fn x -> Enum.join(x, " ") end)
            |> Enum.join("\n")
            |> IO.puts
    end

    def main() do
        read_integer()
            |> triangle
            |> print
    end
end

Solution.main()