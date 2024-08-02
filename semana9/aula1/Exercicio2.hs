module Exercicio2 where

calculaFibonacci :: Int -> Int
calculaFibonacci 0 = 0
calculaFibonacci 1 = 1
calculaFibonacci x = calculaFibonacci (x-2) + calculaFibonacci (x-1)

calculaNumDig :: Int -> Int
calculaNumDig 0 = 0
calculaNumDig x = 1 + calculaNumDig (div x 10)

calculaSoma :: Integer -> Integer
calculaSoma 0 = 0
calculaSoma x = mod x 10 + calculaSoma (div x 10)