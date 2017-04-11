n = IO.gets("") |> String.strip |> String.to_integer
IO.stream(:stdio, :line)
  |> Enum.map(&String.strip/1)
  |> Enum.flat_map(&Enum.map(1..n, fn _ -> &1 end))
  |> Enum.each(&IO.puts(&1))
