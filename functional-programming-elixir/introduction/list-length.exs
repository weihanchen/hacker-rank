# Hackerrank - List Length
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)

    def main() do
        read_list()
            |> length
            |> IO.puts
    end
end

Solution.main()