module Exercicio1 where

ehDeMaior :: Int -> String
ehDeMaior idade = if idade >= 18 
    then "Sim"
    else "Nao"

ehDeMaiorGuarda :: Int -> String
ehDeMaiorGuarda idade
    | idade >= 18 = "Sim"
    | otherwise = "Nao"

dizSinal :: Int -> String
dizSinal n = if n < 0
    then "Negativo"
    else 
        if n > 0
            then "Positivo"
            else "Zero"

dizSinalGuarda :: Int -> String
dizSinalGuarda n
    | n < 0 = "Negativo"
    | n > 0 = "Positivo"
    | otherwise = "Zero"

ehBissexto :: Int -> Bool
ehBissexto ano = 
    if mod ano 4 == 0
    then
        if mod ano 400 == 0
        then True
        else
            if mod ano 100 == 0
            then False
            else True
    else False

ehBissextoTeste :: Int -> Bool
ehBissextoTeste`` ano = teste
    where
        quatrocentos = mod ano 400
        cem = mod ano 100
        quatro = mod ano 4
        teste = if quatrocentos == 0
        then True
        else 
            if cem == 0
            then False
            else
                if quatro == 0
                then True
                else False

ehBissextoGuarda :: Int -> Bool
ehBissextoGuarda ano
    | quatrocentos == 0 = True
    | cem == 0 = False
    | quatro == 0 = True
    | otherwise = False
    where
        quatrocentos = mod ano 400
        cem = mod ano 100
        quatro = mod ano 4
