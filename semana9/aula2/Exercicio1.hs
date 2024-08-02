module Exercicio1 where

somaLista :: [Int] -> Int
somaLista [] = 0
somaLista (h:t) = h + somaLista t

somaParesLista :: [Int] -> Int
somaParesLista [] = 0
somaParesLista (h:t)
    | mod h 2 == 0 = h + somaParesLista t
    | otherwise = somaParesLista t

inverteLista :: [Float] -> [Float]
inverteLista [] = []
inverteLista (h:t) = inverteLista t ++ [h]

apenasA :: [String] -> [String]
apenasA [] = []
apenasA (h:t)
    | head h == 'A' = h : apenasA t
    | otherwise = apenasA t
