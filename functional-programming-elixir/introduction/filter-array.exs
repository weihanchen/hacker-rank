# Hackerrank - Filter Array Implementation
defmodule Solution do

    defp read_integer, do: IO.gets("") |> String.strip |> String.to_integer

    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)

    defp do_filter(value, upper_limit) when value >= upper_limit, do: nil

    defp do_filter(value, _) do
        IO.puts(value)
    end

    def main() do
        upper_limit = read_integer()
        list = read_list()
        list |> Enum.map(fn x -> do_filter(x, upper_limit) end)
    end
end

Solution.main()