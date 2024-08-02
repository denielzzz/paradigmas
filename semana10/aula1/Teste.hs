module Teste where

func :: (Int, (Int, Int)) -> Int
func (1, a) = fst a + snd a
func (2, a) = fst a - snd a
func _ = 0

quadrado :: Int -> Int
quadrado x = x*x

cubo :: Int -> Int
cubo x = x*x*x

mapTeste :: (Int -> Int) -> [Int] -> [Int]
mapTeste _ [] = []
mapTeste f (h:t) = f h : mapTeste f t