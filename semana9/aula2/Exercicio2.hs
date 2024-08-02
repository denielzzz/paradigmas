module Exercicio2 where

tuplas :: Int -> (Int, Int, Int, Int)
tuplas x = (x*2, x*3, x*4, x*5)

tuplas2 :: Int -> (Int, String)
tuplas2 x = (x, if mod x 2 == 0 then "par" else "impar")

somaMul :: [Int] -> (Int, Int)
somaMul [] = (0, 1)
somaMul (h:t)
    | h >= 0 = (h+positivos, negativos)
    | h < 0 = (positivos, h*negativos)
    where
        (positivos, negativos) = somaMul t

type Nome = String
type Avaliacao = Int
type Tipo = String
type PontoTuristico = (Nome, Avaliacao, Tipo)

visitar :: [PontoTuristico] -> Avaliacao -> [(Nome, Avaliacao)]
visitar [] x = []
visitar (h:t) x
    | avaliacao >= x && (tipo == "museu" || tipo == "parque") = [(nome, avaliacao)]++visitar t x
    | otherwise = visitar t x
    where (nome, avaliacao, tipo) = h