module Teste where

ehPrimo :: Int -> Bool
ehPrimo n = if [x | x <- [2..floor (sqrt (fromIntegral n))], mod n x == 0] == []
    then True
    else False

quickSort :: [Int] -> [Int]
quickSort [] = []
quickSort (h:t) = quickSort ([ x | x <- t, (x < h) == True]) ++ [h] ++ quickSort ([ x | x <- t, (x >= h) == True])

tuplaTipos :: [Int] -> (Int, Int)
tuplaTipos [] = (0, 0)
tuplaTipos (h:t)
    | mod h 2 == 0 = (1 + fst (tuplaTipos t), snd (tuplaTipos t))
    | otherwise = (fst (tuplaTipos t), 1 + snd (tuplaTipos t))

tuplaTipos2 :: [Int] -> (Int, Int)
tuplaTipos2 [] = (0, 0)
tuplaTipos2 (h:t)
    | mod h 2 == 0 = (1 + pares, impares)
    | otherwise = (pares, 1 + impares)
    where
        (pares, impares) = tuplaTipos2 t

type NomeAluno = String 
type MediaNota = Int 
type Aluno = (NomeAluno, MediaNota) 
type Turma = [Aluno] 
aprovados :: [Aluno] -> Int -> [NomeAluno]
aprovados [] x = []
aprovados (h:t) x
    | nota >= x = nome:aprovados t x
    | otherwise = aprovados t x
    where
        nome = fst h
        nota = snd h