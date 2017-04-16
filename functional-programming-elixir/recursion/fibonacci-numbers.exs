# Hackerrank - Fibonacci Numbers
defmodule Solution do
    defp read_integer, do: IO.gets("") |> String.strip |> String.to_integer

    defp fibonacci(0), do: 0

    defp fibonacci(1), do: 0

    defp fibonacci(2), do: 1

    defp fibonacci(n) do
        fibonacci(n - 1) + fibonacci(n - 2)
    end
    
    def main() do
        read_integer()
            |> fibonacci
            |> IO.puts
    end
end

Solution.main()