# Hackerrank - Array Of N Elements
defmodule Solution do
    defp read_integer, do: IO.gets("") |> String.strip |> String.to_integer

    defp print_list(list) do
        IO.inspect(list, limit: :infinity)
    end

    defp generate_list(num, list) when num <= 0 do
        list
    end

    defp generate_list(num, list) do
        new_value =  length(list)
        new_list =  list ++ [new_value]
        next_num = num - 1
        generate_list(next_num, new_list)
    end

    defp generate_list(num) do
        generate_list(num, [])
    end

    def main() do
        read_integer()
            |> generate_list
            |> print_list
    end
end

Solution.main