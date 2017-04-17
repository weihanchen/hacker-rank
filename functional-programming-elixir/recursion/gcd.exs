# Hackerrank - Computing the GCD
defmodule Solution do
    defp read_integers, do: IO.gets("") |> String.strip |> String.split(" ")
        |> Enum.map(fn x -> String.to_integer(x) end)
    
    defp gcd([a, b]) when a > b, do: gcd(a, b)

    defp gcd([a, b]) when b > a, do: gcd(b, a)

    defp gcd(a, b) when rem(a, b) == 0, do: b

    defp gcd(a, b) do
        remainder = rem(a, b)
        gcd(b, remainder)
    end

    def main() do
        read_integers()
            |> gcd
            |> IO.puts
    end
end

Solution.main()