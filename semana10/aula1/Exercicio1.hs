module Exercicio1 where

retornaTupla1 :: (String, String, Char) -> String
retornaTupla1 x = x1
    where
        (x1, x2, x3) = x

retornaTupla2 :: (String, String, Char) -> String
retornaTupla2 x = x2
    where
        (x1, x2, x3) = x

retornaTupla3 :: (String, String, Char) -> Char
retornaTupla3 x = x3
    where
        (x1, x2, x3) = x

base :: Int -> (String, String, Char)
base x              
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", "ninguem", 'x')

retornaNumMestres :: [(String, String, Char)] -> Int
retornaNumMestres [] = 0
retornaNumMestres (h:t) = if retornaTupla2 h == "mestre" then 1+retornaNumMestres t else retornaNumMestres t

retornaNumDout :: [(String, String, Char)] -> Int
retornaNumDout [] = 0
retornaNumDout (h:t) = if retornaTupla2 h == "doutor" then 1+retornaNumDout t else retornaNumDout t

retornaMD :: [(String, String, Char)] -> ([(String, String, Char)] -> Int) -> Int
retornaMD [] _ = 0
retornaMD x f = f x 

returnSra :: String -> String
returnSra x = "Sra."++x

returnSr :: String -> String
returnSr x = "Sr."++x

returnSrta :: String -> String
returnSrta x = "Srta."++x

opanaoseioque :: [String] -> (String -> String) -> [String]
opanaoseioque [] _ = []
opanaoseioque (h:t) f = f h : opanaoseioque t f

negativo :: Float -> Bool
negativo x = if x < 0 then True else False

positivo :: Float -> Bool
positivo x = if x > 0 then True else False

zero :: Float -> Bool
zero x = if x == 0 then True else False


funcaoFiltro :: [Float] -> (Float -> Bool) -> [Float]
funcaoFiltro [] _ = []
funcaoFiltro (h:t) f = if f h == True then h:funcaoFiltro t f else funcaoFiltro t f 